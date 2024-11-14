package com.example.bancoapp.client;

import org.springframework.format.annotation.NumberFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import javax.persistence.*;
import javax.validatioion.contraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class client {
    private Long id;

    @NotBlank(message = "client Name is required.")
    @Size(min = 3, max = 50, message = "Client name must be between 3 and 50 characters.")
    @Columm(name = "name", nullable = false,length = 50)
    private String name;

    @NotBlank(message = "client Email is required.")
    @Size(min = 5, max = 100, message = "Client email must be between 5 and 100 characters.")
    @Column(name = "email", nullable = false, length = 100)
    private String email;

    @NotBlank(message = "client password is required.")
    @Size(min = 5, max = 100, message = "Client password must be between 5 and 100 characters.")
    @Column(name = "password", nullable = false, length = 100)
    private String password;

    @NumberFormat(style=NumberFormat.Style.CURRENCY,pattern="#,##0.00")
    @Column(name = "balance", nullable = false, ColummDefinition = "DECIMAL(7,2) DEFAULT 0.00")
    private float balance;


protected Client(){

}

protected Client(long id, String name, String email, String password, float balance) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
    this.balance = balance;
}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getName() {
    return name;    
}

public void setName(String name) {
    this.name = name;
}

public String getEmail() {
    return email;    
}   

public void setEmail(String email) {
    this.email = email; 
}

public String getPassword() {
    return password;    
}

public void setPassword(String password) {
    this.password = password; 
}

public float getBalance() {
    return balance;    
}

public void setBalance(float balance) {
    this.balance = balance; 
}









}