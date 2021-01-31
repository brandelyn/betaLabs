package betaLabs;

public class BetaLabsWeek3 {

	public static void main(String[] args) {

		// create an array with the following values 1,5,2,8,13,6
//		 int[] numbers = new int[6];
//		 
//		 numbers[0] = 1;
//		 numbers[1] = 5;
//		 numbers[2] = 2;
//		 numbers[3] = 8;
//		 numbers[4] = 13;
//		 numbers[5] = 6;
		// or
		int[] numbers = { 1, 5, 2, 8, 13, 6 };

		// print out the first element in the array
		System.out.println(numbers[0]);

		// print out the last element in the array without using the number 5
		System.out.println(numbers[numbers.length - 1]);

		// print out the element in the array at position 6. what happens?
		// System.out.println(numbers[6]); If I print this it will be out of bounds

		// print out the element in the array at position -1. what happens?
		// System.out.println(numbers[-1]);same thing as above out of bounds

		// write a traditional for loop that prints out each element in the array
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);

			// write an enhanced for loop that prints out each element in the array
			for (int number : numbers) {
				System.out.println(number);
			}

			// create a new variable called sum, write a loop that adds each element in the
			// array to the sum

			double sum = 0;
			for (int number : numbers) {
				sum += number;
			}
			System.out.println(sum);

			// create a new variable called average and assign the average value of the
			// array to it

			double average = sum / numbers.length;
			System.out.println(average);

			// write an enhanced for loop that prints out each number in the array only if
			// the number is odd
			for (int number : numbers) {
				if (number % 2 == 1) {
					System.out.println(number);
				}
				// create an array that contains the values "Sam", "Sally", "Thomas", and
				// "Robert"

				String[] names = { "Sam", "Sally", "Thomas", "Robert" };

				// calculate the sum of all the letters in the new array

				int sumOfLetters = 0;
				for (String name : names) {
					sumOfLetters += name.length();
					System.out.println(sumOfLetters);
				}

				// write and test a method that takes a String name and prints out a greeting,this method returns nothing
				
				greeting("Tom");
				greeting("Sally");
				
				//write and test a method that takes a String name and returns a greeting, do not print in the method
				
				System.out.println(greet("Bob"));
				String greeting = greet("Ally");
				System.out.println(greeting);
				
				//analyze the difference between these two methods- What do you find? How are they different?
				// the first method looks cleaner but if you wanted to print out multiples it will be too many lines
				//the second method will be useful if your trying to print out sum or averages it will have values.
				
				//write and test a method that takes a String and an int and returns true if the number of letters in the string is greater than the int
				
				System.out.println(isStringGreater("Hello", 3));
				
				//write and test a method that takes an array of string and a string and returns true if the string passed in exists in the array
				
				System.out.println(doesArrayContainString(names, "Sally"));
				
				//write and test a method that takes an array of int and returns the smallest number in array
				
				System.out.println(smallestInArray(numbers));
				
				//write and test a method that takes an array of double and returns average
				double[] doubles = {12.1, 34.6, 89.3};
				
				System.out.println(calculateAverage(doubles));
				
				/*
				 * write and test a method that takes an array of Strings and returns an array of int where each element
				 * matches the length of the string at that position
				 */
				int[] nameLengths = extractStringLengths(names);
				for (int number2 : nameLengths) {
					System.out.println(number2);
				}
				/*
				 *write and test a method that takes an array of strings and returns true if the sum of letters for all strings with an 
				 *even amount of letters is greater than the sum of those with an odd amount of letters 
				 */
				System.out.println(hasMoreEvenWordCharacters(names));
				
				//write and test a method that takes a string and returns true if the string is a palindrome
				// a palidrome is a word or sentence that reads the same going forwards and backwards
				
				System.out.println(isPalindrome("rotator"));
				
			}
		}
					
				
			}
		public static void greeting(String name) {
			System.out.println("Hello, " + name + "!");

		}

	
       public static String greet(String name) {
    	   return "Hi, " + name + "!";
       }
       
       public static boolean isStringGreater (String string, int number) {
    	   if(string.length() > number) {
    		   return true;
    	   }
    	   return false;
    	   
    	   //or return string.length() > number; this is easier
    	   
    	   
    	   }
       public static boolean doesArrayContainString(String[] array, String string) {
    	   for(String str : array) {
    		   if(str.equals(string)) {
    			   return true;
    		   }
    	   }
    		   return false;
    	   }
       public static int smallestInArray(int[] numbers) {
    	   int smallest = numbers[0];
    	   for(int number : numbers) {
    		   if (number < smallest) {
    			   smallest = number;
    		   }
    	   }
    	   return smallest;
       }
       public static double calculateAverage(double[] numbers) {
    	   double sum = 0;
    	   for(double number : numbers) {
    		   sum += number;
    		   
    	   }
    	   return sum / numbers.length;
       }
       public static int[] extractStringLengths(String[] strings) {
    	   int[] results = new int[strings.length];
    	   for(int i = 0; i < strings.length; i++) {
    		   results[i] = strings[i].length();
    		   }
    	   return results;
       }
       public static boolean hasMoreEvenWordCharacters(String[] array) {
    	   int evenLetters = 0;
    	   int oddLetters = 0;
    	   
    	   for(String string : array) {
    		   if(string.length() % 2 == 0) {
    			   evenLetters += string.length();
    		   }else {
    			   oddLetters += string.length();
    		   }
    	   }
    	   return evenLetters > oddLetters;
    	   
       }
       public static boolean isPalindrome(String string) {
    	   for(int i = 0; i < string.length() / 2; i++) {
    		   if(string.charAt(i) != string.charAt(string.length() - i - 1)) {
    			   return false;
    		   }
    	   }
    	   return true;
       }
}

       
    	   
       


