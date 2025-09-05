package org.example;

import java.io.File;
import java.util.ArrayList;

public class FileReader {
    private File folder = new File(".");
    File[] files = folder.listFiles();
    ArrayList<File> sbfiles = new ArrayList<File>();
    private ArrayList<File> findSbFiles() {
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
}
