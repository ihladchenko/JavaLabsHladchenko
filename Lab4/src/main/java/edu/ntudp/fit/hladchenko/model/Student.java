package edu.ntudp.fit.hladchenko.model;

public class Student extends Human {

    private Group group;

    public Student(String name, String surname, String patronymic, Sex sex, Group group) {
        super(name, surname, patronymic, sex);
        this.group = group;
    }

    public Student(String name, String surname, String patronymic, Sex sex) {
        super(name, surname, patronymic, sex);
    }

    public Group getGroup() {
        return this.group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group=" + group +
                '}';
    }

}
