package dta.tgoudouneix.stringFilters;

import java.text.Normalizer;

public class UnaccentStringFilter implements StringFilter {

	@Override
	public String filter(String s) {
		s = Normalizer.normalize(s, Normalizer.Form.NFD);
	    s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
	    return s;
	}

}
