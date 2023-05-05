package com.incedo.inc.Smart.Inventory.System.controller.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class GodownOutEntity{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int godownid;
	private String itemname;
	private String deliveredto;
	private String purpose;
	private LocalDate dateofsupply;
	private LocalDate dateofdelivery;
	private int invoiceno;
	private String billcheckedby;
	private Double billvalue;
	private Double totalamount;
	private int quantity;
	private String receiptno;
	
	public GodownOutEntity(int godownid, String itemname, String deliveredto, String purpose, LocalDate dateofsupply,
			LocalDate dateofdelivery, int invoiceno, String billcheckedby, Double billvalue, Double totalamount,
			int quantity, String receiptno) {
		super();
		this.godownid = godownid;
		this.itemname = itemname;
		this.deliveredto = deliveredto;
		this.purpose = purpose;
		this.dateofsupply = dateofsupply;
		this.dateofdelivery = dateofdelivery;
		this.invoiceno = invoiceno;
		this.billcheckedby = billcheckedby;
		this.billvalue = billvalue;
		this.totalamount = totalamount;
		this.quantity = quantity;
		this.receiptno = receiptno;
	}
	public GodownOutEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getGodownid() {
		return godownid;
	}
	public void setGodownid(int godownid) {
		this.godownid = godownid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getDeliveredto() {
		return deliveredto;
	}
	public void setDeliveredto(String deliveredto) {
		this.deliveredto = deliveredto;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
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
	public int getInvoiceno() {
		return invoiceno;
	}
	public void setInvoiceno(int invoiceno) {
		this.invoiceno = invoiceno;
	}
	public String getBillcheckedby() {
		return billcheckedby;
	}
	public void setBillcheckedby(String billcheckedby) {
		this.billcheckedby = billcheckedby;
	}
	public Double getBillvalue() {
		return billvalue;
	}
	public void setBillvalue(Double billvalue) {
		this.billvalue = billvalue;
	}
	public Double getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(Double totalamount) {
		this.totalamount = totalamount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getReceiptno() {
		return receiptno;
	}
	public void setReceiptno(String receiptno) {
		this.receiptno = receiptno;
	}
	@Override
	public String toString() {
		return "GodownInEntity [godownid=" + godownid + ", itemname=" + itemname + ", deliveredto=" + deliveredto
				+ ", purpose=" + purpose + ", dateofsupply=" + dateofsupply + ", dateofdelivery=" + dateofdelivery
				+ ", invoiceno=" + invoiceno + ", billcheckedby=" + billcheckedby + ", billvalue=" + billvalue
				+ ", totalamount=" + totalamount + ", quantity=" + quantity + ", receiptno=" + receiptno + "]";
	}
	
}