package linkedList;

import linkedList.LinkedList_Delete.Node;

public class Merge_List {
	Node head;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    } 
    //print
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
    
	public static void main(String[] args) {
    Merge_List list1 = new  Merge_List();
    list1.head = new Node(1);
    list1.head.next = new Node(3);
    list1.head.next.next = new Node(5);
    list1.head.next.next.next = new Node(7);
    System.out.println("List 1");
    list1.PrintList();
    
    Merge_List list2 = new  Merge_List();
    list2.head = new Node(2);
    list2.head.next = new Node(4);
    list2.head.next.next = new Node(6);
    list2.head.next.next.next = new Node(8);
    System.out.println("List 2");
    list2.PrintList();
    
	}

}
