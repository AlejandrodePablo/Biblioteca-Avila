package com.adpc.biblioteca;

public class User {
    private String name;
    public String surname;
    public Integer telephone;
    public String dni;
    public String adress;
    public String poblation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getPoblation() {
        return poblation;
    }

    public void setPoblation(String poblation) {
        this.poblation = poblation;
    }
}
