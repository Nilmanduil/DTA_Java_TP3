package dta.tgoudouneix.stringFilters;

public class PostfixStringFilter implements StringFilter {
	private int size;
	
	public PostfixStringFilter(int n) {
		this.size = n;
	}
	
	@Override
	public String filter(String s) {
		return s.substring(Math.max(0, (s.length() - this.size)));
	}

}
