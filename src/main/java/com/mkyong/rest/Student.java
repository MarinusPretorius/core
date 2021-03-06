package com.mkyong.rest;

import javax.persistence.Column;
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.Id;  
import javax.persistence.Table;  
  
@Entity  
@Table  
public class Student {  
      
    @Id  
    @GeneratedValue  
    private Integer id;  
      
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	@Column (name = "firstname")
	private String firstName;  
    private Integer age;  
      
    public Student() {};  
      
    public Student(Integer id, String firstName, Integer age) {  
        this.id = id;  
        this.firstName = firstName;  
        this.age = age;  
    }  
      
        //Here you need to generate getters and setters  
  
} 