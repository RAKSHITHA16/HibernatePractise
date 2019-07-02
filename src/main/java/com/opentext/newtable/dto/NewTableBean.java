package com.opentext.newtable.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="emp_extra")

public class NewTableBean implements Serializable {
	
	@Id
	@Column(name="emp_extcurr")
	private String  emp_extcurr;
	
	@Column(name="emp_attitude")
	private String emp_attitude;
	
	@Column(name="emp_social")
	private String emp_social;

	public String getEmp_social() {
		return emp_social;
	}

	public void setEmp_social(String emp_social) {
		this.emp_social = emp_social;
	}

	public String getEmp_attitude() {
		return emp_attitude;
	}

	public void setEmp_attitude(String emp_attitude) {
		this.emp_attitude = emp_attitude;
	}

	public String getEmp_extcurr() {
		return emp_extcurr;
	}

	public void setEmp_extcurr(String emp_extcurr) {
		this.emp_extcurr = emp_extcurr;
	}
	
	

}
