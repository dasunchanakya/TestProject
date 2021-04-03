package net.codejava.ws;

public class Student {
	private int user_id;
	private String mobile;
	private double monthly_salary;
	private String name;
	private String nic;
	private double pension;
	private String related_date;
	private double years_of_service;
	
	
	
	



	public Student(int user_id, String mobile, double monthly_salary, String name, String nic, double pension,
			String related_date, double years_of_service) {
		super();
		this.user_id = user_id;
		this.mobile = mobile;
		this.monthly_salary = monthly_salary;
		this.name = name;
		this.nic = nic;
		this.pension = pension;
		this.related_date = related_date;
		this.years_of_service = years_of_service;
	}



	public int getUser_id() {
		return user_id;
	}



	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}



	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public double getMonthly_salary() {
		return monthly_salary;
	}



	public void setMonthly_salary(double monthly_salary) {
		this.monthly_salary = monthly_salary;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getNic() {
		return nic;
	}



	public void setNic(String nic) {
		this.nic = nic;
	}



	public double getPension() {
		return pension;
	}



	public void setPension(double pension) {
		this.pension = pension;
	}



	public String getRelated_date() {
		return related_date;
	}



	public void setRelated_date(String related_date) {
		this.related_date = related_date;
	}



	public double getYears_of_service() {
		return years_of_service;
	}



	public void setYears_of_service(double years_of_service) {
		this.years_of_service = years_of_service;
	}
	
	
	
	

}
