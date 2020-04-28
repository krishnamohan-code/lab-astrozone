package model;
import java.time.LocalDate;
//Type your code here
public class User{
	private String name;
//	private String email;
	private String dob;
	private String gender;
	public User( String name,String gender,String dob)
	{
		this.name=name;
//		this.email=email;
		this.dob=dob;
		this.gender=gender;
	}
	//***********************Name*****************************//
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		 this.name=name;
		System.out.println(name);
	}
//	***************************Email*********************************//
//	public String getEmail()
//	{
//		return email;
//	}
//	public   void setEmail(String email)
//	{
//		this.email=email;
//		System.out.println(email);
//	}
	//**********************Dob********************************************//
	public void setDob(String dob)
	{
		this.dob=dob;
		System.out.println(dob);
	}
	public  String getDob()
	{
		return dob;
	}
//	****************************Gender*********************************************//
	public void setGender(String gender)
	{
		this.gender=gender;
		System.out.println(gender);
	}
	public String getGender()
	{
		return gender;
	}
//	public String getGender() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}

