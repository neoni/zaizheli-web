package net.zaizheli.domains;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import net.zaizheli.constants.ActivityStatus;
import net.zaizheli.constants.ActivityType;
import net.zaizheli.constants.ByType;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@SuppressWarnings("serial")
@Document
public class Activity implements Serializable {
	
	@Id
	private String id;
	@NotNull
	private ActivityType type;
	@NotNull
	private ByType by;
	@NotNull
	private String createdBy;
	@NotNull
	private Date startedAt;
	@NotNull
	private Date endedAt;
	@DBRef
	@NotNull
	private Address address;
	
	private String topic;
	private String content;
	
	//图片和视频
	
	
	
	private ActivityStatus status;
	
	@NotNull
	private int maxNum;
	private int num;           //当前参与人数
	private int commentNum;
	private int shareNum;
	private int agreeNum;
	private int disagreeNum;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ActivityType getType() {
		return type;
	}
	public void setType(ActivityType type) {
		this.type = type;
	}
	public ByType getBy() {
		return by;
	}
	public void setBy(ByType by) {
		this.by = by;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getStartedAt() {
		return startedAt;
	}
	public void setStartedAt(Date startedAt) {
		this.startedAt = startedAt;
	}
	public Date getEndedAt() {
		return endedAt;
	}
	public void setEndedAt(Date endedAt) {
		this.endedAt = endedAt;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public ActivityStatus getStatus() {
		return status;
	}
	public void setStatus(ActivityStatus status) {
		this.status = status;
	}
	public int getMaxNum() {
		return maxNum;
	}
	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCommentNum() {
		return commentNum;
	}
	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}
	public int getShareNum() {
		return shareNum;
	}
	public void setShareNum(int shareNum) {
		this.shareNum = shareNum;
	}
	public int getAgreeNum() {
		return agreeNum;
	}
	public void setAgreeNum(int agreeNum) {
		this.agreeNum = agreeNum;
	}
	public int getDisagreeNum() {
		return disagreeNum;
	}
	public void setDisagreeNum(int disagreeNum) {
		this.disagreeNum = disagreeNum;
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(id)
				.toHashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == null){
			return false;
		}else if(!(obj instanceof Activity)){
			return false;
		}
		return new EqualsBuilder()
				.append(id, ((Activity)obj).getId())
				.isEquals();
	}
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append(createdBy)
				.append(type)
				.append(content)
				.toString();
	}
}
