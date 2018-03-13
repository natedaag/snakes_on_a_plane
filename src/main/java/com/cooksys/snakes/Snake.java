package com.cooksys.snakes;

import com.cooksys.pets.Victim;

public class Snake extends Object {

	private int teeth;
	private double length;
	private boolean venemous;

	public Snake(int teeth, double length, boolean venemous) {
		super();
		this.teeth = teeth;
		this.length = length;
		this.venemous = venemous;
	}

	public int getTeeth() {
		return teeth;
	}

	public void setTeeth(int teeth) {
		this.teeth = teeth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public boolean isVenemous() {
		return venemous;
	}

	public void setVenemous(boolean venemous) {
		this.venemous = venemous;
	}

	public void bite(Victim victim) {
		victim.receiveBite(venemous);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + teeth;
		result = prime * result + (venemous ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Snake other = (Snake) obj;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (teeth != other.teeth)
			return false;
		if (venemous != other.venemous)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "hisssssgxzadgfghh";
	}
	
	

	
	
}
