package com.vikmir.springstarter.main;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Getter
@Setter
//@Component
public class Parrot {
    private String name;

//    @PostConstruct
//    public void init(){
//        this.name = "Kiki";
//    }
}
