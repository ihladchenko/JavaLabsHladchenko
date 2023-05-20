package edu.ntudp.fit.hladchenko.controller;

import edu.ntudp.fit.hladchenko.model.Human;
import edu.ntudp.fit.hladchenko.model.University;

public class UniversityCreator {

    public University createUniversity(String name, Human headOfUnit) {
        return new University(name, headOfUnit);
    }
}
