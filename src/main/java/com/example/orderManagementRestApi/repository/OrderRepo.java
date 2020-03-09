package com.example.orderManagementRestApi.repository;

import com.example.orderManagementRestApi.domain.Order;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepo extends InMemoryRepo<Order>{

    protected void updateIfExists(Order original, Order updated){
        original.setDescription(updated.getDescription());
        original.setCostInCents(updated.getCostInCents());
        original.setComplete(updated.isComplete());
    }

}
