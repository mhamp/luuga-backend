package com.luuga.backend.repository;


import com.luuga.backend.model.Vote;
import com.luuga.backend.model.Post;
import com.luuga.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}