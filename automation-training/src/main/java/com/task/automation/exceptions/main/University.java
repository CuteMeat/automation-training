package com.task.automation.exceptions.main;

import com.task.automation.exceptions.main.exception.LackOfDisciplineException;
import com.task.automation.exceptions.main.exception.LackOfFacultyException;
import com.task.automation.exceptions.main.exception.LackOfGroupException;
import com.task.automation.exceptions.main.exception.LackOfStudentsInTheGroupException;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Faculty> faculties;

    public ArrayList<Faculty> getFaculties() {return faculties;}


    public University(String name) {
        this.name = name;
        this.faculties = new ArrayList<Faculty>();
    }

    public void addFaculty(Faculty newFaculty) {
        faculties.add(newFaculty);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Faculty faculty:faculties) {
            result.append(faculty.getName()).append("\t\n");
            for (Group group:faculty.getGroup()) {
                result.append("\t").append(group.getName());
                for (Student student:group.getStudents()) {
                    result.append("\n\t\t").append(student.getName());
                    for (Discipline discipline:student.getDisciplines()) {
                        result.append("\n\t\t\t\t").append(discipline.getName()).append(":");
                        for (Integer mark:discipline.getMarks()) {
                            result.append(discipline.getMarks());
                        }
                    }
                }
            }
        }
        return result.toString();
    }

    public double calculationOfTheAverageScoreForASpecificSubjectInACertainGroupAtACertainFaculty
            (String selectedDiscipline, String selectedGroup, String selectedFaculty) throws LackOfFacultyException,
            LackOfGroupException, LackOfStudentsInTheGroupException, LackOfDisciplineException {
        double score = 0;
        if (faculties.size() == 0) {
            throw new LackOfFacultyException("Lack of faculty in this university.");
        }
        else {
            for (Faculty faculty:faculties) {
                if (faculty.getName() == selectedFaculty){
                    if (faculty.getGroup().size() == 0) {
                        throw new LackOfGroupException("Lack of group in this faculty.");
                    }
                    else {
                        for (Group group:faculty.getGroup()) {
                            if(group.getName() == selectedGroup) {
                                if (group.getStudents().size() == 0) {
                                    throw new LackOfStudentsInTheGroupException("Lack of student in this group.");
                                }
                                else {
                                    for (Student student : group.getStudents()) {
                                        if (student.getDisciplines().size() == 0) {
                                            throw new LackOfDisciplineException("Lack of discipline.");
                                        }
                                        else {
                                            for (Discipline discipline : student.getDisciplines()) {
                                                if (discipline.getName() == selectedDiscipline) {
                                                    for (Integer mark : discipline.getMarks()) {
                                                        score += mark;
                                                    }
                                                    score /= discipline.getMarks().size();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return score;
    }

    public double calculationAverageScoreForADisciplineForTheWholeUniversity(String selectedDiscipline) throws
            LackOfFacultyException, LackOfGroupException, LackOfStudentsInTheGroupException, LackOfDisciplineException {
        double score = 0;
        if (faculties.size() == 0) {
            throw new LackOfFacultyException("Lack of faculty in this university.");
        }
        else {
            for (Faculty faculty:faculties) {
                if (faculty.getGroup().size() == 0) {
                    throw new LackOfGroupException("Lack of group in this faculty.");
                }
                else {
                    for (Group group:faculty.getGroup()) {
                        if (group.getStudents().size() == 0) {
                            throw new LackOfStudentsInTheGroupException("Lack of student in this group.");
                        }
                        else {
                            for (Student student : group.getStudents()) {
                                if (student.getDisciplines().size() == 0) {
                                    throw new LackOfDisciplineException("Lack of discipline.");
                                } else {
                                    for (Discipline discipline : student.getDisciplines()) {
                                        if (discipline.getName() == selectedDiscipline) {
                                            for (Integer mark : discipline.getMarks()) {
                                            score += mark;
                                        }
                                            score /= discipline.getMarks().size();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return score;
    }

    public double calculationAverageScoreForStudent(String selectedStudent) throws
            LackOfFacultyException, LackOfGroupException, LackOfStudentsInTheGroupException, LackOfDisciplineException {
        double score = 0;
        if (faculties.size() == 0) {
            throw new LackOfFacultyException("Lack of faculty in this university.");
        }
        else {
            for (Faculty faculty:faculties) {
                if (faculty.getGroup().size() == 0) {
                    throw new LackOfGroupException("Lack of group in this faculty.");
                }
                else {
                    for (Group group:faculty.getGroup()) {
                        if (group.getStudents().size() == 0) {
                            throw new LackOfStudentsInTheGroupException("Lack of student in this group.");
                        }
                        else {
                            for (Student student : group.getStudents()) {
                                if (student.getName() == selectedStudent) {
                                    if (student.getDisciplines().size() == 0) {
                                        throw new LackOfDisciplineException("Lack of discipline.");
                                    } else {
                                        for (Discipline discipline : student.getDisciplines()) {
                                            for (Integer mark : discipline.getMarks()) {
                                                score += mark;
                                            }
                                            score /= discipline.getMarks().size();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return score;
    }
}
