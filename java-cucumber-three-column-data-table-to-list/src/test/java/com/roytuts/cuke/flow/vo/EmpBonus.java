package com.roytuts.cuke.flow.vo;

import java.util.Map;

public class EmpBonus {

	private String designation;
	private Integer bonus;
	private Integer noOfEmployees;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getBonus() {
		return bonus;
	}

	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}

	public Integer getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(Integer noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	//Cucumber 6.10.3
	public static EmpBonus createEmpBonus(Map<String, String> entry) {
		EmpBonus empBonus = new EmpBonus();
		empBonus.setDesignation(entry.get("designation"));
		empBonus.setBonus(Integer.parseInt(entry.get("bonus")));
		empBonus.setNoOfEmployees(Integer.parseInt(entry.get("noOfEmployees")));
		return empBonus;
	}
	//Cucumber 6.10.3
}
