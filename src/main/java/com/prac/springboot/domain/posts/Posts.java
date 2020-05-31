package com.prac.springboot.domain.posts;

import com.prac.springboot.domain.BaseTimeEntity;
import lombok.Builder;

import javax.persistence.*;

@Entity
public class Posts extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;


    public Posts() {
    }

    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public static Builder1 builder() {
        return new Builder1();
    }

    public static class Builder1 {
        private String title;
        private String content;
        private String author;

        public Builder1 title(String title) {
            this.title = title;
            return this;
        }

        public Builder1 content(String content) {
            this.content = content;
            return this;
        }

        public Builder1 author(String author) {
            this.author = author;
            return this;
        }

        public Posts build() {
            if (title == null || content == null || author == null) {
                throw new IllegalStateException("Cannot create Pet2");
            }

            return new Posts(title, content, author);
        }

    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}