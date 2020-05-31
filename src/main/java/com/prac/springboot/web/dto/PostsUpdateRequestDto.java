package com.prac.springboot.web.dto;

public class PostsUpdateRequestDto {
    private String title;
    private String content;

    public PostsUpdateRequestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String title;
        private String content;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }


        public PostsUpdateRequestDto build() {
            if (title == null || content == null) {
                throw new IllegalStateException("Cannot create Pet2");
            }

            return new PostsUpdateRequestDto(title, content);
        }
    }
}
