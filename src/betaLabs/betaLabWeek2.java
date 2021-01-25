package betaLabs;

public class betaLabWeek2 {

	public static void main(String[] args) {
		
		//create a variable name age and assign it a value of 14
		
		int age = 14;
		 
		// print the boolean expression age >= 16 to the console and note the results.
		
		System.out.println(age >= 16);
		age = 19;
		System.out.println(age >= 16);
		
		//using a conditional, print "you can drive if age is greater than or equal to 16
		//and "you cannot drive" otherwise
		//change the value of age and rerun to see the result
		
		boolean hasLicense = false;
		
		if (age >= 16 && hasLicense) {
			System.out.println("You can drive");
		}else {
			System.out.println("You cannot drive");
		}
		 //add a new variable called hasLicense before the conditional
		//change the boolean expression in the conditional to additionally include the need for hasLicense to be true
		//try changing the values of age and hasLicense and note the different results
		// ^^^^
		
		
		//create two new variables costOfMilk and thirstLevel
		//create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50
		// or if thirstLevel is greater than 6 and prints "No Thanks" otherwise
		//change the values and note the different results
		
		double costOfMilk = 3.00;
		int thirstLevel = 7;
		
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please");
		}else {
			System.out.println("No Thanks");
			
		}
		
		//create two variables called numberOfCookies and numberOfChildren
		//you will evenly distribute all of the cookies to the children and as the adult
		//you get to keep the remaining cookies to yourself
		//use a conditional to print the following base on the following conditions:
		//if there are 0 cookies remaining, print "sad face"
		//if there are less than 2 cookies, print "yes!"
		//if there are less than 5 cookies, Print "whoohoo!"
		//if there are 5 or more cookies, print "jackpot!"
		
		int numberOfCookies = 47;
		int numberOfChildren = 27;
		
		int remainingCookies= numberOfCookies % numberOfChildren;
		
		
		if (remainingCookies == 0) {
			System.out.println("sad face");
		}else if (remainingCookies< 2) {
			System.out.println("yes!");
		}else if (remainingCookies < 5) {
			System.out.println("whoohoo!");
		}else {
			System.out.println("jackpot!");
		//this method is easier^^
			
//		if (numberOfCookies % numberOfChildren >= 5) {
//			System.out.println("jackpot!");
//		}else if (numberOfCookies % numberOfChildren >= 2) {
//			System.out.println("whoohoo!");
//		}else if (numberOfCookies % numberOfChildren > 0) {
//			System.out.println("yes!");
//		}else {
//			System.out.println("sad face");
			
			//create a variable called loyaltyMemberStatus and assign the value "SILVER"
			//create a variable called loyaltyMemberDiscount and assign the value 0.0
			//using a switch, set the value of the loyaltyMemberDiscount based one the following loyaltyMemberStatus scale
			//"SILVER" is 0.10, "GOLD is 0.15, and "PLATINUM" is 0.25
			
			String loyaltyMemberStatus = "GOLD";
			double loyaltyMemberDiscount = 0.0;
			
			switch (loyaltyMemberStatus) {
			 case "SILVER":
				loyaltyMemberDiscount = 0.10;
				break;
			 case "GOLD":
				 loyaltyMemberDiscount = 0.15;
				break;
			 case "PLATINUM":
				 loyaltyMemberDiscount = 0.25;
				break;
			}
				System.out.println(loyaltyMemberDiscount);
			
		   //create a variable called billTotal and assign a value
		   //create a variable called adjustedTotal and assign it the billTotal minus the loyaltyMemberDiscount percent of the billTotal
		   //if the adjustedBillTotal is greater than $500 upgrade the loyaltyMemberStatus from SILVER to GOLD or GOLD to PLATINUM
				
				double billTotal = 745.69;
				double adjustedTotal = billTotal - loyaltyMemberDiscount * billTotal;
				
				System.out.println(adjustedTotal);
				
				if (adjustedTotal > 500) {
					if(loyaltyMemberStatus == "SILVER") {
						loyaltyMemberStatus = "GOLD";
					}else if (loyaltyMemberStatus == "GOLD") {
						loyaltyMemberStatus = "Platinum";
						
								
					}
				}
				
			System.out.println(loyaltyMemberStatus);
			
			//create two variables, username and password
			//create a conditional that prints "login successful" if the username is "Tommy123" and the password is "12345"
			//otherwise, print "access denied"
			
			String username = "Pecan22";
			String password = "345675";
			
			if (username.equals( "Tommy123") && password.equals ("12345")) {
				System.out.println("login successful");
			}else {
				System.out.println("Access denied");
			}
			
			
			
		}
		
		
		
		
		
		

     

	}

}
