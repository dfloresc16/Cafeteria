package com.diego.IngWeb.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Reservacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "cellphone", nullable = false)
    private String cellphone;

    @Column(name = "noPeople", nullable = false)
    private String noPeople;

    @Column(name = "schedule", nullable = false)
    private Date schedule;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
