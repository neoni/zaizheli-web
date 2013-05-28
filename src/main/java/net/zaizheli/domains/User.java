package net.zaizheli.domains;

import java.io.Serializable;
import java.util.Date;
import javax.validation.constraints.NotNull;

import net.zaizheli.constants.ApplicationConfig;
import net.zaizheli.constants.Gender;
import net.zaizheli.constants.UserStatus;
import net.zaizheli.vo.SignUpUserVo;


import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@SuppressWarnings("serial")
@Document
public class User implements Serializable {
	
	//主要信息
	@Id
	private String id;
	@NotEmpty
	@Indexed(unique=true)
	private String name;
	@NotEmpty
	@Indexed(unique=true)
	private String email;
	@NotEmpty
	private String password;
	@NotNull
	private Date registerTime;
	@NotNull
	private UserStatus status;
	
	//个人扩展信息
	private String realName;	
	private int age;
	private Gender gender;
	private String birthday;
	private String tel;
	private String summary;
	private Resource avatar;
	private Resource avatarOrg;
	private int privateset;
	
	//用户动态
	private int fansNum;
	private int followNum;
	private int shareNum;
	private int circleNum;
	private int commentNum;	
	private int activityNum;	
	
	//待拓展
	private String city;
	private String school;	
	
	public UserStatus getStatus() {
		return status;
	}
	public void setStatus(UserStatus status) {
		this.status = status;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Resource getAvatar() {
		return avatar;
	}
	public void setAvatar(Resource avatar) {
		this.avatar = avatar;
	}
	public Date getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}
	public int getFansNum() {
		return fansNum;
	}
	public void setFansNum(int fansNum) {
		this.fansNum = fansNum;
	}
	public int getFollowNum() {
		return followNum;
	}
	public void setFollowNum(int followNum) {
		this.followNum = followNum;
	}
	public int getShareNum() {
		return shareNum;
	}
	public void setShareNum(int shareNum) {
		this.shareNum = shareNum;
	}
	public int getCircleNum() {
		return circleNum;
	}
	public void setCircleNum(int circleNum) {
		this.circleNum = circleNum;
	}
	public int getCommentNum() {
		return commentNum;
	}
	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}
	public int getActivityNum() {
		return activityNum;
	}
	public void setActivityNum(int activityNum) {
		this.activityNum = activityNum;
	}
	public Resource getAvatarOrg() {
		return avatarOrg;
	}
	public void setAvatarOrg(Resource avatarOrg) {
		this.avatarOrg = avatarOrg;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public int getPrivateset() {
		return privateset;
	}
	public void setPrivateset(int privateset) {
		this.privateset = privateset;
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
		}else if(!(obj instanceof User)){
			return false;
		}
		return new EqualsBuilder()
				.append(id, ((User)obj).getId())
				.isEquals();
	}
	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append(name)
				.toString();
	}
	
	public static User from(SignUpUserVo vo){
		User user = new User();
		user.setName(vo.getName());
		user.setEmail(vo.getEmail());
		user.setPassword(vo.getPassword());
		user.setRegisterTime(new Date());
		user.setGender(Gender.UNKNOWN);
		user.setCity(ApplicationConfig.defaultCityPinyin);
		return user;
	}
	
}

