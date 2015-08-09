package controller.action;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import controller.models.Post;
import controller.models.Character;
import controller.service.CharacterFinderService;
import controller.service.PostFinderService;

public class ShowPosts extends ActionSupport implements SessionAware {
	private SessionMap<String, Object> session = (SessionMap<String, Object>)ActionContext.getContext().getSession();
	private static final long serialVersionUID = 1L;
	private PostFinderService postFinder = new PostFinderService();
	private CharacterFinderService characterFinder = new CharacterFinderService();
	private List<Post> posts = new LinkedList<Post>();
	private List<Character> characters = new LinkedList<Character>();
	private List<String> characterNames = new LinkedList<String>();

	public String execute(){
		this.posts = this.postFinder.getAllPosts();
		this.characters = this.characterFinder.getCharacters();
		if(this.posts!=null){
			if(this.characters!=null){
				for(Character c:this.characters){
					System.out.println((int) this.session.get("userID"));
					System.out.println(c.getPlayerID());
					if((int) this.session.get("userID")== c.getPlayerID()){
						this.characterNames.add(c.getName());
					}
				}
			}
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
	public List<Character> getCharacters() {
		return characters;
	}
	public void setCharacters(List<Character> characters) {
		this.characters = characters;
	}
	public List<String> getCharacterNames() {
		return characterNames;
	}
	public void setCharacterNames(List<String> characterNames) {
		this.characterNames = characterNames;
	}
	public CharacterFinderService getCharacterFinder() {
		return characterFinder;
	}
	public void setCharacterFinder(CharacterFinderService characterFinder) {
		this.characterFinder = characterFinder;
	}
}
