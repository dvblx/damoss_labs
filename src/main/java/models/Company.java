package models;

import java.util.Date;
import java.util.UUID;

public class Company {
    private UUID id;
    //private Person person;
    private OrgLegForm orgLegForm;
    private OrgRegistration orgRegistration;
    private String nameFull;
    private String nameShort;
    private int numberReg;
    private Date dateRegistered;

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

    public Date getDateRegistered() {return dateRegistered;}

    public void setDateRegistered(Date dateRegistered) {this.dateRegistered = dateRegistered;}
}
