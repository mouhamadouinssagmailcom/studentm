package com.memo.faslou.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private String id;
    private String name;
    private String fullname;
    private String numcall;
    private String email;
    private String adresse;
    private String niveau ;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getNumcall() {
        return numcall;
    }

    public void setNumcall(String numcall) {
        this.numcall = numcall;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }


    public Student() {
    }

    public Student(String id, String name, String fullname, String numcall, String email, String adresse, String niveau) {
        this.id = id;
        this.name = name;
        this.fullname = fullname;
        this.numcall = numcall;
        this.email = email;
        this.adresse = adresse;
        this.niveau = niveau;
    }
}
