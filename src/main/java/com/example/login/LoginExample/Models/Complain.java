package com.example.login.LoginExample.Models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "complain")
public class Complain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Size(max = 140)
    private String complain;

    public Complain(String complain,  long complainer, long toWhoom, LocalDate date) {
        this.complain = complain;
        this.complainer = complainer;
        this.toWhoom = toWhoom;
        this.date = date;
    }

    public Complain() {

    }

    @NotNull
    private long complainer;

    @NotNull
    private long toWhoom;

    @Column(name = "CREATED_DATE")
    LocalDate date;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComplain() {
        return complain;
    }

    public void setComplain(String complain) {
        this.complain = complain;
    }

    public long getComplainer() {
        return complainer;
    }

    public void setComplainer(long complainer) {
        this.complainer = complainer;
    }

    public long getToWhoom() {
        return toWhoom;
    }

    public void setToWhoom(long toWhoom) {
        this.toWhoom = toWhoom;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }


}
