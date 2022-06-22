package com.example.imperial;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Implementation i = new Implementation();

    @RequestMapping("/stoneToKilogram")
    public double stoneToKilogram(@RequestParam double st){
        return i.stoneToKilogram(st);
    }

}
