package com.offcn.pojo;

import java.io.Serializable;

public class Mobile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private Integer number;
	private String area;
	private String type;
	private Integer areacode;
	private Integer postcode;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getAreacode() {
		return areacode;
	}
	public void setAreacode(Integer areacode) {
		this.areacode = areacode;
	}
	public Integer getPostcode() {
		return postcode;
	}
	public void setPostcode(Integer postcode) {
		this.postcode = postcode;
	}
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", number=" + number + ", area=" + area + ", type=" + type + ", areacode="
				+ areacode + ", postcode=" + postcode + "]";
	}
	
	
	
}
