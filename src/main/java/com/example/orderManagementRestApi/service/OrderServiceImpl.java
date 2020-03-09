package com.example.orderManagementRestApi.service;

import org.springframework.hateoas.service.Identifiable;

public interface OrderServiceImpl extends Identifiable<Long> {
    public void setId(Long id);
}
