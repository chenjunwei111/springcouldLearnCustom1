package com.example.springcouldcus1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestOrderController {

    @RequestMapping("orderTest")
    public String orderTest(){
        return "this is order";
    }
}
