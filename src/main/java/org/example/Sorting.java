package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Sorting {
    PersonalManager manager = new PersonalManager();
    void sort(ArrayList<File> files)
    {
        for (File f : files) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(f));
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts[0].equals("Manager")) {
                        manager.addManager(parts);
                    } else if (parts[1].equals("Employee")) {
                        manager.addEmployee(parts);
                    }
                }
                reader.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
