package calculator.client;

import calculator.service.Calculator;

public class Test {
	
	public static void main(String args[])
	{
		Calculator c=new Calculator();
		
		int i=1;
				//Give the proper msg to call calculator methods 
		switch(i)
		
		{
		
		case 1:
		c.add();
		break;
		
		case 2:
		c.sub();
		break;
		
		case 3:
		c.mul();
		break;
		
		case 4:
		c.div();
		break;
		
		default:
		System.out.println("Input is not match");	
		
			
		}
	
		}
		
}
			//Only call calculator methods here


