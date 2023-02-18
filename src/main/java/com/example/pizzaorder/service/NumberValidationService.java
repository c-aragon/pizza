package com.example.pizzaorder.service;

import org.springframework.beans.factory.annotation.Value;

public interface NumberValidationService {

    boolean isNumberValid(String number);

}
