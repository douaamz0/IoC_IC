package org.example.metier;

import org.example.dao.Icalcul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("gestion")
public class Gestion implements IGestion{
    @Autowired
    @Qualifier("calcul1")
    private Icalcul cal;
    @Override
    public double calcul() {
        return cal.getValue()*10;
    }
    public void setCal(Icalcul cal){
        this.cal=cal;
    }
    public Gestion(){

    }
}
