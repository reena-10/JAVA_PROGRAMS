package linkedList;

public class LinkedList_Delete {
	Node head;
	static class Node{
		int data;
		Node next;
		
	 Node(int d){
		data =d;
		next = null;
	}
}
	void PrintList() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node CurrNode =head;
		while(CurrNode!=null) {
			System.out.print(CurrNode.data+" ");
			CurrNode = CurrNode.next;
		}
		System.out.println();
	}
	//Delete First
	void DeleteFirst() {
		if( head == null){
			System.out.println("List is Empty");
			return;
		}
		head = head.next;
		}
	
	//Delete Last
	void DeleteLast() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		if(head.next==null) {
			head = null;
			return;
		}
		Node SecondLast = head;
		Node LastNode = head.next;
		while (LastNode.next!=null) {
			LastNode = LastNode.next;
			SecondLast = SecondLast.next;
			}
		SecondLast.next=null;
		}
	
	//Delete Middle
	public Node DeleteMiddle() {
		if(head == null) {
			System.out.println("List is empty");
			return null;
		}
		Node slow = head;
		Node fast = head;
		Node pre =null;
		while (fast != null && fast.next != null) {
			pre=slow;
            slow=slow.next;
			fast=fast.next.next;
		}
		pre.next = slow.next;
		return head;
	}
	public static void main(String[] args) {
     LinkedList_Delete list = new LinkedList_Delete();
     list.head= new Node(1);
     list.head.next = new Node(2);
     list.head.next.next= new Node(3);
     list.head.next.next.next = new Node(4);
     list.head.next.next.next.next = new Node(5);

     System.out.println("Original List");
     list.PrintList();
     
     System.out.println("Delete Middle of list");
     list.DeleteMiddle();
     list.PrintList();
     
	}

}
