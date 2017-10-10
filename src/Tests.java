import dta.tgoudouneix.stringFilters.*;
import dta.tgoudouneix.formulas.*;
import dta.tgoudouneix.vectors.*;

public class Tests {

	public static void main(String[] args) {
		System.out.println("Testing DTA packages");
		System.out.println("----------");
		System.out.println(" ");
		System.out.println("String filters package :");
		runStringFilterTests();
		System.out.println("----------");
		System.out.println("Formulas package :");
		runFormulaTests();
		System.out.println("----------");
		System.out.println("Vector package :");
		runVectorTests();
		System.out.println("----------");
	}

	private static void runStringFilterTests() {
		
	}

	private static void runFormulaTests() {
		Variable x = new Variable("x", 2.5);
		Variable y = new Variable("y", 4);
		Formula formula = new Sum(x, new Product(y, new Sum(x, y)));
		System.out.println(formula.asString()); // "(x+(y*(x+y)))"
		System.out.println(formula.asValue()); // "28.5"
		x.setValue(5);
		System.out.println(formula.asValue()); // "41.0
	}

	private static void runVectorTests() {
		
	}
}
