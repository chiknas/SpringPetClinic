package com.chiknas.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author nkukn - created on 29-Oct-19 10:07 PM
 */
@Controller
public class IndexController {

    @GetMapping({"/", "", "/index", "/index.html"})
    public String index(){
        return "index";
    }

    @GetMapping("/oups")
    public String getErrorPage(){
        return "error";
    }
}
