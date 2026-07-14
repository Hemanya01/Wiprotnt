package set;
import java.util.HashSet;
public class Country {
	 HashSet<String> H1 = new HashSet<String>();
	 public HashSet<String> saveCountryNames(String CountryName) 
	 {
	        H1.add(CountryName);
	        return H1;
	 }
	 public String getCountry(String CountryName) 
	 {
	        for (String country : H1) 
	        {
	            if (country.equals(CountryName)) 
	            {
	                return country;
	            }
	        }
	        return null;
	    }
}
