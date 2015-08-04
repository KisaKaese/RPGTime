package controller.action;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;

public class login extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 4219456207976589220L;
	private SessionMap<String, Object> session;
	
	public String execute(){
		
		return SUCCESS;
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

}
