package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
class Book {
    public Book() {
        System.out.println("Book Constructor");
    }
}
