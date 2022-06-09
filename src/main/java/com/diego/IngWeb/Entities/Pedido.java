package com.diego.IngWeb.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class Pedido {
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

    @Column(name = "product", nullable = true)
    private String product;

    @Column(name = "address", nullable = true)
    private String address;

    @Column(name = "quantity", nullable = true)
    private Integer quantity;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
