package chapter1Problems;


public class Problem3_1 {
/*A common problem for compilers and text editors is determining whether the parentheses in a string are balanced and properly nested. 
 * For example, the string ((())())() contains properly nested pairs of parentheses, which the strings )()( and ()) do not. 
 * Give an algorithm that returns true if a string contains properly nested and balanced parentheses, and false if otherwise. 
 * For full credit, identify the position of the first offending parenthesis if the string is not properly nested and balanced.
*/
	
	
public static void main(String[] args) {
	String[] testArray = {"(", ")", "(", "(", "(", ")"};
	boolean result = isValidParenSeq(testArray);
	if(!result) {
		System.out.println("THIS IS NOT A VALID SEQ");
	}
	else {
		System.out.println("THIS IS A VALID SEQ");
	}
}

public static boolean isValidParenSeq(String[] testArray) {
	boolean isValidSeq = false;
	String[] validationArray = new String[testArray.length];
	int top = 0;
	int violatingPos = 0;
	
	for(int i=0;i<testArray.length;i++) {
		
		//if first position contains a ) then string is not balanced so reject	
		if(i==0 && testArray[i].equals(")")) {
				System.out.println("ENCOUNTERED " + testArray[i]);
				return isValidSeq;
			}
		//else if the item is '(' then insert it into the stack
		else if(testArray[i].equals("(")){
			if(top < testArray.length){
				validationArray[top] = testArray[i];
				top++;
				//System.out.println("Encountered a '(', added an item. New top value is: " + top);
			}
			else {
				System.out.println("Size limit reached....");
			}
		}
		//else the item is a ')' thats in position > 1, so pop an open brace from the stack
		else if(i>0 && testArray[i].equals(")")) {
				validationArray[top] = "";
				top--;
				//System.out.println("Encountered a ')', removed an item. New top value is: " + top);
			}
	}
	
	//if validationArray contains any item, that means an equal number of ( and ) were not present in the source array therefore it would return false
	if(top == 0) {
		isValidSeq = true;
	}
		for(String s : validationArray){
			System.out.println("VALIDATION ARRAY IS: " + s);
		}
		return isValidSeq;
	}
}
