package Models.LegalEntities;

import java.time.LocalDate;
import java.util.UUID;

public class Person {
    private UUID id;
    private UUID cipher;
    private int ITN;
    private ClientType clientType;
    private LocalDate dateRegistered;

    public UUID getId() {return id;}

    public void setId(UUID id) {this.id = id;}

    public UUID getCipher() {return cipher;}

    public void setCipher(UUID cipher) {this.cipher = cipher;}

    public int getITN() {return ITN;}

    public void setITN(int ITN) {this.ITN = ITN;}

    public ClientType getClientType() {return clientType;}

    public void setClientType(ClientType clientType) {this.clientType = clientType;}

    public LocalDate getDateRegistered() {return dateRegistered;}

    public void setDateRegistered(LocalDate dateRegistered) {this.dateRegistered = dateRegistered;}

    public Person(UUID id, UUID cipher, int ITN, ClientType clientType, LocalDate dateRegistered) {
        this.id = id;
        this.cipher = cipher;
        this.ITN = ITN;
        this.clientType = clientType;
        this.dateRegistered = dateRegistered;
    }
}
