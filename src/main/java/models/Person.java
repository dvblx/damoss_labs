package models;

import models.ClientType;

import java.util.Date;
import java.util.UUID;

public class Person {
    private UUID id;
    private UUID cipher;
    private int ITN;
    private ClientType clientType;
    private Date dateRegistered;

    public UUID getId() {return id;}

    public void setId(UUID id) {this.id = id;}

    public UUID getCipher() {return cipher;}

    public void setCipher(UUID cipher) {this.cipher = cipher;}

    public int getITN() {return ITN;}

    public void setITN(int ITN) {this.ITN = ITN;}

    public ClientType getClientType() {return clientType;}

    public void setClientType(ClientType clientType) {this.clientType = clientType;}

    public Date getDateRegistered() {return dateRegistered;}

    public void setDateRegistered(Date dateRegistered) {this.dateRegistered = dateRegistered;}
}
