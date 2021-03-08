package com.intern.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@Service
public class Capitalization implements CapitalizationService{

    private static String capitalize (String input) {
        //TODO Add logic to capitalize String Input
        //TODO Input = "I want to lEARN JAVA"
        //TODO Output = "I Want To Learn Java"
        input = input.toLowerCase();
        char[] titleTemp = input.toCharArray();
        boolean space = true;

        for (int idx=0;  idx<input.length(); idx++){
            if(Character.isLetter(titleTemp[idx])){
                if(space){
                    titleTemp[idx] = Character.toUpperCase(titleTemp[idx]);
                    space = false;
                }
            }else {
                space = true;
            }
        }

        return input = String.valueOf(titleTemp);
    }


    @Override
    public Map<String, List<String>> convertToMapTest(List<Book> books) {
        // TODO Add logic to capitalize Author and Title Of Books to Map with Key: Author, Value: List of Title Grouped By Author
        // TODO INPUT: List<Book>
        // TODO OUTPUT: Map<String, List<String>>
        for(int idx=0; idx<books.size(); idx++){
            String tempTitle = capitalize(books.get(idx).getTitle());
            String tempAuthor = capitalize(books.get(idx).getAuthor());
            books.get(idx).setAuthor(tempAuthor);
            books.get(idx).setTitle(tempTitle);
        }
        return books.stream().collect(Collectors.groupingBy(Book::getAuthor, Collectors.mapping(Book::getTitle, Collectors.toList())));
    }
}
