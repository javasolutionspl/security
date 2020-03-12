/**
 * ------------------------------------------------------------
 * Copyright (c) PUMA SE
 * This software is the proprietary information of PUMA SE
 * All Right Reserved.
 * ------------------------------------------------------------
 */
package com.javasolutionspl.BankApp;

import com.javasolutionspl.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.security.Principal;

/**
 * @author PUMA SE
 * @copyright Copyright (c) PUMA SE
 */
@Controller
public class BankController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/")
    public String get(Principal principal, Model model) {

        String loggedUser = principal.getName();
        model.addAttribute("amount", accountService.getAmountForUser(loggedUser));
        model.addAttribute("sendMoneyDetails", new SendMoneyDetails());

        return "bank";
    }

    @PostMapping("/")
    public String post(@ModelAttribute("sendMoneyDetails") SendMoneyDetails sendMoneyDetails, Principal principal, Model model) {

        String loggedUser = principal.getName();
        accountService.sendMoney(loggedUser, sendMoneyDetails.getUserName(), sendMoneyDetails.getAmount());
        model.addAttribute("amount", accountService.getAmountForUser(loggedUser));

        return "bank";
    }
}
