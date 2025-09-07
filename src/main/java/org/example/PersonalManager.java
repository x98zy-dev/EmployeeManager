package org.example;

import java.util.ArrayList;

public class PersonalManager {
    ArrayList<String> managers = new ArrayList<String>();
    ArrayList<String> employees = new ArrayList<String>();
    ArrayList<String> error = new ArrayList<String>();

    void addManager(String managerLine) {
        String[] parts = managerLine.split(",");
        try {
            if (parts[0].equals("Manager") && Integer.parseInt(parts[3]) > 0)
            managers.add(managerLine);
        } catch (NumberFormatException e) {
            error.add(managerLine);
        }
    }

    void addEmployee(String employeeLine) {
        String[] parts = employeeLine.split(",");
        try {
            if (parts[0].equals("Employee") && Integer.parseInt(parts[3]) > 0)
                employees.add(employeeLine);
        } catch (NumberFormatException e) {
            error.add(employeeLine);
        }
    }

    ArrayList<String> getManagers() {
        System.out.println("working");
        for (String s : managers)
            System.out.println(s);
        return managers;
    }

    ArrayList<String> getEmployees() {
        return employees;
    }

    ArrayList<String> getError() {
        return error;
    }
}
