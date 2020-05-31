package com.prac.springboot.web.dto;

import com.prac.springboot.domain.posts.Posts;

public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;

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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String title;
        private String content;
        private String author;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public PostsSaveRequestDto build() {
            if (title == null || content == null || author == null) {
                throw new IllegalStateException("Cannot create Pet2");
            }

            return new PostsSaveRequestDto(title, content, author);
        }
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
