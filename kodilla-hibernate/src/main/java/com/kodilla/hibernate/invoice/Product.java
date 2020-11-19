package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "PRODUCT")
public class Product {

    private int id;
    private String name;
    private Item item;

    public Product() {
    }

    @ManyToOne
    @JoinColumn(name = "Item_ID")
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Product(String name) {
        this.name = name;
    }


    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


}
