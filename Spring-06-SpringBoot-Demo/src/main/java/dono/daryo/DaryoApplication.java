package dono.daryo;

import dono.daryo.model.Comment;
import dono.daryo.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DaryoApplication {

    public static void main(String[] args) {

        Comment comment = new Comment();
        comment.setAuthor("Shahzoda");
        comment.setText("Kechalari Yoqimli");

        ApplicationContext context =  SpringApplication.run(DaryoApplication.class, args);

        CommentService cs = context.getBean(CommentService.class);

        cs.publishComment(comment);


    }

}
