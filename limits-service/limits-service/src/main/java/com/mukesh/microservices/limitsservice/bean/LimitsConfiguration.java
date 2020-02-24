package com.mukesh.microservices.limitsservice.bean;

public class LimitsConfiguration {
	
	private int maximum;
	private int minimum;
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getminimum() {
		return minimum;
	}
	
	public LimitsConfiguration() {
		super();
	}
	public LimitsConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public void setminimum(int minimum) {
		this.minimum = minimum;
	}
	
}
