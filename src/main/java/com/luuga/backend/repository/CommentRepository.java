package com.luuga.backend.repository;

import com.luuga.backend.model.Comment;
import com.luuga.backend.model.Post;
import com.luuga.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
