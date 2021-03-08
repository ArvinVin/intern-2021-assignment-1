package com.intern.demo;


import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.MockitoAnnotations.initMocks;

public class CapitalizationTest {

    @InjectMocks
    Capitalization capitalization;

    @Before
    public void setUp(){
        initMocks(this);
    }

    @Test
    public void convertToMapTest() {
        //TODO COMPLETE THIS
        ImportedBook importedBook1 = new ImportedBook("joHN dOE", "IMPORTED book 1","joHN dOE");
        ImportedBook importedBook2 = new ImportedBook("joHN dOE", "IMPORTED book 2","joHN dOE");
        ImportedBook importedBook3 = new ImportedBook("joHN dOE", "IMPORTED book 3","joHN dOE");
        ImportedBook importedBook4 = new ImportedBook("joHN dOE", "IMPORTED book 4","joHN dOE");

        LocalBook localBook1 = new LocalBook("loCal bOok 1","jaNE stARk","gramEDia");
        LocalBook localBook2 = new LocalBook("loCal bOok 2","jaNE stARk","gramEDia");
        LocalBook localBook3 = new LocalBook("loCal bOok 3","jaNE stARk","gramEDia");
        LocalBook localBook4 = new LocalBook("loCal bOok 4","jaNE stARk","gramEDia");

        List<Book> inputs = Arrays.asList(importedBook1,importedBook2,importedBook3,importedBook4,localBook1,localBook2,localBook3,localBook4);

        Map<String, List<String>> result = capitalization.convertToMapTest(inputs);

        Map<String, List<String>> expected = new HashMap<String, List<String>>(){{
            put("Jane Stark", Arrays.asList("Local Book 1", "Local Book 2", "Local Book 3", "Local Book 4"));
            put("John Doe", Arrays.asList("Imported Book 1", "Imported Book 2", "Imported Book 3", "Imported Book 4"));
        }};
//        assertNull(Capitalization.convertToMap();
        assertEquals(expected,result);
        System.out.println("Output Secure");
    }
}
