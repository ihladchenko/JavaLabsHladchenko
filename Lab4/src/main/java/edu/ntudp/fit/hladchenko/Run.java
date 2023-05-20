package edu.ntudp.fit.hladchenko;

import edu.ntudp.fit.hladchenko.controller.*;
import edu.ntudp.fit.hladchenko.model.*;

public class Run {

        public static void main(String[] args) {
            University oldUniversity = Run.createTypicalUniversity();
            JsonManager.SaveToFile(oldUniversity, "oldUniversity.json");
            University newUniversity = JsonManager.ReadFromFile("oldUniversity.json");
        }

        public static University createTypicalUniversity() {

            UniversityCreator universityCreator = new UniversityCreator();
            FacultyCreator facultyCreator = new FacultyCreator();
            DepartmentCreator departmentCreator = new DepartmentCreator();
            GroupCreator groupCreator = new GroupCreator();
            StudentCreator studentCreator = new StudentCreator();

            Human headOfUniversity = new Human("Ihor", "Hladchenko", "Alexandrovich", Sex.MALE);
            Human headOfFaculty = new Human("Ihor", "Hladchenko", "Alexandrovich", Sex.MALE);
            Human headOfDepartment = new Human("Tatiana", "Petrova", "Olegovna", Sex.FEMALE);

            University university = universityCreator.createUniversity("Cambridge", headOfUniversity);

            Faculty faculty = facultyCreator.createFaculty("FIT", headOfFaculty);
            university.addFaculty(faculty);

            Department department = departmentCreator.createDepartment("IT-Engineering", headOfDepartment);
            faculty.addDepartment(department);

            Group group = groupCreator.createGroup("Java Programming");
            department.addGroup(group);

            Student studentOne = studentCreator.createStudent("Nikolay", "Petrov", "Artemovich", Sex.MALE);
            Student studentSecond = studentCreator.createStudent("Charlie", "Britney", "Johnson", Sex.MALE);
            group.addStudent(studentOne);
            group.addStudent(studentSecond);

            System.out.println(university);
            System.out.println(faculty);
            System.out.println(department);
            System.out.println(group);

            System.out.println(studentOne);
            System.out.println(studentSecond);

            return university;
        }

}
