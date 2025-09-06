package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Sorting {

    PersonalManager manager = new PersonalManager();
    FileManager fmanager = new FileManager();

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
                    if (parts[1].equals("Employee")) {
                        manager.addEmployee(line);
                    }
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    void secondSort (ArrayList<String> mLines, ArrayList<String> pLines) {
        for(String mline : mLines)
        {
            ArrayList<String> department = new ArrayList<String>();
            String filename = (mline.split(","))[5] + ".sb";
            department.add(filename);
            department.add(mline);
            for(String pline : pLines){
                if(mline.split(",")[1].equals(pline.split(",")[5]))
                    department.add(pline);
            }
            fmanager.fileWriter(department, filename);
        }
    }
}
