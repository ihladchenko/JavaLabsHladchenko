package edu.ntudp.fit.hladchenko.controller;

import edu.ntudp.fit.hladchenko.model.Sex;
import edu.ntudp.fit.hladchenko.model.Student;

public class StudentCreator {

    public Student createStudent(String name, String surname, String patronymic, Sex sex) {
        return new Student(name, surname, patronymic, sex);
    }
}
