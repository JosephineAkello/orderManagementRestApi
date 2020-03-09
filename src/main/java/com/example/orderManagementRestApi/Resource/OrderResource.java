package com.example.orderManagementRestApi.Resource;

import com.example.orderManagementRestApi.domain.Order;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.springframework.hateoas.RepresentationModel;



public class OrderResource extends RepresentationModel {

    @JsonUnwrapped
    private Order order;

    private final long id;
    private  final String description;
    private final long costInCents;
    private final boolean isComplete;

    public  OrderResource(Order order){
        id = order.getId();
        description = order.getDescription();
        costInCents = order.getCostInCents();
        isComplete = order.isComplete();
    }

    @JsonProperty("id")
    public  Long getResourceId() {
        return id;
    }

    public String getDescription(){
        return description;
    }

    public  long getCostInCents(){
        return costInCents;
    }

    public boolean isComplete(){
        return isComplete;
    }

}
