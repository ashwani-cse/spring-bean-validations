package com.app.bean.validation.model;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class Cart {


    @NotNull
    private String productName;
    private double amount;
    private int quantity;

}
