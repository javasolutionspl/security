/**
 * ------------------------------------------------------------
 * Copyright (c) PUMA SE
 * This software is the proprietary information of PUMA SE
 * All Right Reserved.
 * ------------------------------------------------------------
 */
package com.javasolutionspl.AtackApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author PUMA SE
 * @copyright Copyright (c) PUMA SE
 */
@Controller
public class AttackController {

    @GetMapping("/")
    public String get() {

        return "home";
    }
}
