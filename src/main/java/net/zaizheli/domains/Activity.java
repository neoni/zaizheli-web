package net.zaizheli.domains;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.NotNull;

import net.zaizheli.vo.ActivityCreationVo;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@SuppressWarnings("serial")
@Document
public class Activity implements Serializable {
	
	@Id
	private String id;
	@NotNull
	private String type;
	@DBRef
	@Indexed
	private Place place;
	@GeoSpatialIndexed
	private Double[] lngLat;
	@NotNull
	private String city;
	@NotNull
	private Date createdAt;
	@DBRef
	@NotNull
	@Indexed
	private User createdBy;
	private Date updatedAt;
	@Indexed
	@NotNull
	private Date startedAt;
	@Indexed
	@NotNull
	private Date endedAt;
	private String addr;
	private int fee;      //0:不需要费用     1: 需要
	private int apply;   // 0:不需要申请资料         1:需要
	private String title;
	private String content;	
	//图片		
	@NotNull
	@DBRef
	private Resource image;
	@NotNull
	private String status;
	
	@NotNull
	private int maxNum;
	private int currentNum;           //当前参与人数
	private int commentCount;
	private int trackCount;
	private int shareCount;
	private int agreeCount;
	private int disagreeCount;
	
	public int getTrackCount() {
		return trackCount;
	}
	public void setTrackCount(int trackCount) {
		this.trackCount = trackCount;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
	}
	public Double[] getLngLat() {
		return lngLat;
	}
	public void setLngLat(Double[] lngLat) {
		this.lngLat = lngLat;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getApply() {
		return apply;
	}
	public void setApply(int apply) {
		this.apply = apply;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Resource getImage() {
		return image;
	}
	public void setImage(Resource image) {
		this.image = image;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public User getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(User createdBy) {
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getMaxNum() {
		return maxNum;
	}
	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}
	public int getCurrentNum() {
		return currentNum;
	}
	public void setCurrentNum(int currentNum) {
		this.currentNum = currentNum;
	}
	public int getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	public int getShareCount() {
		return shareCount;
	}
	public void setShareCount(int shareCount) {
		this.shareCount = shareCount;
	}
	public int getAgreeCount() {
		return agreeCount;
	}
	public void setAgreeCount(int agreeCount) {
		this.agreeCount = agreeCount;
	}
	public int getDisagreeCount() {
		return disagreeCount;
	}
	public void setDisagreeCount(int disagreeCount) {
		this.disagreeCount = disagreeCount;
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
	
	public static Activity from(ActivityCreationVo vo, User signInUser) throws ParseException {
		if(vo==null || signInUser==null) return null;
		Activity activity=new Activity();
		activity.setCreatedBy(signInUser);
		activity.setCurrentNum(1);
		activity.setMaxNum(vo.getNum());
		activity.setAddr(vo.getAddr());
		activity.setApply(vo.getApply());
		activity.setContent(vo.getEditor1());
		activity.setCreatedAt(new Date());
		activity.setFee(vo.getFee());
		activity.setStatus(vo.getStatus());
		activity.setTitle(vo.getTitle());
		activity.setUpdatedAt(activity.getCreatedAt());
		activity.setType(vo.getType());
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String start=vo.getStartDate()+" "+vo.getStartTime();
		activity.setStartedAt(format.parse(start));
		String end=vo.getEndDate()+" "+vo.getEndTime();
		activity.setEndedAt(format.parse(end));
		return activity;		
	
	}
}
