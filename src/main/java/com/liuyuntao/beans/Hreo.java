package com.liuyuntao.beans;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Hreo {
	private Integer hid;
	private String hname;
	private Double price;
	private Integer status;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
	private Date uptime;
	private Integer cid;
	private String cname;
	public Hreo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hreo(Integer hid, String hname, Double price, Integer status, Date uptime, Integer cid, String cname) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.price = price;
		this.status = status;
		this.uptime = uptime;
		this.cid = cid;
		this.cname = cname;
	}
	public Integer getHid() {
		return hid;
	}
	public void setHid(Integer hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getUptime() {
		return uptime;
	}
	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Hreo [hid=" + hid + ", hname=" + hname + ", price=" + price + ", status=" + status + ", uptime="
				+ uptime + ", cid=" + cid + ", cname=" + cname + "]";
	}
	
}
