package Test;

public class LinkedList {
	Node head;
   static class Node {
	   int data;
	   Node next;
	   
	   Node(int d){
		   data = d;
		   next = null;
	   }
   }
   public void addLast(int data) {
	   Node newNode = new Node(data);
	   if(head==null) {
		   head = newNode;
		   return;
	   }
	   Node curr = head;
	   while(curr.next != null) {
		   curr = curr.next;
	   }
	   curr.next = newNode;
   }
   void printList() {
	   if(head==null) {
		   System.out.println("List is empty");
		   return;
	   }
	   Node curr = head;
	   while(curr != null) {
		   System.out.print(curr.data+" ");
		   curr = curr.next;
	   }
	   System.out.println();
   }
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(12);
		list.head.next = new Node(24);
		list.head.next.next =new Node(36);
		list.head.next.next.next = new Node(48);
	    
		System.out.println("Original List");
		list.printList();
		
		System.out.println("Updated List");
		list.addLast(60);
		list.printList();
	}

}
