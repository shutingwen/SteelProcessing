/*
 * Powered By [sp]
 */

package com.sp.net.entity;

import java.io.Serializable;
/**
 * 
 */
public class Material implements Serializable{

	private static final long serialVersionUID = 1L;

	//columns START
	/**
	 * 材料主键
	 */
	private String mid;

	/**
	 * 材料名字
	 */
	private String mname;

	/**
	 * 现存数量
	 */
	private Integer mexistCount;

	/**
	 * 最低数量
	 */
	private Integer mminCount;

	/**
	 * 材料类别
	 */
	private Integer mcategory;

	/**
	 * 材料直径
	 */
	private Double mdiameter;

	/**
	 * 材料长度
	 */
	private Double mlength;

	/**
	 * 材料重量
	 */
	private Double mweight;

	/**
	 * 状态
	 */
	private String state;

	//columns END

	/**
	 * 材料主键
	 */
	public void setMid(String mid) {
		this.mid = mid;
	}
	/**
	 * 材料主键
	 */
	public String getMid() {
		return this.mid;
	}

	/**
	 * 材料名字
	 */
	public void setMname(String mname) {
		this.mname = mname;
	}
	/**
	 * 材料名字
	 */
	public String getMname() {
		return this.mname;
	}

	/**
	 * 现存数量
	 */
	public void setMexistCount(Integer mexistCount) {
		this.mexistCount = mexistCount;
	}
	/**
	 * 现存数量
	 */
	public Integer getMexistCount() {
		return this.mexistCount;
	}

	/**
	 * 最低数量
	 */
	public void setMminCount(Integer mminCount) {
		this.mminCount = mminCount;
	}
	/**
	 * 最低数量
	 */
	public Integer getMminCount() {
		return this.mminCount;
	}

	/**
	 * 材料类别
	 */
	public void setMcategory(Integer mcategory) {
		this.mcategory = mcategory;
	}
	/**
	 * 材料类别
	 */
	public Integer getMcategory() {
		return this.mcategory;
	}

	/**
	 * 材料直径
	 */
	public void setMdiameter(Double mdiameter) {
		this.mdiameter = mdiameter;
	}
	/**
	 * 材料直径
	 */
	public Double getMdiameter() {
		return this.mdiameter;
	}

	/**
	 * 材料长度
	 */
	public void setMlength(Double mlength) {
		this.mlength = mlength;
	}
	/**
	 * 材料长度
	 */
	public Double getMlength() {
		return this.mlength;
	}

	/**
	 * 材料重量
	 */
	public void setMweight(Double mweight) {
		this.mweight = mweight;
	}
	/**
	 * 材料重量
	 */
	public Double getMweight() {
		return this.mweight;
	}

	/**
	 * 状态
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * 状态
	 */
	public String getState() {
		return this.state;
	}




}
