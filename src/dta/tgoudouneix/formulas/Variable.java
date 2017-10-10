package dta.tgoudouneix.formulas;

public class Variable implements MathematicalObject {
	private String name;
	private double value;
	
	public Variable(String name, double value) {
		this.name = name;
		this.value = value;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String asString() {
		return this.getName();
	}
	
	public double getValue() {
		return this.value;
	}
	
	public double asValue() {
		return this.getValue();
	}
}
