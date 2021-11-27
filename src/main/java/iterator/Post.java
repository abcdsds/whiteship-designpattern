package iterator;

import java.time.LocalDateTime;

public class Post {

    private String content;
    private LocalDateTime dateTime;

    public Post(String content) {
        this.content = content;
        this.dateTime = LocalDateTime.now();
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
