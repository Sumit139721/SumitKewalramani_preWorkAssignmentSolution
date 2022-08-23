import java.util.Scanner;

public class PracticeAssignment01 {
	
	//main method which contains switch and do while loop
	public static void main(String[] args) {

        PracticeAssignment01 obj = new PracticeAssignment01();

        int choice;

        Scanner sc = new Scanner(System.in);

        do {

        	System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

        	System.out.println();



        	choice = sc.nextInt();

        	switch (choice) {
        	case 0: 

        		choice = 0;
        	
        	break;
        	
        	case 1: {
        		obj.checkPalindrome();
        	}
        	break;

        	case 2: {
        		obj.printPattern();
        	}

        	break;

        	case 3: {
        		obj.checkPrimeNumber();
        	}

        	break;

        	case 4: {
        		obj.printFibonacciSeries();

        	}

        	break;

        	default:

        		System.out.println("Invalid choice. Enter a valid no.\n");

        	}



        } while (choice != 0);

        System.out.println("Exited Successfully!!!");

        sc.close();

	}
		Scanner sc = new Scanner(System.in);
		

        //function to checkPalindrome

		public void checkPalindrome()  {
			
			int num1, sum=0, temp;
			System.out.println("Enter the number to check Palindrome: ");
			num1 = sc.nextInt();
			temp=num1;
			
			while(num1>0) {
				int remainder = num1%10;
				sum=(sum*10)+remainder;
				num1=num1/10;
			}
			if (temp==sum) {
				System.out.println("Number is pallindrome");
			}
			else {
				System.out.println("Number is not pallindrome");
			}
		}
		
	            //function to printPattern

	       public void printPattern() {
	    	   System.out.println("Enter the number to print pattern: ");
	    	   int num1=sc.nextInt();
	    	   String pattern="";
	    	   if(num1>0) {
	    		   for(int i=num1;i>0;i--) {
	    			   for(int j=0;j<i;j++) {
	    				   pattern +="*";
	    			   }
	    			   System.out.println(pattern);
	    			   pattern="";
	    		   }
	    		   System.out.println();
	    	   }
	    	   else {
	    		   System.out.println("Invalid number");
	    	   }
	      }

	 

	          //function to check no is prime or not

	        public void checkPrimeNumber() {
	        	System.out.println("Enter a number to check whetherit a prime no \n");
	        	int value = sc.nextInt();
	        	boolean flag = false;
	        	for (int i = 2; i <= value / 2; ++i) {
	        		// condition for non-prime number
	        		if (value % i == 0) {
	        			flag = true;
	        			break;
	        		}
	        	}
	        	if (!flag)
	        		System.out.println(value + " is a prime number.");
	        	else
	        		System.out.println(value + " is not a prime number.");
	        	
	        	System.out.println();
	        }

	         

	          // function to print Fibonacci Series

	          public void printFibonacciSeries() {

	                //initialize the first and second value as 0,1 respectively.

	           int first = 0, second = 1;
	           System.out.println("Enter the number to print fibonacci series\n");
	           int num1=sc.nextInt();
	           if(num1==0) {
	        	   System.out.println(first);
	           }else if(num1==1) {
	        	   System.out.println(first+", "+second);
	           }else {
	        	   System.out.print(first+", "+second);
	        	   while(num1>1) {
	        		   int temp=first+second;
	        		   System.out.print(", "+temp);
	        		   first=second;
	        		   second=temp;
	        		   num1 -= 1;
	        	   }
	           }
	           System.out.println();
	           System.out.println();
	           
	          }
}
	 

	

	      