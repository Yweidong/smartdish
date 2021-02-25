package com.thought.monkey.domain;

import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description
 * @Author
 * @Date 2021-02-25
 */

@Entity
@Table ( name ="dish_admin" )
@DynamicInsert
@DynamicUpdate
@EntityListeners(AuditingEntityListener.class)
public class DishAdmin  implements Serializable {

	private static final long serialVersionUID = 5275200651101786387L;

	@Id
   	@Column(name = "id" )
	private String id;

   	@Column(name = "username" )
	private String username;

   	@Column(name = "password" )
	private String password;

   	@Column(name = "cover" )
	private String cover;

   	@Column(name = "create_time" ,nullable = false,updatable = false)
	@CreatedDate
	@JSONField(format = "yyyy-MM-dd  HH:mm:ss")
	private Date createTime;

   	@Column(name = "update_time" )
	@LastModifiedDate
	@JSONField(format = "yyyy-MM-dd  HH:mm:ss")
	private Date updateTime;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCover() {
		return this.cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "TpApiConfig{" +
				"id='" + id + '\'' +
				"username='" + username + '\'' +
				"password='" + password + '\'' +
				"cover='" + cover + '\'' +
				"createTime='" + createTime + '\'' +
				"updateTime='" + updateTime + '\'' +
				'}';
	}

}
