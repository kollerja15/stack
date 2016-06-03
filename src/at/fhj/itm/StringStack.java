package at.fhj.itm;

import java.util.Vector;

/**
 * Stack Implementation of <code>Stack</code> Interface. supports String Values
 * and can be initialized with a maximum number of items.
 * 
 * @see Stack
 * @author jasmin
 * @version 03.06.2016
 * 
 */


public class StringStack implements Stack {

		/**Description of my stack */
		private Vector<String> stack;

		/**
		 * Tests if the Stack is empty.
		 */
		public StringStack() {
			stack = new Vector<String>();
		}

		
		/**
		 *@return if stack is empty true, else false
		 */
		@Override
		public boolean isEmpty() {

			if (stack.size() == 0) {
				return true;
			} else {
				return false;
			}
		}
		
		/**
		 * 
		 * @param item adds item to stack
		 */

		@Override
		public void push(String item) {
			stack.addElement(item);

		}

		
		/**
		 * @return String element if true, else null
		 */
		
		@Override
		public String pop() {

			if(isEmpty() == false){
				String element = stack.get(stack.size() - 1);
				stack.removeElementAt(stack.size() - 1);

				return element;
			}else{
				return null;
			}
		}

	}
	


