package Models.LegalEntities;

import java.util.UUID;

public class OrgLegForm {
    private UUID id;
    private String nameFull;
    private String nameShort;

    public UUID getId() {return id;}

    public void setId(UUID id) {this.id = id;}

    public String getNameFull() {return nameFull;}

    public void setNameFull(String nameFull) {this.nameFull = nameFull;}

    public String getNameShort() {return nameShort;}

    public void setNameShort(String nameShort) {this.nameShort = nameShort;}
}
