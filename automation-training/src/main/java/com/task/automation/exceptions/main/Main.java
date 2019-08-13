package com.task.automation.exceptions.main;

import com.task.automation.exceptions.main.exception.*;

public class Main {
    public static void main( String[] args ) {
        University university = new University("GSTU");
        Faculty faculty = new Faculty("FAAIS");
//        Group group = new Group("IP");
//        Student student = new Student("Pamagiti");
          Discipline discipline = new Discipline("IGI");
//        university.addFaculty(faculty);
//        faculty.addGroup(group);
//        group.addStudent(student);
//        student.addDiscipline(discipline);
        try {
            discipline.addMark(10);
            university.calculationOfTheAverageScoreForASpecificSubjectInACertainGroupAtACertainFaculty
                    ("IGI", "IP", "FAAIS");
        } catch (OutOfRangeOfAcceptableMarkValuesException e) {
            System.err.println(e.getMessage());
        } catch (LackOfFacultyException e) {
            System.err.println(e.getMessage());
        } catch (LackOfGroupException e) {
            System.err.println(e.getMessage());
        } catch (LackOfDisciplineException e) {
            System.err.println(e.getMessage());
        } catch (LackOfStudentsInTheGroupException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(university);

    }
}
