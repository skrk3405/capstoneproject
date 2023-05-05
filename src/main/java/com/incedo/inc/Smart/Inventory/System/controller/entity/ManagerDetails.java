package com.incedo.inc.Smart.Inventory.System.controller.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity

public class ManagerDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int managerid;
	private String ManagerName;
	private String godownid;
	public int getManagerid() {
		return managerid;
	}
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	public String getManagerName() {
		return ManagerName;
	}
	public void setManagerName(String managerName) {
		ManagerName = managerName;
	}
	public String getGodownid() {
		return godownid;
	}
	public void setGodownid(String godownid) {
		this.godownid = godownid;
	}
	public ManagerDetails(int managerid, String managerName, String godownid) {
		super();
		this.managerid = managerid;
		ManagerName = managerName;
		this.godownid = godownid;
	}
	public ManagerDetails() {
		super();
	}
	@Override
	public String toString() {
		return "ManagerDetails [managerid=" + managerid + ", ManagerName=" + ManagerName + ", godownid=" + godownid
				+ "]";
	}
	
	

}
