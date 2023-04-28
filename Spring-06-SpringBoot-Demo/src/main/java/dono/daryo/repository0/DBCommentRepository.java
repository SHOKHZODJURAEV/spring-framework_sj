package dono.daryo.repository0;

import dono.daryo.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Store data to database "+ comment.getText());
    }
}
