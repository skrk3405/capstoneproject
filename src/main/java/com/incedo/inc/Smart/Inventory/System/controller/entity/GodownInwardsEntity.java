package com.incedo.inc.Smart.Inventory.System.controller.entity;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity

public class GodownInwardsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String godownid;
	private String itemname;
	private LocalDate dateofsupply;
	private LocalDate dateofdelivery;
	private String invoiceno;
	private String suplier;
	private int quantity;
	public GodownInwardsEntity(int id, String godownid, String itemname, LocalDate dateofsupply,
			LocalDate dateofdelivery, String invoiceno, String suplier, int quantity) {
		super();
		this.id = id;
		this.godownid = godownid;
		this.itemname = itemname;
		this.dateofsupply = dateofsupply;
		this.dateofdelivery = dateofdelivery;
		this.invoiceno = invoiceno;
		this.suplier = suplier;
		this.quantity = quantity;
	}
	public GodownInwardsEntity() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGodownid() {
		return godownid;
	}
	public void setGodownid(String godownid) {
		this.godownid = godownid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public LocalDate getDateofsupply() {
		return dateofsupply;
	}
	public void setDateofsupply(LocalDate dateofsupply) {
		this.dateofsupply = dateofsupply;
	}
	public LocalDate getDateofdelivery() {
		return dateofdelivery;
	}
	public void setDateofdelivery(LocalDate dateofdelivery) {
		this.dateofdelivery = dateofdelivery;
	}
	public String getInvoiceno() {
		return invoiceno;
	}
	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}
	public String getSuplier() {
		return suplier;
	}
	public void setSuplier(String suplier) {
		this.suplier = suplier;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "GodownInwardsEntity [id=" + id + ", godownid=" + godownid + ", itemname=" + itemname + ", dateofsupply="
				+ dateofsupply + ", dateofdelivery=" + dateofdelivery + ", invoiceno=" + invoiceno + ", suplier="
				+ suplier + ", quantity=" + quantity + "]";
	}
}