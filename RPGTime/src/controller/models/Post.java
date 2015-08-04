package controller.models;

public class Post {
	private String text, dateTime;

	public Post(String text, String dateTime){
		this.dateTime = dateTime;
		this.text = text;
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
}
