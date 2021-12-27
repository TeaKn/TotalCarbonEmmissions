package com.totalcarbonemmissions.app.ws.ui.model.request;

import java.util.List;

public class FoodListRequestModel {

    private List<FoodRequestModel> foods;

    public List<FoodRequestModel> getFoods() {
        return foods;
    }

    public void setFoods(List<FoodRequestModel> foods) {
        this.foods = foods;
    }
}
