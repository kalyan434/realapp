package com.pojo;

import java.io.Serializable;
import java.util.Map;

public class Student implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String sid;
	private String sname;
	private String saddr;
	private String scourse; 
	private String mapped;
	private Map<String,Boolean> trackMap; 
	
	
	public Student(String sid, String sname, String saddr,String scourse, String mapped) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.scourse=scourse;
		this.mapped=mapped;
		 
		 
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	public String getMapped() {
		return mapped;
	}
	public void setMapped(String mapped) {
		this.mapped = mapped;
	}
	public Map<String, Boolean> getTrackMap() {
		return trackMap;
	}
	public void setTrackMap(Map<String, Boolean> trackMap) {
		this.trackMap = trackMap;
	}
	 
	 
	 
	

}
