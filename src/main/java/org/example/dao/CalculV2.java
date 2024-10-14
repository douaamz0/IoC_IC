package org.example.dao;

import org.springframework.stereotype.Component;


public class CalculV2 implements Icalcul{
    @Override
    public double getValue() {
        double d =150;
        System.out.println("version 2");
        return d;
    }
}
