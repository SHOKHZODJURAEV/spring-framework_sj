package dono.daryo.service;

import dono.daryo.model.Comment;
import dono.daryo.proxy.CommentNotificationProxy;
//import dono.daryo.repository.CommentRepository;
import dono.daryo.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;


    public CommentService(CommentRepository commentRepository, @Qualifier("Email") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }
    public void publishComment(Comment comment){
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
