package com.example.orderManagementRestApi.domain;

import org.springframework.hateoas.service.Identifiable;

public class Order implements Identifiable {

    private Long id;
    private String description;
    private  long costInCents;
    private boolean isComplete;


    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(long cost) {
        this.costInCents = cost;
    }

    public boolean isComplete() {
        return isComplete;
    }
    
    public void markComplete() {
        setComplete(true);
    }
    public void markIncomplete() {
        setComplete(false);
    }

    public void setComplete(boolean complete) {
        this.isComplete = complete;
    }
}
