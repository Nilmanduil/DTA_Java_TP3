package dta.tgoudouneix.formulas;

public class Product implements Formula {
	private MathematicalObject var1;
	private MathematicalObject var2;
	
	public Product(MathematicalObject var1, MathematicalObject var2) {
		this.var1 = var1;
		this.var2 = var2;
	}

	@Override
	public String asString() {
		String result = "(";
		
		/*if(var1.getClass().getSimpleName() == "Variable") {
			result += var1.getName();
		}
		else if(var1.getClass().getSimpleName() == "Formula") {
			result += var1.asString();
		}
		
		result += "+";
		
		if(var2.getClass().getSimpleName() == "Variable") {
			result += var2.getName();
		}
		else if(var2.getClass().getSimpleName() == "Formula") {
			result += var2.asString();
		}*/
		
		result += var1.asString();
		result += "*";
		result += var2.asString();
		
		result += ")";
		return result;
	}

	@Override
	public double asValue() {
		return this.var1.asValue() * this.var2.asValue();
	}
}
