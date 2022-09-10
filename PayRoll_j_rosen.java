//****************************************************************************** 
// Jay Rosen
// 10/16/14
// COP2660.0M1
// Module 7 : PayRoll_j_rosen.java
//
// This program calculates the payroll of seven employees.
//******************************************************************************

public class PayRoll_j_rosen
{
	// Array for employees
	private int[] employeeID = {5658845, 4520124, 7895122, 8777541, 8451277, 1302850, 7580489};
   
   // Array for hours worked by employees
	private int[] hours = new int[7];
	
   // Array for hourly payrate
	private double[] payRate = new double[7]; 
	
	// Array for gross pay
	private double[] wages = new double[7]; 


	/** The setHours method accepts an argument that is stored in the hours field.
       @param hours The hours worked by employee. */
   
   
	public void setHours(int index, int hours)
	{
		this.hours[index] = hours;
	}

	/** The setpayRate method accepts an argument that is stored in the payRate field.
       @param payRate The hourly payrate of employee. */

	public void setpayRate(int index, double payRate)
	{
		this.payRate[index] = payRate;
	}


	/** The setemployeeID method accepts an argument that is stored in the employeeID field.
	    @param employeeID The employee's identification. */

	public void setEmployeeID(int index, int employeeID  )
	{
		this.employeeID[index] = employeeID;
	}


	/** The setWages method accepts an argument that is stored in the wages field.
       @param wages The amount to pay the employee. */

	public void setWages(int index, double wages)
	{
		this.wages[index] = wages;
	}

	/** The getHours method returns the hours field.
       @return hours The hours worked by employee. */

	public double getHours(int index)
	{
		return hours[index];
	}

	/** The getpayRate method returns the payRate field.
	    @return payRate The hourly payrate of employee. */

	public double getpayRate(int index)
	{
		return payRate[index];
	}

	/** The getemployeeID method returns the employeeID field.
	    @return employeeID The employee's identification. */

	public double getEmployeeID(int index)
	{
		return employeeID[index];
	}

	/** The getmethod returns the payRate field.
	    @return wages The amount to pay the employee. */

	public double getWages(int index)
	{
		return wages[index];
	}

	/** The TotalGrossPay method accepts an employee's id as an argument 
       and return the gross pay for the employee. */
   
   
public void TotalGrossPay ()
	{
		for (int index = 0; index < employeeID.length; index++ )
		
			   wages[index] = hours[index] * payRate[index];
	} 
}
