public class PayRoll 
{
	// Fields
	
	// Create and initialize an array.
	private int[] employeeID = {5658845, 4520124, 7895122,
								8777541, 8451277, 1302850,
								7580489};
   
   // The array holds the hours worked by each employee.
	private int[] hours = new int[7];
	
    // The array holds the hourly pay rate.
	private double[] payRate = new double[7]; 
	
	// The array holds the employee's gross wages.
	private double[] wages = new double[7]; 

	//double grossPay; // The total employee's grossPay.


	/*
	 The setHours method accepts an argument that is stored
	 in the hours field.
	*/

	public void setHours(int index, int hours)
	{
		this.hours[index] = hours;
	}

	/*
	 The setpayRate method accepts an argument that is stored
	 in the payRate field.
	*/

	public void setpayRate(int index, double payRate)
	{
		this.payRate[index] = payRate;
	}

	/*
	 The setemployeeID method accepts an argument that is stored
	 in the employeeID field.
	*/

	public void setEmployeeID(int index, int employeeID  )
	{
		this.employeeID[index] = employeeID;
	}


	/*
	 The setWages method accepts an argument that is stored
	 in the wages field.
	*/

	public void setWages(int index, double wages)
	{
		this.wages[index] = wages;
	}

	/*
	 The getHours method returns the hours field.
	*/

	public double getHours(int index)
	{
		return hours[index];
	}

	/*
	 The getpayRate method returns the payRate field.
	*/

	public double getpayRate(int index)
	{
		return payRate[index];
	}

	/*
	 The getemployeeID method returns the employeeID field.
	*/

	public double getEmployeeID(int index)
	{
		return employeeID[index];
	}

	/*
	 The getmethod returns the payRate field.
	*/

	public double getWages(int index)
	{
		return wages[index];
	}

	/*
	 The TotalGrossPay method accepts an employee's identificaton
	 number as an argument and return the gross pay for the employee.
	*/
   
   
public void TotalGrossPay ()
	{
		//int hours = 0;
		//double payRate = 0;
		//double wages = 0;

		for (int index = 0; index < employeeID.length; index++ )
		{
			wages[index] = hours[index] * payRate[index];

		}






	} // End of the TotalGrossPay method.

	

}
