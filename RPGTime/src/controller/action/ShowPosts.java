package controller.action;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

import controller.models.Post;
import controller.service.PostFinderService;

public class ShowPosts extends ActionSupport implements SessionAware {
	private SessionMap<String, Object> session;
	private static final long serialVersionUID = 1L;
	private PostFinderService postFinder = new PostFinderService();
	private List<Post> posts = new LinkedList<Post>();
	
	public String execute(){
		this.posts = this.postFinder.getAllPosts();
		if(this.posts!=null){
			return "success";
		}
		return "error";
	}
	@Override
	public void setSession(Map<String, Object> map) {
		session = (SessionMap<String, Object>) map;
	}

	public SessionMap<String, Object> getSession() {
		return session;
	}

	public void setSession(SessionMap<String, Object> session) {
		this.session = session;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public PostFinderService getPostFinder() {
		return postFinder;
	}
	public void setPostFinder(PostFinderService postFinder) {
		this.postFinder = postFinder;
	}
	public List<Post> getPosts() {
		return posts;
	}
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
}
