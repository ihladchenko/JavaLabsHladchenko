package edu.ntudp.fit.hladchenko.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends StructureUnit {

    private String name;
    private Human headOfUnit;
    private List<Department> departments;

    public Faculty(String name, Human headOfUnit) {
        this.name = name;
        this.headOfUnit = headOfUnit;
        this.departments = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeadOfUnit(Human headOfUnit) {
        this.headOfUnit = headOfUnit;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }


    public Human getHeadOfUnit() {
        return this.headOfUnit;
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public List<Department> getDepartments() {
        return this.departments;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", headOfUnit=" + headOfUnit +
                ", departments=" + departments +
                '}';
    }

}
