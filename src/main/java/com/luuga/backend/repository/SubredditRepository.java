package com.luuga.backend.repository;

import com.luuga.backend.model.Post;
import com.luuga.backend.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
    Optional<Subreddit> findByName(String subredditName);
    List<Subreddit> findAll();
}
