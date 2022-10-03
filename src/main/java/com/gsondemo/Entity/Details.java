package com.gsondemo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="details")
public class Details {
	
	@Id
	private Long id;
	
	private String name;
	
	private String dept;
	
	

	public Details() {
	
	}


	public Details(Long id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	

}
