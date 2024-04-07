package com.mtec.crud;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {

        @GetMapping("/")
        public String hola(){
            return "Hola mundooooooooooooooooooooooo";
        }

}
