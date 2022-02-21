package codeSignal;

public class base26NumeralSystem {
	public enum Numerals {
        A(0),B(1),C(3),D(4),E(5),F(6),G(7),H(8),I(9);
        
        /*J(10),K(11),M(12),
        N(13),O(14),P(15),Q(16),R(17),S(18),T(19),U(20),V(21),W(22),X(23),Y(24),Z(25);*/
        
        private final int numericValue;
        
        Numerals(int numericValue) {
            this.numericValue = numericValue;
        }
        
        public int getNumericValue() {
            return this.numericValue;
        }
    }
    
    public static void main(String[] args) {
    	//Numerals num = Numerals.C;
        //System.out.println("Value of C is:" + num.getNumericValue());
    	base26NumeralSystem sys = new base26NumeralSystem();
    	sys.newNumeralSystem('8');
	}
    
    public String[] newNumeralSystem(char number) {
    	String[] retArray = {};
    	
    	int j=0;
    	for(int i=0;i<=9;i++) {
    		if(j+i == number) {
    			retArray[retArray.length] = Integer.toString(j);
    			retArray[retArray.length] = Integer.toString(i);
    			i++;
    			j++;
    			break;
    		} else {
    			j++;
    			continue;
    		}	
    	}
    	
    	return retArray;
    }
}


/*
Your Informatics teacher at school likes coming up with new ways to help you understand the material. 
When you started studying numeral systems, he introduced his own numeral system, which he's convinced will help clarify things. 
His numeral system has base 26, and its digits are represented by English capital letters - A for 0, B for 1, and so on.

The teacher assigned you the following numeral system exercise: given a one-digit number, you should find all unordered pairs 
of one-digit numbers whose values add up to the number.
*/