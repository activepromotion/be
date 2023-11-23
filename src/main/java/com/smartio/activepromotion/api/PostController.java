package com.smartio.activepromotion.api;

import com.smartio.activepromotion.entity.Post;
import com.smartio.activepromotion.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostRepository postRepository;

    @GetMapping
    public Page<Post> getAllPosts(Pageable pageable){
        return postRepository.findAll(pageable);
    }
}
