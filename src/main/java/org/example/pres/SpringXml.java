package org.example.pres;

import org.example.dao.Icalcul;
import org.example.metier.IGestion;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        Icalcul cal = context.getBean(Icalcul.class);
        System.out.println(cal.getValue());
        IGestion gestion = context.getBean(IGestion.class);
        System.out.println(gestion.calcul());
    }
}