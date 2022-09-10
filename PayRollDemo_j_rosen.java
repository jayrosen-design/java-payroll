//****************************************************************************** 
// Jay Rosen
// 10/16/14
// COP2660.0M1
// Module 7 : PayRollDemo_j_rosen.java
//
// This program calculates the payroll of seven employees.
//******************************************************************************

import java.util.Scanner;

public class PayRollDemo_j_rosen 
{
	public static void main(String[] args) 
	{
		double payRate;   // Hourly pay rate of employee.
		int hours;        // Hours worked by employee.
	

		PayRoll PayRoll = new PayRoll();           // Create an instance of the Payroll class.

		Scanner keyboard = new Scanner(System.in); // Create a Scanner object for keyboard input.

		for (int index = 0; index < 7 ; index++ )
		{
		   System.out.println("Employee " + PayRoll.getEmployeeID(index)); // Get the Employee ID.
		   System.out.println("Enter the hours worked:");                  // Get the hours worked.
		   hours = keyboard.nextInt();
		   PayRoll.setHours(index, hours);
		 
		       while (hours < 0)      // Validate the hours input.
		       {
			       System.out.println("ERROR: You have entered an invalid number, please enter positive number.");
                System.out.println("Enter the hours worked:");
			       hours = keyboard.nextInt();
			       PayRoll.setHours(index, hours);
		       }
		   
         System.out.println("Enter the hourly rate:"); // Get the hourly pay rate.
		   payRate = keyboard.nextDouble();
		   PayRoll.setpayRate(index, payRate);

		       while (payRate < 6.00)    // Validate the payrate input.

		       {
			 		System.out.println("ERROR: You have entered an invalid number, please enter a number that is 6.00 or greater for pay rate.");
               System.out.println("Enter the hours worked:");
			      payRate = keyboard.nextDouble();
		       }       
	   }

		PayRoll.TotalGrossPay();       // Calculate the GrossPay.
		
		for (int index = 0; index < 7 ; index++ )

			System.out.println("Employee " + PayRoll.getEmployeeID(index) + "\n $" + PayRoll.getWages(index));
	}
}
