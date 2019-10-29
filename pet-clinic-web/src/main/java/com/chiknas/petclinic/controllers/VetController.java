package com.chiknas.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author nkukn - created on 29-Oct-19 10:18 PM
 */
@Controller
public class VetController {

    @GetMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets(){
        return "vets/index";
    }
}
