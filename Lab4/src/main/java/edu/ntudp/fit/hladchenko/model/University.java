package edu.ntudp.fit.hladchenko.model;

import java.util.ArrayList;
import java.util.List;

public class University extends StructureUnit {

    private String name;
    private Human headOfUnit;
    private List<Faculty> faculties;

    public University(String name, Human headOfUnit) {
        this.name = name;
        this.headOfUnit = headOfUnit;
        faculties = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHeadOfUnit() {
        return headOfUnit;
    }

    public void setHeadOfUnit(Human headOfUnit) {
        this.headOfUnit = headOfUnit;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", headOfUnit=" + headOfUnit +
                ", faculties=" + faculties +
                '}';
    }

}
