package com.spring.JDBC.entities;

public class Student {
	public Student(int sid, String sphone, String sname, String scity) {
		super();
		this.sid = sid;
		this.sphone = sphone;
		this.sname = sname;
		this.scity = scity;
	}
	private int sid;
	public Student() {
		super();
	}
	public Student(int sid) {
		super();
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sphone=" + sphone + ", sname=" + sname + ", scity=" + scity + "]";
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	private String sphone;
	private String sname;
	private String scity;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
}
