package com.codeup.blog.services;

import com.codeup.blog.models.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts;

    public PostService() {
        this.posts = new ArrayList<>();
        createPosts();
    }
    private void createPosts() {
//        posts.add(new Post(1,"Some Post","this is something about something that i wrote"));
//        posts.add(new Post(2,"Somewhere Post","this is something about something that i wrote when i was in somewhere"));
//        posts.add(new Post(3,"Today","It is wednesday and I had to go on base today!"));
    }

        public Post singlePost(long index){
            return posts.get((int) index-1) ;
        }

        public List<Post> allPosts(){
            return posts;
        }
        public void save(Post post){
            post.setId(this.posts.size()+1);
            this.posts.add(post);
        }

        public void edit(Post post){
        this.posts.remove((int)post.getId()-1);
        this.posts.add((int)post.getId()-1,post);
        }
}
