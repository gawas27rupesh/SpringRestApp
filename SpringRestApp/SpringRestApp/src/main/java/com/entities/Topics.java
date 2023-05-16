package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Topics {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	
	private String tName;
	private Course coourse;
	
	public Topics(int tid, String tName, Course coourse) {
		super();
		this.tid = tid;
		this.tName = tName;
		this.coourse = coourse;
	}

	public Topics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public Course getCoourse() {
		return coourse;
	}

	public void setCoourse(Course coourse) {
		this.coourse = coourse;
	}

}
