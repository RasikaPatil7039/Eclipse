package com.aurionpro.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.Country;
import com.aurionpro.model.Region;

public class RegionCountryTest {

	public static void main(String[] args) {
		List<Region> regions=new ArrayList<>();
		
		regions.add(new Region(1,"europe"));
		regions.add(new Region(2,"america"));
		regions.add(new Region(3,"asia"));
		regions.add(new Region(4,"middle east and africa"));

		//System.out.println(regions);
		
		List<Country> countries=new ArrayList<>();
		countries.add(new Country("it","italy",1));
		countries.add(new Country("jp","japan",3));
		countries.add(new Country("us","america",2));
		countries.add(new Country("ca","canada",2));
		countries.add(new Country("cn","china",3));
		countries.add(new Country("in","india",3));
		countries.add(new Country("au","australia",3));
		countries.add(new Country("zw","zinbabwe",4));
		countries.add(new Country("sg","singapore",3));
		countries.add(new Country("it","italy",1));
		
		System.out.println(countries);
		
		System.out.println("----------------------------------");
		for(Country x:countries) {
			int id=x.getRegionid();
			regions.get(id-1).addCountry(x);
			
		}
		
		System.out.println(regions);
	}

}
