package com.firstapplication.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired
    @Qualifier("desktop")
    private Computer com;

    public void build(){
        com.compile();

        System.out.println("Building the project");
    }
}
