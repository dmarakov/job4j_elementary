package ru.job4j.pojo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan Ivanov");
        student.setGroup("FE-11");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        student.setDate(LocalDate.of(2011, 9, 1));
        System.out.println(student.getName());
        System.out.println(student.getGroup());
        System.out.println(student.getDate().format(dateTimeFormatter));
    }
}
