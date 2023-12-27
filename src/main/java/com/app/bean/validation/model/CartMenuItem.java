package com.app.bean.validation.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CartMenuItem {

    @NotNull(message = "baseProductId field is missing")
    @Size(min = 1, message = "baseProductId field is empty")
    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "baseProductId field must have Alphanumeric Characters")
    private String baseProductId;

    @NotNull(message = "name field is missing")
    @Size(min = 1, message = "name field is empty")
    private String name;
}
