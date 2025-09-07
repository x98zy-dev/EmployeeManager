package org.example;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Sorting {

    PersonalManager manager = new PersonalManager();

    FileManager fmanager = new FileManager();

    Sorting(PersonalManager manager) {
        this.manager = manager;
    }

    void firstSort(ArrayList<File> files)
    {
        for (File f : files) {
            try {
                BufferedReader mreader = new BufferedReader(new FileReader(f));
                String line;
                while ((line = mreader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts[0].equals("Manager")) {
                        manager.addManager(line);
                    }
                }
                mreader.close();
                BufferedReader ereader = new BufferedReader(new FileReader(f));
                while ((line = ereader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts[0].equals("Employee")) {
                        manager.addEmployee(line);
                    }
                }
                ereader.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    void secondSort (ArrayList<String> mLines, ArrayList<String> pLines) {
        for(String mline : mLines)
        {
            System.out.println("second");
            ArrayList<String> department = new ArrayList<String>();
            String filename = (mline.split(","))[4] + ".sb";
            department.add(filename);
            department.add(mline);
            for(String pline : pLines){
                if(mline.split(",")[1].equals(pline.split(",")[4]))
                    department.add(pline);
            }
            fmanager.fileWriter(department, filename);
        }
    }
}
