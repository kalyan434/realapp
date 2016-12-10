package com.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.pojo.Student;


@ManagedBean
@ViewScoped
public class StudentService implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Student> studentList=new ArrayList<Student>();
	private List<Student> uniqList=new ArrayList<Student>();
	private List<String> courses=new ArrayList<String>();
	private String trackType;
	private String trakcName;
	
	
	
	public StudentService() {
		// TODO Auto-generated constructor stub
		loadData();
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	
	public void loadData()
	{
		courses.add("Java");
		courses.add(".Net");
		courses.add("PHP");
		courses.add("Oracle");
		courses.add("Hadoop");
		
		 
		Student s1=new Student("S1", "kalyan", "JAx", "java","N");
		Student s2=new Student("S2", "venka", "hyd", ".Net","Y");
		Student s3=new Student("S1", "kalyan", "Jax", "Oracle","Y");
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		for(int i=0;i<studentList.size();i++)
		{
		uniqList.add(mappingData(studentList.get(i),courses));
		}
		for(int i=0;i<uniqList.size();i++)
		{
			System.err.println(uniqList.get(i).getSid()+"---"+uniqList.get(i).getTrackMap());
		}
	}
	
	public Student mappingData(Student st,List<String> coruses)
	{
		Map<String,Boolean> statsMap = new LinkedHashMap<String, Boolean>();
		for(int i=0;i<courses.size();i++)
		{
			statsMap.put(coruses.get(i), st.getScourse().equalsIgnoreCase("coruses.get(i)")?true:false);
		}
		
		st.setTrackMap(statsMap);
		
		return st;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	
	public void deckMapAction()
	{
	
	/*	for (Student students : studentList) {
			
			System.err.println("student corusesss"+students.getScourses().length);
		}*/
	}

	public String getTrackType() {
		return trackType;
	}
	public void setTrackType(String trackType) {
		this.trackType = trackType;
	}
	public String getTrakcName() {
		return trakcName;
	}
	public void setTrakcName(String trakcName) {
		this.trakcName = trakcName;
	}
	
	public void addTrack()
	{
		courses.add(this.trackType);
	}

	public List<Student> getUniqList() {
		return uniqList;
	}

	public void setUniqList(List<Student> uniqList) {
		this.uniqList = uniqList;
	}
}
