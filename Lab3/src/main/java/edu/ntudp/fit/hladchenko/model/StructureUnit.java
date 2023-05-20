package edu.ntudp.fit.hladchenko.model;

public abstract class StructureUnit {
    private String name;
    private Human headOfUnit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHeadOfUnit() {
        return headOfUnit;
    }

    public void setHeadmaster(Human headOfUnit) {
        this.headOfUnit = headOfUnit;
    }
}
