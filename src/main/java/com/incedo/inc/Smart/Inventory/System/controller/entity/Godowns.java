package com.incedo.inc.Smart.Inventory.System.controller.entity;

import java.math.BigInteger;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.websocket.Decoder.Binary;

@Entity
public class Godowns {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int godownid;
	private String godownlocation;
	private String godownmanager;
	private String godownItemsCount;
	private BigInteger image;
	private String Name;
	
	public Godowns(int godownid, String godownlocation, String godownmanager, String godownItemsCount, BigInteger image,
			String name) {
		super();
		this.godownid = godownid;
		this.godownlocation = godownlocation;
		this.godownmanager = godownmanager;
		this.godownItemsCount = godownItemsCount;
		this.image = image;
		this.Name = name;
	}
	public Godowns() {
		super();
	}
	public int getGodownid() {
		return godownid;
	}
	public void setGodownid(int godownid) {
		this.godownid = godownid;
	}
	public String getGodownlocation() {
		return godownlocation;
	}
	public void setGodownlocation(String godownlocation) {
		this.godownlocation = godownlocation;
	}
	public String getGodownmanager() {
		return godownmanager;
	}
	public void setGodownmanager(String godownmanager) {
		this.godownmanager = godownmanager;
	}
	public String getGodownItemsCount() {
		return godownItemsCount;
	}
	public void setGodownItemsCount(String godownItemsCount) {
		this.godownItemsCount = godownItemsCount;
	}
	public BigInteger getImage() {
		return image;
	}
	public void setImage(BigInteger image) {
		this.image = image;
		
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	@Override
	public String toString() {
		return "Godowns [godownid=" + godownid + ", godownlocation=" + godownlocation + ", godownmanager="
				+ godownmanager + ", godownItemsCount=" + godownItemsCount + ", image=" + image + ", Name=" + Name
				+ "]";
	}
	
}