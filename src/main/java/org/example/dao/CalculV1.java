package org.example.dao;

import org.springframework.stereotype.Component;



@Component("calcul1")
public class CalculV1 implements Icalcul{
    @Override
    public double getValue() {
        double d=100;
        System.out.println("version 1");
        return d;
    }

}
