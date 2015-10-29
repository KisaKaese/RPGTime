package controller.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import controller.service.CharacterFinderService;

public class createCharacter extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;
	private SessionMap<String, Object> session = (SessionMap<String, Object>)ActionContext.getContext().getSession();
	private String name;
	private CharacterFinderService character = new CharacterFinderService();
	
	public String execute() {
		if(this.session.get("level")!=null){
			int playerID = (int) this.session.get("userID");
			String playedBy = (String) this.session.get("user");
			System.out.println(playedBy);
			System.out.println(playerID);
			this.character.createCharacter(name, playerID, playedBy);
			return "success";
		}else{
			return "error";
		}
	}
	
	@Override
	public void setSession(Map<String, Object> map) {
		session = (SessionMap<String, Object>) map;
	}
	public SessionMap<String, Object> getSession() {
		return session;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public CharacterFinderService getCharacter() {
		return character;
	}

	public void setCharacter(CharacterFinderService character) {
		this.character = character;
	}
}
