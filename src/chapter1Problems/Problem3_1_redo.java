package chapter1Problems;

public class Problem3_1_redo {
	public static void main(String[] args) {
		String[] testArray = {"(", ")", ")", ")", ")"};
		boolean isMatching = testForMatchingParens(testArray);
		if(isMatching) {
			System.out.println("THe parens are matching");
		}
		else {
			System.out.println("The parens are not matching");
		}
	}
	
	
	public static boolean testForMatchingParens(String[] testArray) {
		String[] tempArray = new String[30];
		boolean isMatching = false;
		int top=0;
		
		for(int i=0; i<testArray.length; i++) {
			//if first String is a ) then end the program - not a balanced paren match
			if(i==0 && testArray[i].equals(")")) {
				return isMatching;
			}
			else {
				//if the first position is an (
				if(i==0 && testArray[i].equals("(")) {
					//first position is a (, insert into the stack and look for a matching )
					tempArray[top] = testArray[i];
					top++;
				}
				
				else if(testArray[i].equals(")")) {
					//pop the ( thats in the array ie set the top element to be a blank
					tempArray[top] = "";
					top--;
				}
			}
		}
		
		if(top == 0) {
			isMatching = true;
		}
		
		return isMatching;
	}
	
}
