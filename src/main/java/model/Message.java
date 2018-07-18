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
}
