package com.intern.demo;

import lombok.*;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class LocalBook extends Book{
    private String store;

    public LocalBook(String title, String author,String store) {
        super(title,author);
        this.store = store;
    }

}
