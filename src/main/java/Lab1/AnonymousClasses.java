package Lab1;

import Models.LegalEntities.ClientType;
import Models.LegalEntities.Company;
import Models.LegalEntities.Person;

import java.time.LocalDate;
import java.util.UUID;

public class AnonymousClasses {
    public static void main(String[] args) {
        Person person1 = new Person(UUID.randomUUID(), UUID.randomUUID(), 123, ClientType.individualPerson, LocalDate.now());
        Person person2 = new Person(UUID.randomUUID(), UUID.randomUUID(), 12345, ClientType.legalPerson, LocalDate.now());
        Company company = new Company(UUID.randomUUID(), "NameFull", "NameShort", 123456, LocalDate.now());
        contractConclusion(person2, company);
    }
    public static void contractConclusion(Person person, Company company){
        PersonAndCompanyDeal contractForPerson = new PersonAndCompanyDeal() {
            public void contractConclusion(Person person, Company company) {
                System.out.println("Заключен договор между компанией " + company.getNameFull() + " и клиентом " +
                        person.getITN()+ ", являющимся физическим лицом");
            }
        };
        PersonAndCompanyDeal contractForLegalPerson = new PersonAndCompanyDeal() {
            public void contractConclusion(Person person, Company company) {
                System.out.println("Заключен договор между компанией " + company.getNameFull() + " и клиентом " +
                        person.getITN()+ ", являющимся юридическим лицом");
            }
        };
        if (person.getClientType().equals(ClientType.individualPerson))
            contractForPerson.contractConclusion(person, company);
        else
            contractForLegalPerson.contractConclusion(person, company);
    }
}
