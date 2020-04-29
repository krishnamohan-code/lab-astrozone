package service;

import model.User;

public class AstroCalculator{
//	public String toString(User p) 
//	{
//		return "Name:"+p.getName()+"\nGender:"+p.getGender()+"\nDOB:"+p.getDob();
//	}


	public String findSign(User p )
	{
		String [] date=p.getDob().split("-");
		System.out.println(date);
		int day=Integer.parseInt(date[0]);
		int month=Integer.parseInt(date[1]);
		System.out.println(day);
		System.out.println(month);
		String astro="";
		  if (month == 12){ 
		        if (day < 22) 
		        astro  += "Sagittarius"; 
		        else
		        astro +="Capricorn"; 
		    } 
		          
		    else if (month == 1){ 
		        if (day < 20) 
		        astro += "Capricorn"; 
		        else
		        astro += "Aquarius"; 
		    } 
		          
		    else if (month == 2){ 
		        if (day < 19) 
		        astro += "Aquarius"; 
		        else
		        astro += "Pisces"; 
		    } 
		          
		    else if(month == 3){ 
		        if (day < 21)  
		        astro += "Pisces"; 
		        else
		        astro = "Aries"; 
		    } 
		    else if (month == 4){ 
		        if (day < 20) 
		        astro += "Aries"; 
		        else
		        astro += "Taurus"; 
		    } 
		          
		    else if (month == 5){ 
		        if (day < 21) 
		        astro += "Taurus"; 
		        else
		        astro += "Gemini"; 
		    } 
		          
		    else if( month == 6){ 
		        if (day < 21) 
		        astro += "Gemini"; 
		        else
		        astro += "Cancer"; 
		    } 
		          
		    else if (month == 7){ 
		        if (day < 23) 
		        astro += "Cancer"; 
		        else
		        astro += "Leo"; 
		    } 
		          
		    else if( month == 8){ 
		        if (day < 23)  
		        astro += "Leo"; 
		        else
		        astro += "Virgo"; 
		    } 
		          
		    else if (month == 9){ 
		        if (day < 23) 
		        astro += "Virgo"; 
		        else
		        astro += "Libra"; 
		    } 
		          
		    else if (month == 10){ 
		        if (day < 23) 
		        astro += "Libra"; 
		        else
		        astro += "Scorpio"; 
		    } 
		          
		    else if (month == 11){ 
		        if (day < 22) 
		        astro += "Scorpio"; 
		        else
		        astro += "Sagittarius"; 
		    } 
		   return astro;
	}
}
