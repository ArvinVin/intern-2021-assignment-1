package com.intern.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@SpringBootApplication public class DemoApplication {

    public static void main(String[] args) {

        Capitalization capitalization = new Capitalization();

        // todo EXPECTED RESULT:
        // {Jane Stark=[Local Book 1, Local Book 2, Local Book 3, Local Book 4], John Doe=[Imported Book 1, Imported Book 2, Imported Book 3, Imported Book 4]}

        ImportedBook importedBook1 = new ImportedBook("joHN dOE", "IMPORTED book 1","joHN dOE");
        ImportedBook importedBook2 = new ImportedBook("joHN dOE", "IMPORTED book 2","joHN dOE");
        ImportedBook importedBook3 = new ImportedBook("joHN dOE", "IMPORTED book 3","joHN dOE");
        ImportedBook importedBook4 = new ImportedBook("joHN dOE", "IMPORTED book 4","joHN dOE");

        LocalBook localBook1 = new LocalBook("loCal bOok 1","jaNE stARk","gramEDia");
        LocalBook localBook2 = new LocalBook("loCal bOok 2","jaNE stARk","gramEDia");
        LocalBook localBook3 = new LocalBook("loCal bOok 3","jaNE stARk","gramEDia");
        LocalBook localBook4 = new LocalBook("loCal bOok 4","jaNE stARk","gramEDia");


        // TODO CREATE A NEW LIST OBJECT CALLED "inputs" THAT CONSIST OF ALL BOOKS STATED ABOVE
            List<Book> inputs = Arrays.asList(importedBook1,importedBook2,importedBook3,importedBook4,localBook1,localBook2,localBook3,localBook4);

            Map<String, List<String>> result = capitalization.convertToMapTest(inputs);
        // TODO CALL CAPITALIZATION convertToMap WITH "inputs" AS REQUEST AND PRINT IT OUT
            System.out.println(result);

    }

}
