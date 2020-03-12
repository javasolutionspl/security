/**
 * ------------------------------------------------------------
 * Copyright (c) PUMA SE
 * This software is the proprietary information of PUMA SE
 * All Right Reserved.
 * ------------------------------------------------------------
 */
package com.javasolutionspl.service;

import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

/**
 * @author PUMA SE
 * @copyright Copyright (c) PUMA SE
 */
@Component
public class AccountService {

    private Map<String, Integer> userPerAmount = new HashMap<>();

    public AccountService() {

        userPerAmount.put("user", 1000);
        userPerAmount.put("hacker", 0);
    }

    public Integer getAmountForUser(String user) {

        return userPerAmount.get(user);
    }

    public void sendMoney(String userNameFrom, String userNameTo, int amount) {

        Integer currentFromValue = userPerAmount.get(userNameFrom);
        Integer currentToValue = userPerAmount.get(userNameTo);
        currentFromValue = currentFromValue - amount;
        currentToValue = currentToValue + amount;
        userPerAmount.put(userNameFrom, currentFromValue);
        userPerAmount.put(userNameTo, currentToValue);
    }
}
