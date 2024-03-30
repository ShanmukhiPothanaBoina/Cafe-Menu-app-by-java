package com.example.cafeapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class cafemenuController {
    @FXML
    private Label cake1, cake2, pastry1, pastry2, sandwitch1, sandwitch2, Tea, Coffee;;
    public void initialize() {
        cake1.setText("Chocolate Brownie : ₹ 250.0 per pound");
        cake2.setText("Chocolate Maple : ₹ 300.0 per pound");
        pastry1.setText("Black Forest : ₹ 35.0 per piece");
        pastry2.setText("Choco Truffle : ₹ 40.0 per piece");
        sandwitch1.setText("Chicken Sandwitch : ₹ 150 per piece ");
        sandwitch2.setText("Veg Sandwitch : ₹ 90 per piece");
        Tea.setText("Green Tea : ₹ 60");
        Coffee.setText("Black coffee : ₹ 75");



    }
}

