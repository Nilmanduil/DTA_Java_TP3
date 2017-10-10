package dta.tgoudouneix.stringFilters;

public class PrefixStringFilter implements StringFilter {
	private int size;
	
	public PrefixStringFilter(int n) {
		this.size = n;
	}
	
	@Override
	public String filter(String s) {
		return s.substring(0, this.size);
	}

}
