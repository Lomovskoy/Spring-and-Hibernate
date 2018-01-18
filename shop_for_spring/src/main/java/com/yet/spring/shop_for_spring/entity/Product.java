package com.yet.spring.shop_for_spring.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 *
 * @author imxo
 */
@Entity
public class Product implements Serializable {

    private Integer id;
    private String nameProduct;
    private Integer availableProduct;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Size(max = 50)
    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public Integer getAvailableProduct() {
        return availableProduct;
    }

    public void setAvailableProduct(Integer availableProduct) {
        this.availableProduct = availableProduct;
    }
}
