package set;
import java.util.TreeSet;
public class CountryTreeSet {
	TreeSet<String> T1 = new TreeSet<>();
    public TreeSet<String> saveCountryNames(String CountryName) 
    {
        T1.add(CountryName);
        return T1;
    }
    public String getCountry(String CountryName) 
    {
        for (String country : T1) 
        {
            if (country.equals(CountryName))
                return country;
        }
        return null;
    }
}
