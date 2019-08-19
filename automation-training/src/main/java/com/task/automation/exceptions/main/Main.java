package com.task.automation.exceptions.main;

import com.task.automation.exceptions.main.exception.*;

public class Main {
    public static void main( String[] args ) {
        University university = new University("GSTU");
        Faculty faculty = new Faculty("FAAIS");
        Faculty faculty1 = new Faculty("GEF");
        Group group = new Group("IP");
        Group group1 = new Group("ITP");
        Group group2 = new Group("GG");
        Student student = new Student("Pamagiti");
        Student student1 = new Student("Vasya");
        Student student2 = new Student("Petya");
        Discipline discipline = new Discipline("IGI");
        Discipline discipline1 = new Discipline("AOIP");
        Discipline discipline3 = new Discipline("Math");
        Discipline discipline4 = new Discipline("Economika");
        try {
            university.addFaculty(faculty);
            faculty.addGroup(group);
            //faculty.addGroup(group1);
            faculty1.addGroup(group2);
            group.addStudent(student);
            group.addStudent(student1);
            group2.addStudent(student2);
            student.addDiscipline(discipline);
            student.addDiscipline(discipline1);
            student.addDiscipline(discipline3);
            discipline.addMark(0);
            discipline1.addMark(0);
            discipline3.addMark(0);
            student1.addDiscipline(discipline1);
            discipline.addMark(0);

            double result = 0;

            result = university.calculationOfTheAverageScoreForASpecificSubjectInACertainGroupAtACertainFaculty
                    ("IGI", "IP", "FAAIS");
            if (result>=0) {
                System.out.println(result);
            }  else System.out.println("Error.");
            result = university.calculationAverageScoreForStudent(student.getName());
            if (result>=0) {
                System.out.println(result);
            }  else System.out.println("Error.");
            result = university.calculationAverageScoreForADisciplineForTheWholeUniversity("dfgd");
            if (result>=0) {
                System.out.println(result);
            }  else System.out.println("Error.");
        } catch (MarkOutOfBoundsException e) {
            System.err.println(e.getMessage());
        } catch (LackOfFacultyInTheUniversityException e) {
            System.err.println(e.getMessage());
        } catch (LackOfGroupAtTheFacultyException e) {
            System.err.println(e.getMessage());
        } catch (LackOfDisciplineOnTheStudentException e) {
            System.err.println(e.getMessage());
        } catch (LackOfStudentsInTheGroupException e) {
            System.err.println(e.getMessage());
        }
        System.out.println(university);

    }
}
