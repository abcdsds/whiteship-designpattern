package decorator;

import javax.xml.stream.events.Comment;

public class DefaultCommentService implements CommentService {

    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
