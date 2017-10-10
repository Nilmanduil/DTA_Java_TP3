package dta.tgoudouneix.stringFilters;

public class CompositeStringFilter implements StringFilter {
	private StringFilter[] filters;
	
	public CompositeStringFilter(StringFilter[] filters) {
		this.filters = filters;
	}
	
	@Override
	public String filter(String s) {
		String result = "" + s;
		
		for(int i = 0; i < this.filters.length; i++) {
			result = this.filters[i].filter(result);
		}
		
		return result;
	}

}
