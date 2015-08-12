package controller.action;

import java.util.Map;
import controller.models.*;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import controller.service.UserFinderService;

public class Login extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private SessionMap<String, Object> session;
	private UserFinderService users = new UserFinderService();
	private String username, password, infoMessage;

	public String execute() {
		User u = users.login(this.username, this.password);
		if (u != null) {
			this.session.put("user", username);
			this.session.put("userID", u.getUserID());
			if (u.getLevel()==2) {
				this.session.put("level", u.getLevel());
			}
			return "success";
		} else if (this.username != null && this.password != null) {
			setInfoMessage("Bitte versuche es erneut");
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

	public void validate() {
		if (StringUtils.isEmpty(this.username)) {
			addFieldError("username", "Bitte gib deinen Benutzernamen ein");
		}
		if (StringUtils.isEmpty(this.password)) {
			addFieldError("password", "Bitte gib dein Passwort ein");
		}
	}

	public UserFinderService getUsers() {
		return users;
	}

	public void setUsers(UserFinderService users) {
		this.users = users;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getInfoMessage() {
		return infoMessage;
	}

	public void setInfoMessage(String infoMessage) {
		this.infoMessage = infoMessage;
	}

}
