package dta.tgoudouneix.stringFilters;

public class StaticStringUtils {

	public static String[] filter(String[] strings, StringFilter filter) {
		String[] result = strings.clone();
		
		for(int i = 0; i < result.length; i++) {
			result[i] = filter.filter(result[i]);
		}
		
		return result;
	}
}
