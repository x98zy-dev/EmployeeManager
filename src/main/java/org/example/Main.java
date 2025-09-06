package org.example;

public class Main {
    public static void main(String[] args) {
    Sorting sorter = new Sorting();
    PersonalManager personalManager = new PersonalManager();
    FileManager fileManager = new FileManager();
    sorter.firstSort(fileManager.findSbFiles());
    sorter.secondSort(personalManager.getManagers(), personalManager.getEmployees());
    }

}