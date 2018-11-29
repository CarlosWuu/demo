package com.example.demo.dao.vo;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

/**
 * Created by carloswuu on 2018/8/15.
 */
@Entity
@Table(name = "productorInfo")
public class ProductInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "productName")
    private String productName;

    @Column(name = "custId")
    private int custId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }
}
