package net.yorksolutions.shopiflystorebackend.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Account {
    @Id
    public UUID id;
    public String email;
    public String firstName;
    public String lastName;
    public String password;

}
