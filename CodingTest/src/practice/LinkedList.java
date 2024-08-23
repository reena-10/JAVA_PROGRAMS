package practice;

public class LinkedList {
	public static void printLinkedList(Node n) {
		Node current = n;
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
	}
	public static Node reverseList(Node n) {
		Node current = n;
		Node pr
	}
 static class Node{
	 int data;
	 Node next;
	 
	 Node(int d){
		 data = d;
		 next = null;
	 }
 }
	public static void main(String[] args) {
    Node n = new Node(23);
    Node n2 = new Node(44);
    Node n3 = new Node(55);
    Node n4 = new Node(675);
    n.next = n2;
    n2.next.next =n3;
    n.next.next.next =n4;
   //suppose head of the linkedList is n then we have to find last node value
    
    Node current = n;
    if (current.next == null) {
    	System.out.println(current.data);
    }
    while(current.next != null) {
    	current = current.next;
    }
    
    
	}

}
