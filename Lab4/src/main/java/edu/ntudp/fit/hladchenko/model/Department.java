package edu.ntudp.fit.hladchenko.model;

import java.util.ArrayList;
import java.util.List;

public class Department extends StructureUnit {

    private String name;
    private Human headOfUnit;
    private List<Group> groups;

    public Department(String name, Human headOfUnit) {
        this.name = name;
        this.headOfUnit = headOfUnit;
        this.groups = new ArrayList();
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
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

    public Human getHead() {
        return this.headOfUnit;
    }

    public void addGroup(Group group) {
        this.groups.add(group);
    }

    public List<Group> getGroups() {
        return this.groups;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", headOfUnit=" + headOfUnit +
                ", groups=" + groups +
                '}';
    }
}
