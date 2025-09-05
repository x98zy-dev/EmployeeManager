package org.example;

import java.util.ArrayList;

public class DepartmentManager {
    ArrayList<String> departments = new ArrayList<>();
    void addDepartment(String newDepartment){
        int flag = 0;
        for (String dep : departments) {
            if (dep.equals(newDepartment))
                    flag = 1;
        }
        if(flag == 0)
            departments.add(newDepartment);
    }

}
