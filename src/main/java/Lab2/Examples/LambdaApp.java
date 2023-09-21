package Lab2.Examples;

public class LambdaApp {

    static int x = 10;
    static int y = 20;

    public static void main(String[] args) {
        Operationable op = new Operationable(){
            public int calculate(int x, int y){
                return x + y;
            }
        };
        int z = op.calculate(20, 10);
        System.out.println(z); // 30

        int n=70;
        int m=30;
        Operation op2 = ()->{
            //n=100; - так нельзя сделать
            return m+n;
        };
        // n=100; - так тоже нельзя
        System.out.println(op2.calculate());

        Operationable operation1 = (int x, int y)-> x + y;
        Operationable operation2 = (int x, int y)-> x - y;
        Operationable operation3 = (int x, int y)-> x * y;

        System.out.println(operation1.calculate(20, 10));
        System.out.println(operation2.calculate(20, 10));
        System.out.println(operation3.calculate(20, 10));

        Printable printer = s->System.out.println(s);
        printer.print("Hello Java!");

        OperationableGeneric<Integer> operationableGeneric1 = (x, y)-> x + y;
        OperationableGeneric<String> operationableGeneric2 = (x, y) -> x + y;
        System.out.println(operationableGeneric1.calculate(20, 10)); //30
        System.out.println(operationableGeneric2.calculate("20", "10")); //2010


        Operation operation = ()->{
            x=30;
            return x+y;
        };
        System.out.println(operation.calculate()); // 50
        System.out.println(x);

        Operationable operation4 = (int x, int y)-> {
            if(y==0)
                return 0;
            return x/y;
        };
        System.out.println(operation4.calculate(20, 10)); //2
        System.out.println(operation4.calculate(20, 0)); //0

        int[] nums = { -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        // ExpressionHelper exprHelper = new ExpressionHelper();
        System.out.println(sum(nums, ExpressionHelper::isEven)); // 0

        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("Tom");
        System.out.println(user.getName());

        Operation2 func = action(1);
        int a = func.execute(6, 5);
        System.out.println(a); // 11

        int b = action(2).execute(8, 2);
        System.out.println(b);


    }
    private static int sum (int[] numbers, Expression func)
    {
        int result = 0;
        for(int i : numbers)
        {
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }

    private static Operation2 action(int number){
        return switch (number) {
            case 1 -> (x, y) -> x + y;
            case 2 -> (x, y) -> x - y;
            case 3 -> (x, y) -> x * y;
            default -> (x, y) -> 0;
        };
    }
}


