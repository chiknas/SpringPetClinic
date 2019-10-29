package com.chiknas.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author nkukn - created on 29-Oct-19 10:21 PM
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @GetMapping({"", "/index", "/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
