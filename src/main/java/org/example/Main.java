package org.example;

public class Main {
    public static void main(String[] args) {
    PersonalManager personalManager = new PersonalManager();
    Sorting sorter = new Sorting(personalManager);
    FileManager fileManager = new FileManager();
    sorter.firstSort(fileManager.findSbFiles());
    sorter.secondSort(personalManager.getManagers(), personalManager.getEmployees());
    }

}