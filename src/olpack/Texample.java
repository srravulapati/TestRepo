package olpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Texample {
	// public class TesNG_Example1 
	// {
	        @Test(priority=0)
	        public void addition()
	        {
	            int a,b,c;
	            a=10;
	            b=12;
	            c=a+b;
	            Reporter.log("Sum of "+a+" & "+b+" : "+c,true);
	        }
	        @Test(priority=3)
	        public void substraction()
	        {
	            int a,b,c;
	            a=40;
	            b=12;
	            c=a-b;
	            Reporter.log("Difference of "+a+" & "+b+" : "+c ,true);
	        }
	        
	        @Test(priority=2)
	        public void Multiplication()
	        {
	            int a,b,c;
	            a=10;
	            b=12;
	            c=a*b;
	            Reporter.log("Product of "+a+" & "+b+" : " +c,true);
	        }
	        
	        
	        @Test(priority=1, enabled=false)
	        public void division(){
	            int a,b,c;
	            a=10;
	            b=2;
	            c=a/b;
	            Reporter.log("Division of "+a+" & "+b+" : "+c ,true);
	        }
	        
	        @Test(priority=5)
	        public void tables()
	        {
	            for(int i=1; i<=5; i++){
	                System.out.println(i+" Table");
	                System.out.println("---------------------");
	                for(int j=1; j<=10; j++)
	                {
	                    System.out.println(i+" * "+j+" = "+i*j);                
	                }
	                System.out.println("---------------------");
	            }
	        }
	        
	        @Test(priority=4)
	        public void modularDivision()
	        {
	            int a,b,c;
	            a=10;
	            b=2;
	            c=a%b;
	            Reporter.log("Modular Division of "+a+" & "+b+" : "+c ,true);
	        }
  }

