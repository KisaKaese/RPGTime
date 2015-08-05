package controller.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class Logout extends ActionSupport implements SessionAware {
	private SessionMap<String, Object> session;
	private static final long serialVersionUID = 1L;

	public String execute(){
		session.invalidate();
		return "success";
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

}
