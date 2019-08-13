package com.task.automation.exceptions.main;

import java.util.ArrayList;

public class Faculty {
    private String name;
    private ArrayList<Group> groups;

    public ArrayList<Group> getGroup() {return groups;}
    public String getName() {return name;}

    public Faculty(String name) {
        this.name = name;
        this.groups=new ArrayList<Group>();
    }

    public void addGroup(Group newGroup) {
        groups.add(newGroup);
    }

    public double calculationOfTheAverageScoreForASpecificSubjectInACertainGroupAtACertainFaculty
            (String selectedDiscipline, String selectedGroup) {
        double score = 0;
        for (Group group:groups) {
            if (group.getName()==selectedGroup) {
                for (Student student:group.getStudents()) {
                    for (Discipline discipline:student.getDisciplines()) {
                        if (discipline.getName()==selectedDiscipline) {
                            for (Integer mark:discipline.getMarks()) {
                                score+=mark;
                            }
                            score/=discipline.getMarks().size();
                        }
                    }
                }
            }
        }
        return score;
    }
}
