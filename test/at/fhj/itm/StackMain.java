package at.fhj.itm;
/**
 * 
 * @author Jasmin
 * @version 03.06.2016
 *  Stack Implementation of Stack. Last in First out principe.
 *  
 *  
 */


public class StackMain {

	public static void main(String[] args) {
		
		/**
		 * Initialize a new Stack 
		 * 
		 * @param pop 
		 * 		Infer of an element of the pile
		 * 
		 * @param push 
		 * 		Put away of an element on the pile of
		 */
		StringStack stack1 = new StringStack();

		
		String s = stack1.pop();
		System.out.println("pop(): " + s);
		
		stack1.push("x1");
		stack1.push("x2");
		
		
		String s1 = stack1.pop();
		System.out.println("pop(): " + s1);
		
		String s2 = stack1.pop();
		System.out.println("pop (): " + s2);
	
		stack1.push("x3");
		
		String  s3 = stack1.pop();
		System.out.println("pop (): " + s3);
	
	
	}

	
}