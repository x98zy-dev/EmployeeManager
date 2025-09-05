package org.example;

import java.util.ArrayList;

public class PersonalManager {
    DepartmentManager departmentManager = new DepartmentManager();
    ArrayList <String> managers = new ArrayList<>();
    ArrayList <String> employees = new ArrayList<>();

    void addManager (String[] line){
        departmentManager.addDepartment(line[4]);

    }

    void addEmployee(String[] line) {

    }
}
