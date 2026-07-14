package set;

public class CountryTreeMain {
	public static void main(String[] args) 
	{
        CountryTreeSet obj = new CountryTreeSet();
        obj.saveCountryNames("Italy");
        obj.saveCountryNames("Spain");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("China");
        System.out.println("Countries : " + obj.T1);
        String result = obj.getCountry("Italy");
        if (result != null)
            System.out.println("Country Found : " + result);
        else
            System.out.println("Country Not Found");
    }
}
