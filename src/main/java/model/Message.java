package model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Message implements Serializable {

    private String content;
    private String author;
    private LocalDateTime createdAt;

    public Message(String content, String author, LocalDateTime createdAt) {
        this.content = content;
        this.author = author;
        this.createdAt = createdAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
