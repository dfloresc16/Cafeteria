package com.diego.IngWeb.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Reservacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true)
    private Integer id;

    @Column(name = "name", nullable = true)
    private String name;

    @Column(name = "email", nullable = true)
    private String email;

    @Column(name = "cellphone", nullable = true)
    private String cellphone;

    @Column(name = "noPeople", nullable = true)
    private String noPeople;

    @Column(name = "schedule", nullable = true)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date schedule;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
