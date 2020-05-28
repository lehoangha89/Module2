package com.codegym.model;

import javax.persistence.*;

@Entity
@Table(name = "listBlogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String title;
    private String writeBlog;

    public Blog() {
    }

    public Blog(Long id, String name,String title, String writeBlog) {
        this.id = id;
        this.name = name;
        this.title=title;
        this.writeBlog = writeBlog;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriteBlog() {
        return writeBlog;
    }

    public void setWriteBlog(String writeBlog) {
        this.writeBlog = writeBlog;
    }
}
