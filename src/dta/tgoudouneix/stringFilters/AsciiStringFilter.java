package dta.tgoudouneix.stringFilters;

public class AsciiStringFilter implements StringFilter {

	@Override
	public String filter(String s) {
		byte[] bytes = s.getBytes();
		String result = "";
		
		for(int i = 0; i < bytes.length; i++) {
			if(bytes[i] < 128) {
				result += (char) bytes[i];
			}
		}
		
		return result;
	}

}
