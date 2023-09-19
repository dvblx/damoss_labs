package Models.LegalEntities;

import java.time.LocalDate;
import java.util.UUID;

public class Company {
    private UUID id;
    //private Person person;
    private OrgLegForm orgLegForm;
    private OrgRegistration orgRegistration;
    private String nameFull;
    private String nameShort;
    private int numberReg;
    private LocalDate dateRegistered;

    public UUID getId() {return id;}

    public void setId(UUID id) {this.id = id;}

    // public Person getPerson() {return person;}

    // public void setPerson(Person person) {this.person = person;}

    public OrgLegForm getOrgLegForm() {return orgLegForm;}

    public void setOrgLegForm(OrgLegForm orgLegForm) {this.orgLegForm = orgLegForm;}

    public OrgRegistration getOrgRegistration() {return orgRegistration;}

    public void setOrgRegistration(OrgRegistration orgRegistration) {this.orgRegistration = orgRegistration;}

    public String getNameFull() {return nameFull;}

    public void setNameFull(String nameFull) {this.nameFull = nameFull;}

    public String getNameShort() {return nameShort;}

    public void setNameShort(String nameShort) {this.nameShort = nameShort;}

    public int getNumberReg() {return numberReg;}

    public void setNumberReg(int numberReg) {this.numberReg = numberReg;}

    public LocalDate getDateRegistered() {return dateRegistered;}

    public void setDateRegistered(LocalDate dateRegistered) {this.dateRegistered = dateRegistered;}

    public Company(UUID id, OrgLegForm orgLegForm, OrgRegistration orgRegistration, String nameFull, String nameShort, int numberReg, LocalDate dateRegistered) {
        this.id = id;
        this.orgLegForm = orgLegForm;
        this.orgRegistration = orgRegistration;
        this.nameFull = nameFull;
        this.nameShort = nameShort;
        this.numberReg = numberReg;
        this.dateRegistered = dateRegistered;
    }
    public Company(UUID id, String nameFull, String nameShort, int numberReg, LocalDate dateRegistered) {
        this.id = id;
        this.nameFull = nameFull;
        this.nameShort = nameShort;
        this.numberReg = numberReg;
        this.dateRegistered = dateRegistered;
    }
}
