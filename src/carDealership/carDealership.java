package carDealership;
import java.util.*;
import java.lang.*;
public class carDealership {
	String employeeID;
	String CustomerName;
	String carName;
	int countP  =5 ;
	int countAl =5;
	int countAx =5 ;
	Boolean TestDrive;
	
	carDealership(){
		
	}
	
	
	//Checking Whether to give test drive or not
	void TestDrive()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Do You Want Test Drive True/False");
		boolean bn = sc.nextBoolean(); 
		
		if(bn == true)
		{
			System.out.println("You Have Successfully Avail TestDrive For Allion");
		}
		
	}
	
    //Method is Used To Select The Car
	
	
	void selectCar()
	{   
		System.out.println("Which Car Do You Want: Premio Axio Allion");
		Scanner sc = new Scanner(System.in);
		
		
		
		String str= sc.nextLine(); 

		if(str == "Premio")
		{  
			if(countP<1)
			{
				System.out.println("Sorry Out Of Stock");
			}
			System.out.println("You Have Selected Premio Price:$6000");
			countP--;
		}
		if(str == "Allion")
		{
			if(countAl<1)
			{
				System.out.println("Sorry Out Of Stock");
			}
			
			System.out.println("You Have Selected Allion Price:$5000");
			countAl--;
		}
		
		if(str == "Axio")
		{   
			if(countAx<1)
			{
				System.out.println("Sorry Out Of Stock");
			}
			System.out.println("You Have Selected Axio Price:$2000");
			countAx--;
		}
		
		
	}
	
	//Method is used to makePayment
	void paymentMode()
	{
		System.out.println("Do You Want To Make FULL Payment or EMI");
		Scanner sc = new Scanner(System.in);
		String str2 = sc.nextLine();
		
		if(str2.equals("FULL"))
		{
			System.out.println("Purchase Of You Car Is Complete");
		}
		else if(str2.equals("EMI"))
		{
			System.out.println("Enter Your Car Name");
			Scanner sc1 = new Scanner(System.in);
			String str1= sc1.nextLine(); 
			if(str1.equals("Allion"))
			{
				System.out.println("Your Monthly Emi is $"+ 5000/12+" ");
			}
			else if(str1.equals("Premio"))
			{
				System.out.println("Your Monthly Emi is $"+ 6000/12+" ");
			}
			else
			{
				System.out.println("Your Monthly Emi is $"+ 2000/12+" ");
			}
			
		}
		
		else
		{
			System.out.println("Invalid");
		}
		
		
		
		
		
	}
	
	

}


