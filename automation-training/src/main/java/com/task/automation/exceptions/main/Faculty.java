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
}
