package dta.tgoudouneix.stringFilters;

public class LowerCaseStringFilter implements StringFilter {

	@Override
	public String filter(String s) {
		return s.toLowerCase();
	}

}
