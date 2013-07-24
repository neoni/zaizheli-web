package net.zaizheli.vo;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("serial")
public class CommentFormBean implements Serializable {

	@NotEmpty
	private String actId;
	@NotEmpty
	private String content;
	@NotEmpty
	private String replyToId;
	
	public String getReplyToId() {
		return replyToId;
	}
	public void setReplyToId(String replyToId) {
		this.replyToId = replyToId;
	}
	public String getActId() {
		return actId;
	}
	public void setActId(String actId) {
		this.actId = actId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
