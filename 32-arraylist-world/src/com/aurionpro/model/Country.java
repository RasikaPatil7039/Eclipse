package com.aurionpro.model;

public class Country {

		private String countrycode;
		private String countryname;
		private int regionid;
		
		

		public Country(String countrycode, String countryname, int regionid) {
			super();
			this.countrycode = countrycode;
			this.countryname = countryname;
			this.regionid = regionid;
		}



		public String getCountrycode() {
			return countrycode;
		}



		public void setCountrycode(String countrycode) {
			this.countrycode = countrycode;
		}



		public String getCountryname() {
			return countryname;
		}



		public void setCountryname(String countryname) {
			this.countryname = countryname;
		}



		public int getRegionid() {
			return regionid;
		}



		public void setRegionid(int regionid) {
			this.regionid = regionid;
		}



		@Override
		public String toString() {
			return "\nCountry [countrycode=" + countrycode + ", countryname=" + countryname + ", regionid=" + regionid
					+ "]";
		}



		
		
		

	}


