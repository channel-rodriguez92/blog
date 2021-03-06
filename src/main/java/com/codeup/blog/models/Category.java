package com.codeup.blog.models;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

    @Id @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public Category() {
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
