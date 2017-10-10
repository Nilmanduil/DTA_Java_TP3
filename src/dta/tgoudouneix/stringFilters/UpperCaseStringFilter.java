package dta.tgoudouneix.stringFilters;

public class UpperCaseStringFilter implements StringFilter {

	@Override
	public String filter(String s) {
		return s.toUpperCase();
	}

}
