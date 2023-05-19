package com.oneosft_Exception_funtion;

public class UseShirt {
	public static void main(String[]args) {
		Shirt s1=new Shirt("Tommy","XXL",1500,"Blue");
		Shirt s2=new Shirt("Allen","XL",1750,"White");
        Shirt s3=new Shirt("Nike","L",2700,"Red");
		Shirt s4=new Shirt("Raymond","M",2500,"Black");
		Shirt[] shirts= {s1,s2,s3,s4};
		int res=s1.price;
		for(Shirt a:shirts) {
			if(a.price>res) {
				res=a.price;
			}
		}
		
	}

}
