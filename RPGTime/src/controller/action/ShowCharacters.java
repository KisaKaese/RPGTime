package controller.action;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import controller.service.CharacterFinderService;
import controller.models.Character;

public class ShowCharacters extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = 1L;
	private SessionMap<String, Object> session = (SessionMap<String, Object>)ActionContext.getContext().getSession();
	private CharacterFinderService chararacterFinder = new CharacterFinderService();
	private List<Character> chars = new LinkedList<Character>();
	
	public String execute(){
		if(this.session.get("userID")== null){
			return "error";
		}
		this.chars = chararacterFinder.getCharacters();
		if(this.chars !=null){
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
	public List<Character> getChars() {
		return chars;
	}
	public void setChars(List<Character> chars) {
		this.chars = chars;
	}
	public CharacterFinderService getChararacterFinder() {
		return chararacterFinder;
	}
	public void setChararacterFinder(CharacterFinderService chararacterFinder) {
		this.chararacterFinder = chararacterFinder;
	}

}
