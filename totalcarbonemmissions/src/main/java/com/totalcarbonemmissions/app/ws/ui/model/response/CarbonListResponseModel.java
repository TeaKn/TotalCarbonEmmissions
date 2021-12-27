package com.totalcarbonemmissions.app.ws.ui.model.response;


import java.util.List;

public class CarbonListResponseModel {

    private List<CarbonResponseModel> carbonFood;

    public List<CarbonResponseModel> getCarbonFood() {
        return carbonFood;
    }

    public void setCarbonFood(List<CarbonResponseModel> carbonFood) {
        this.carbonFood = carbonFood;
    }
}
