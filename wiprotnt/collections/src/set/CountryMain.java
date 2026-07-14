package set;

public class CountryMain {
	public static void main(String[] args) 
	{
        Country obj = new Country();
        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Canada");
        obj.saveCountryNames("Germany");
        System.out.println("Countries : " + obj.H1);
        String result = obj.getCountry("India");
        if (result != null)
            System.out.println("Country Found : " + result);
        else
            System.out.println("Country Not Found");
    }
}
