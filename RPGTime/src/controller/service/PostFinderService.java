package controller.service;

import java.util.LinkedList;
import java.util.List;
import controller.models.Post;
import database.PostDAO;

public class PostFinderService {
	PostDAO posts = new PostDAO();
	
	public List<Post> searchPost(String term){
		List<Post> p = new LinkedList<Post>();
		List<Post> allP = posts.getPosts();
		for(Post post: allP){
			if(post.getText().contains(term)){
				p.add(post);
			}
		}
		return p;
	}
	public List<Post> getAllPosts(){
		return posts.getPosts();
	}
	public void addPost(Post p){
		posts.addPost(p);
	}
}
