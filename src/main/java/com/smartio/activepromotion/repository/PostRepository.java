package com.smartio.activepromotion.repository;

import com.smartio.activepromotion.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
