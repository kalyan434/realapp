package com.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.pojo.Student;

public class TestDemo {
	static List<Student> studentList=new ArrayList<Student>();
	  static List<Student> uniqList=new ArrayList<Student>();
	  static List<String> courses=new ArrayList<String>();
	
	public static void main(String[] args) {
		 
		courses.add("Java");
		courses.add(".Net");
		courses.add("PHP");
		courses.add("Oracle");
		courses.add("Hadoop");
		
		 
		Student s1=new Student("S1", "kalyan", "JAx", "java","Y");
		Student s2=new Student("S2", "venka", "hyd", ".Net","Y");
		Student s3=new Student("S1", "kalyan", "Jax", "Oracle","Y");
		Student s4=new Student("S1", "kalyan", "Jax", ".Net","Y");
		Student s5=new Student("S1", "kalyan", "Jax", ".PHP","Y");
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
	List<Student>	finalList=new ArrayList<Student>();
	List<String>	compList=new ArrayList<String>();
		
		/*for(int i=0;i<studentList.size();i++)
		{
		uniqList.add(mappingData(studentList.get(i),courses));
	//	Student s=dulicateData(studentList.get(i));
		
	//	finalList.add(s);
		
		}*/
	
	for(int i=0;i<studentList.size();i++)
	{
		if(!compList.contains(studentList.get(i).getSid()))
		{
			compList.add(studentList.get(i).getSid());
			finalList.add(studentList.get(i));
			
		}else{ 
			for (int j = 0; j < finalList.size(); j++) {
			//	System.err.println(finalList.get(j).getSid());
				System.err.println("studentList"+studentList.get(i).getScourse());
				if(finalList.get(j).getSid().equalsIgnoreCase(studentList.get(i).getSid()))
				{
					if(finalList.get(j).getMapped().equalsIgnoreCase("Y") && studentList.get(i).getMapped().equalsIgnoreCase("Y"))
					{
						finalList.get(j).setScourse(finalList.get(j).getScourse()+","+studentList.get(i).getScourse());
					}else if(studentList.get(i).getMapped().equalsIgnoreCase("Y"))
					{
						finalList.get(j).setScourse(studentList.get(i).getScourse())	;
					}
				}
				
				/*
				if(finalList.get(j).getSid().equalsIgnoreCase(studentList.get(i).getSid()))
				{
					if(finalList.get(j).getMapped().equalsIgnoreCase("Y") && studentList.get(i).getMapped().equalsIgnoreCase("Y"))
							{
					finalList.get(j).setScourse((finalList.get(j).getScourse()+","+studentList.get(i).getScourse()));
							} 
				}
			*/}
		
		}
	}
	
		
		for(int i=0;i<finalList.size();i++)
		{
			System.err.println(finalList.get(i).getSid()+"---"+finalList.get(i).getScourse());
		}
		
	}
	public static Student mappingData(Student st,List<String> coruses)
	{
		Map<String,Boolean> statsMap = new LinkedHashMap<String, Boolean>();
		 
		for(int i=0;i<courses.size();i++)
		{
			if(st.getScourse().equalsIgnoreCase(coruses.get(i)) && st.getMapped().equalsIgnoreCase("Y"))
					{
				statsMap.put(coruses.get(i), true);
					}else{
						statsMap.put(coruses.get(i), false);
					}
			
		}
		
		st.setTrackMap(statsMap);
		
		return st;
	}
	
	
	public static Student dulicateData(Student s1)
	{
		for(int i=0;i<uniqList.size();i++)
		{
			if(uniqList.get(i).getSid().equalsIgnoreCase(s1.getSid())){
			//	s1.getTrackMap().putAll(studentList.get(i).getTrackMap());
				System.err.println("dudppdpdp");
				break;
			}
		}
		
		return s1;
	}
	
}
	


