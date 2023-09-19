package Lab2;

import Models.LegalEntities.ClientType;
import Models.LegalEntities.Company;
import Models.LegalEntities.Person;

import java.time.LocalDate;
import java.util.UUID;

public class LambdaExpressions {
    public static void main(String[] args){
        Person personIndividual =
                new Person(UUID.randomUUID(), UUID.randomUUID(), 123, ClientType.individualPerson, LocalDate.now());
        Person personLegal =
                new Person(UUID.randomUUID(), UUID.randomUUID(), 12345, ClientType.legalPerson, LocalDate.now());
        Company companyExample =
                new Company(UUID.randomUUID(), "NameFull", "NameShort", 123456, LocalDate.now());

        PersonAndCompanyDeal dealIndividual = (Person person, Company company) ->
                System.out.println("Заключен договор между компанией " + company.getNameFull() + " и клиентом " +
                person.getITN()+ ", являющимся физическим лицом");
        PersonAndCompanyDeal dealLegal = (Person person, Company company) ->
                System.out.println("Заключен договор между компанией " + company.getNameFull() + " и клиентом " +
                        person.getITN()+ ", являющимся юридическим лицом");

        if (personIndividual.getClientType().equals(ClientType.individualPerson))
            dealIndividual.contractConclusion(personIndividual, companyExample);
        else
            dealLegal.contractConclusion(personIndividual, companyExample);
        if (personLegal.getClientType().equals(ClientType.legalPerson))
            dealLegal.contractConclusion(personLegal, companyExample);
        else
            dealIndividual.contractConclusion(personLegal, companyExample);

    }
}
