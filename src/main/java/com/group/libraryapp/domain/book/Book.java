package com.group.libraryapp.domain.book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id = null;

    @Column(nullable = false)
    private String name;

    protected Book() {

    }

    public Book(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다.", name));
        }
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
