package com.coding.assignment01;

class SuperDepartment								//super class
{
	public String departmentName()
	{
		return "Super Department";					//to return the super department
	}
	public String getTodaysWork()
	{
		return "No Work as of now";					//to return no work text for Super Department
	}
	public String getWorkDeadline()
	{
		return "Nil";							
	}
	public String isTodayAHoliday()
	{
		return "Today is not a Holiday";			
	}
}

class AdminDepartment extends SuperDepartment		//AdminDepartment extends SuperDepartment
{
	public String departmentName()
	{
		return "Admin Department";					
	}
	
	public String getTodaysWork()
	{
		return "Complete your documents Submission";	
	}
	public String getWorkDeadline()
	{
		return "Complete by EOD";						
	}
}

class HrDepartment extends SuperDepartment				
{
	public String departmentName()
	{
		return "HR Department";							
	}
	public String getTodaysWork()						
	{
		return "Fill today's timesheet and mark your attendance";
	}
	public String getWorkDeadline()						
	{
		return "Complete by EOD";
	}
	public String doActivity()
	{
		return "team Lunch";
	}
}

class TechDepartment extends SuperDepartment			
{
	public String departmentName()						
	{
		return "Tech Department";
	}
	public String getTodaysWork()						
	{
		return "Complete coding of module 1";
	}
	public String getWorkDeadline()						
	{
		return "Complete by EOD";
	}
	public String getTechStackInformation()
	{
		return "core Java";
	}
}

public class Main
{
	public static void main(String[] args)
	{
		AdminDepartment ad=new AdminDepartment();						
		System.out.println("Welcome to "+ad.departmentName());			
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		
		HrDepartment hr=new HrDepartment();								
		System.out.println("Welcome to "+hr.departmentName());			
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		TechDepartment td=new TechDepartment();							
		System.out.println("Welcome to "+td.departmentName());			
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
	}
}