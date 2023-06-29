package com.luuga.backend.repository;

import com.luuga.backend.model.Post;
import com.luuga.backend.model.Subreddit;
import com.luuga.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
