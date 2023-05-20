package edu.ntudp.fit.hladchenko.controller;

import edu.ntudp.fit.hladchenko.model.Faculty;
import edu.ntudp.fit.hladchenko.model.Human;

public class FacultyCreator {

    public Faculty createFaculty(String name, Human headOfUnit) {
        return new Faculty(name, headOfUnit);
    }
}


