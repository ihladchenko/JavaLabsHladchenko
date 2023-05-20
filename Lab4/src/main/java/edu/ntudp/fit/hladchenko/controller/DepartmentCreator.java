package edu.ntudp.fit.hladchenko.controller;

import edu.ntudp.fit.hladchenko.model.Department;
import edu.ntudp.fit.hladchenko.model.Human;

public class DepartmentCreator {

    public Department createDepartment(String name, Human headOfUnit) {
        return new Department(name, headOfUnit);
    }
}
