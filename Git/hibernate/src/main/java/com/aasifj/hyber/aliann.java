package com.aasifj.hyber;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class aliann {
	@Id
	private int aid;
	
	private  alianname aname;
	private  String color;
	private List<alianname> al = new ArrayList<alianname>();
	//@OneToOne
	//private laptop laptop1;
	@Column(name = "Alian_color")
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public alianname getAname() {
		return aname;
	}
	public void setAname(alianname aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
		
	}
	
	
	/*
	 * public laptop getLaptop1() { return laptop1; } public void setLaptop1(laptop
	 * laptop1) { this.laptop1 = laptop1;
	 */
	
	@Override
	public String toString() {
		return "aliann [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	

}



