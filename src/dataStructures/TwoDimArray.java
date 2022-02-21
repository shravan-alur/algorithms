package dataStructures;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class TwoDimArray {

	public static void main(String[] args) {
		int [][]twoDArray = {
				{1,2},
				{3,4}
			};
			
		for(int i=0; i<2; i++) {
			for(int j=0;j<2;j++) {
				System.out.println(twoDArray[i][j]);
			}
			System.out.println();
		}

	}
		
}