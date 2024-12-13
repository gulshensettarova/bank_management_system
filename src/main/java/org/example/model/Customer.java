package org.example.model;

import java.util.Date;
import java.util.Set;

public class Customer {
    private long id;
    private String name;
    private String surname;
    private String birthdate;
    private Set<Account> accounts;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }


    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccount(Account account) {
        this.accounts.add(account);
    }

    public Customer(){

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
