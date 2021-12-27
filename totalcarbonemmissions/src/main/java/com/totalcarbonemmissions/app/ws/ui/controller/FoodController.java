package com.totalcarbonemmissions.app.ws.ui.controller;

import com.totalcarbonemmissions.app.ws.ui.model.request.FoodListRequestModel;
import com.totalcarbonemmissions.app.ws.ui.model.request.FoodRequestModel;
import com.totalcarbonemmissions.app.ws.ui.model.response.CarbonListResponseModel;
import com.totalcarbonemmissions.app.ws.ui.model.response.CarbonResponseModel;
import com.totalcarbonemmissions.app.ws.ui.model.response.TotalCarbonRest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/food") // http://localhost:8080/total-carbon-emissions/food
public class FoodController {

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List createFoodList(@RequestBody FoodListRequestModel foodDetails) throws  Exception {

        // food quantity


        //TotalCarbonRest returnValue = new TotalCarbonRest();

        System.out.println(foodDetails);

        String uri = "http://127.0.0.1:8080/v2/carbon-emissions/?food=Bananas&food=Apples";
        RestTemplate restTemplate = new RestTemplate();

        List returnValue = restTemplate.getForObject(uri, List.class);
        System.out.println(returnValue.get(0));


        return returnValue;
    }

    @PostMapping("/foodswithquantity")
    public Float returnFoodQuantity(@RequestBody FoodListRequestModel foodDetails) throws  Exception {
        return foodDetails.getFoods().get(0).getQuantity();
    }


    // rest service is the service invoked by other services
    @GetMapping(value = "/carbon-emissions")
    public FoodRequestModel getFood() {
        return new FoodRequestModel("orange", 7.0f);
    }

    // rest apis that are invoking the rest service /carbon-emissions
    @GetMapping(value = "/foods")
    private List<Object> getFoodCarbonEmissionValue() {
        String uri = "http://127.0.0.1:8080/v2/carbon-emissions/?food=Bananas&food=Apples";
        RestTemplate restTemplate = new RestTemplate();

        Object[] returnValue = restTemplate.getForObject(uri, Object[].class);

        return Arrays.asList(returnValue);

    }

}
