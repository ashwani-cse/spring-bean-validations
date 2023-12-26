package com.app.bean.validation.controller;

import com.app.bean.validation.model.Cart;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/cart")
@RestController
public class CartController {

    @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Cart> createCart(
            @Valid @RequestBody Cart cart,
            @RequestHeader("affiliate")
            @Pattern(regexp = "^[a-zA-Z]{1,3}$") String affiliate) {
        log.info("Cart received for creation {}", cart);
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }
}
