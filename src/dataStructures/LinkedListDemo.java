package dataStructures;

import java.util.LinkedList;

public class LinkedListDemo {
	
	
	//creates a new node with passed in data, 
	//set its nextItem to null 
	//make previousItem's next to point to newly created node
	//return previousItem
	public static LinkedListNode insertInEnd(int data, LinkedListNode previousItem) {
		LinkedListNode newItem = new LinkedListNode(data);
		newItem.nextItem = null;
		previousItem.nextItem = newItem;
		return previousItem;
	}
	
	//creates a new node with provided data 
	//sets its nextItem to nextItem
	public static LinkedListNode insertInBeginning(int data, LinkedListNode nextItem) {
		LinkedListNode beginningItem = new LinkedListNode(data);
		beginningItem.nextItem = nextItem;
		
		return beginningItem;
	}
	
	
	public static LinkedListNode insertInBeginDemo() {
		//This is the linked list first node
		//LinkedListNode firstNode = new LinkedListNode(5);
		LinkedListNode firstNode = null;
		
		//Check if the first node exists or not 
		LinkedListNode nodeToInsert = new LinkedListNode(4);
		LinkedListNode modifiedLLNode = insertInBeginning(nodeToInsert.data, firstNode);
		
		LinkedListNode nodeToInsert2 = new LinkedListNode(3);
		modifiedLLNode = insertInBeginning(nodeToInsert2.data, modifiedLLNode);
		
		return modifiedLLNode;
	}
	
	public static LinkedListNode insertInEndDemo() {
		//This is the linked list first node
		LinkedListNode firstNode = new LinkedListNode(5);
		//LinkedListNode firstNode = null;
		LinkedListNode nodeToInsert = new LinkedListNode(7);
		
		if(firstNode != null) {
			firstNode.nextItem = nodeToInsert;
		}
		
		return firstNode;
	}
	
	public static void main(String[] args) {
		LinkedListNode modifiedLLNode = insertInBeginDemo();
		LinkedListNode modifiedLLNode2 = 
		
		//Traversal for printing
		LinkedListNode currentNode = modifiedLLNode!=null ? modifiedLLNode : null;
		if(currentNode != null) {
			do {
				 System.out.println("Data in current node: " + currentNode.data + " Next item: " + currentNode.nextItem);
				 currentNode = currentNode.nextItem;
			} while(currentNode != null);
		} else {
			System.out.println("Empty ll");
		}
		
	}
}
