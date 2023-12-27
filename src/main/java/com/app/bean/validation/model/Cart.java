package com.app.bean.validation.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class Cart {


    @NotNull
    private String storeId;
    private double amount;
    private int quantity;
    @NotEmpty
    private List<String> cartPromotions;

    /*
    Here valid is required because we have to perform validation on CartMenuItems as well,
    then cartMenuItem's all jakarta validation will work for cart.
     */
    @Valid
    private List<CartMenuItem> cartMenuItems;

}
