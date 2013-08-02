package net.zaizheli.domains;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import net.zaizheli.constants.MessageType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@SuppressWarnings("serial")
@Document
public class Message implements Serializable{
	@Id
	private String id;
	@DBRef
	@NotNull
	private User from;
	@DBRef
	@NotNull
	private User to;	
	private String content;
	private MessageType type;
	private int status;          //0:未读             1:已读 
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public User getTo() {
		return to;
	}
	public void setTo(User to) {
		this.to = to;
	}
	public User getFrom() {
		return from;
	}
	public void setFrom(User from) {
		this.from = from;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public MessageType getType() {
		return type;
	}
	public void setType(MessageType type) {
		this.type = type;
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
					.append(id).toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		} else if(!(obj instanceof Group)) {
			return false;
		}
		return new EqualsBuilder()
					.append(id, ((Message)obj).getId())
					.isEquals();
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this)
					.append(type)
					.toString();
	}
	
}
