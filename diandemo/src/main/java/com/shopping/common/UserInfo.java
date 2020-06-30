package com.shopping.common;

import java.sql.Date;

public class UserInfo {
	public UserInfo(int id,String username, String password, String email, String phone, int role,String question, String answer,Date creat_time,Date updata_time) {
		this.id=id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.role=role;
		this.question = question;
		this.answer = answer;
		this.createTime=creat_time;
		this.updateTime=updata_time;
	}
	public UserInfo() {
	
	}
	public UserInfo(int id,String username, String password, String email, String phone, int role,String question, String answer) {
		this.id=id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.role=role;
		this.question = question;
		this.answer = answer;
		
	}
	public UserInfo(String username, String password, String email, String phone, int role,String question, String answer) {
		
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.role=role;
		this.question = question;
		this.answer = answer;
	}
	public UserInfo(String username, String password, String email, String phone, String question, String answer) {
		
		this.username = username;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.question = question;
		this.answer = answer;
	}
	public UserInfo(String username, String phone, String email, String question, String answer) {
		
		this.username = username;
		this.email = email;
		this.phone = phone;
		this.question = question;
		this.answer = answer;
	}
	public UserInfo(String email, String phone, String question, String answer) {
		this.email = email;
		this.phone = phone;
		this.question = question;
		this.answer = answer;
	}
	private int id;
	private String username;
	private String password;
	private String email;
	private String phone;
	private int role;
	private String question;
	private String answer;
	private Date createTime;
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	private Date updateTime;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public Date getCreat_time() {
		return createTime;
	}
}
