package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {
    private File folder = new File(".");
    File[] files = folder.listFiles();
    ArrayList<File> sbfiles = new ArrayList<File>();
    ArrayList<File> findSbFiles() {
        if(files != null && (files.length > 1)) {
            int i = 0;
            for (File f : files) {
                String name = f.getName();
                String[] parts = name.split("\\.");
                if (parts.length > 1 && parts[(parts.length - 1)].equals("sb")) {
                    sbfiles.add(f);
                }
            }
            return sbfiles;
        }
        else return null;
    }

    void fileWriter(ArrayList<String> personal, String filename) {
        File file = new File(filename);
        try {
            FileWriter writer = new FileWriter(file);
            for(String line : personal)
            {
                writer.write(line);
                writer.write("\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
