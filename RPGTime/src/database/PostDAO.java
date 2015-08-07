package database;

import java.util.LinkedList;
import java.util.List;

import controller.models.Post;

public class PostDAO {
	private List<Post> posts = new LinkedList<Post>();

	public PostDAO(){
		Post p = new Post("Joooo Bitches *freut sich nen Kecks*", "10.08.2015 18:30", 1, 1, 1, "Steve");
		posts.add(p);
		p = new Post("Halt die Fresse Steve", "10.08.2015 18:31", 2, 2, 2, "Daichi");
		posts.add(p);
		p = new Post("Aber D: Man Daichi, sei doch nicht immer so", "10.08.2015 18:33", 3, 1, 1, "Steve");
		posts.add(p);
		p = new Post("*böser Blick", "10.08.2015 18:34", 4, 2, 2, "Daichi");
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	public void addPost(Post p){
		this.posts.add(p);
	}

}
