package com.task.automation.exceptions.main;

import com.task.automation.exceptions.main.exception.*;

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
                            result.append(mark).append("\t");
                        }
                        result.append("\n");
                    }
                }
            }
        }
        return result.toString();
    }

    public double calculationOfTheAverageScoreForASpecificSubjectInACertainGroupAtACertainFaculty
            (String selectedDiscipline, String selectedGroup, String selectedFaculty) throws
            LackOfFacultyInTheUniversityException, LackOfGroupAtTheFacultyException, LackOfStudentsInTheGroupException, LackOfDisciplineOnTheStudentException {
        double score = 0;
        if (faculties.size() != 0) {
            for (Faculty faculty:faculties) {
                if (faculty.getName() == selectedFaculty) {
                    if (faculty.getGroup().size() != 0){
                        for (Group group:faculty.getGroup()) {
                            if(group.getName() == selectedGroup) {
                                if (group.getStudents().size() != 0) {
                                    for (Student student:group.getStudents()) {
                                        if (student.getDisciplines().size() != 0) {
                                            for (Discipline discipline:student.getDisciplines()) {
                                                if (discipline.getName() == selectedDiscipline) {
                                                    if (discipline.getMarks().size() != 0) {
                                                        for (Integer mark:discipline.getMarks()) {
                                                            score+=mark;
                                                        }
                                                    } else return 0;
                                                    score /= discipline.getMarks().size();
                                                } else return -1;
                                            }
                                            return score;
                                        } else throw new LackOfDisciplineOnTheStudentException
                                                ("Student " + student.getName() + " hasn't discipline");
                                    }
                                } else throw new LackOfStudentsInTheGroupException
                                        ("Lack of student in " + group.getName() + " group");
                            } else return -1;
                        }
                    } else throw new LackOfGroupAtTheFacultyException("Lack of group in "+faculty.getName() + " faculty");
                } else return -1;
            }
        } else throw new LackOfFacultyInTheUniversityException("Lack of faculty in this university.");

        return (-1);
    }

    public double calculationAverageScoreForADisciplineForTheWholeUniversity(String selectedDiscipline) throws
            LackOfFacultyInTheUniversityException, LackOfGroupAtTheFacultyException,
            LackOfStudentsInTheGroupException, LackOfDisciplineOnTheStudentException {
        double score = 0;
        if (faculties.size() != 0) {
            for (Faculty faculty:faculties) {
                if (faculty.getGroup().size() != 0){
                    for (Group group:faculty.getGroup()) {
                        if (group.getStudents().size() != 0) {
                            for (Student student:group.getStudents()) {
                                if (student.getDisciplines().size() != 0) {
                                    for (Discipline discipline:student.getDisciplines()) {
                                        if (discipline.getName() == selectedDiscipline) {
                                            if (discipline.getMarks().size() != 0) {
                                                for (Integer mark:discipline.getMarks()) {
                                                    score+=mark;
                                                }
                                            } else return 0;
                                            score /= discipline.getMarks().size();
                                        }else return -1;
                                    }
                                    return score;
                                } else throw new LackOfDisciplineOnTheStudentException
                                        ("Student " + student.getName() + " hasn't discipline");
                            }
                        } else throw new LackOfStudentsInTheGroupException
                                ("Lack of student in " + group.getName() + " group");
                    }
                } else throw new LackOfGroupAtTheFacultyException("Lack of group in "+faculty.getName() + " faculty");
            }
        } else throw new LackOfFacultyInTheUniversityException("Lack of faculty in this university.");

        return -1;
    }

    public double calculationAverageScoreForStudent(String selectedStudent) throws
            LackOfFacultyInTheUniversityException, LackOfGroupAtTheFacultyException,
            LackOfStudentsInTheGroupException, LackOfDisciplineOnTheStudentException {
        double score = 0;
        int studentCounter = 0;
        if (faculties.size() != 0) {
            for (Faculty faculty:faculties) {
                if (faculty.getGroup().size() != 0){
                    for (Group group:faculty.getGroup()) {
                        if (group.getStudents().size() != 0) {
                            for (Student student:group.getStudents()) {
                                if (student.getName() == selectedStudent) {
                                    if (student.getDisciplines().size() != 0) {
                                        for (Discipline discipline:student.getDisciplines()) {
                                            score+=discipline.getMarks().get(studentCounter);
                                        }
                                        score /= student.getDisciplines().size();
                                        return score;
                                    } else throw new LackOfDisciplineOnTheStudentException
                                            ("Student " + student.getName() + " hasn't discipline");
                                }
                                studentCounter++;
                            }
                        } else throw new LackOfStudentsInTheGroupException
                                ("Lack of student in " + group.getName() + " group");
                    }
                } else throw new LackOfGroupAtTheFacultyException("Lack of group in "+faculty.getName() + " faculty");
            }
        } else throw new LackOfFacultyInTheUniversityException("Lack of faculty in this university.");

        return (-1);
    }
}
