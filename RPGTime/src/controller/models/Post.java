package controller.models;

public class Post {
	private String text, dateTime, ChacterName;
	private int PostID, PostedBy, CharacterID;

	public Post(String text, String dateTime, int PostID, int PostedBy, int CharacterID, String name) {
		this.dateTime = dateTime;
		this.text = text;
		this.CharacterID = CharacterID;
		this.PostedBy = PostedBy;
		this.PostID = PostID;
		this.ChacterName = name;
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

	public int getPostID() {
		return PostID;
	}

	public void setPostID(int postID) {
		PostID = postID;
	}

	public int getPostedBy() {
		return PostedBy;
	}

	public void setPostedBy(int postedBy) {
		PostedBy = postedBy;
	}

	public int getCharacterID() {
		return CharacterID;
	}

	public void setCharacterID(int characterID) {
		CharacterID = characterID;
	}

	public String getChacterName() {
		return ChacterName;
	}

	public void setChacterName(String chacterName) {
		ChacterName = chacterName;
	}
}
