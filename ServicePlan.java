package com.code;

public enum ServicePlan {
SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);

private double planCost;

private ServicePlan(double planCost) {
	// TODO Auto-generated constructor stub
	this.planCost=planCost;
}
//getter
public double getPlanCost() {
	return planCost;
}
//toString
@Override
public String toString() {
	return name()+" cost " +this.planCost;
}
}
