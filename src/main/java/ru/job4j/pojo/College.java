package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivanov Ivan Ivanovich");
        student.setGroup("T11");
        student.setDateOfReceipt(LocalDate.of(2017, 1, 1));
        System.out.println(student.getFio() + " " + student.getGroup() + " " + student.getDateOfReceipt());
    }
}
