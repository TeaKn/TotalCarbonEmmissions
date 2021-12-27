package com.totalcarbonemmissions.app.ws.ui.model.request;

public class FoodRequestModel {

    private String food;
    private Float quantity;

    public FoodRequestModel(String food, Float quantity) {
        this.food = food;
        this.quantity = quantity;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String name) {
        this.food = name;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }
}
