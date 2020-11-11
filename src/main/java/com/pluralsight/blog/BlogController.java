package com.pluralsight.blog;

import com.pluralsight.blog.data.PostRepository;
import com.pluralsight.blog.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogController {
    private PostRepository postRepository;
    public BlogController(PostRepository postRepository){
    }
    @RequestMapping("/")
    public String listPosts(ModelMap modelMap){
        //List<Post> allPosts = new ArrayList<>(postRepository.getAllPosts());
        //modelMap.put("posts",allPosts);
        return "home";
    }
}
