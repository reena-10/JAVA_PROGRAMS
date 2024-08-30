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
    
    //Merge
     public static Node MergeList(Node list1, Node list2) {
    	    Node current = new Node(0);
    	    Node tail = current; // temp. variable
    	    while (list1 != null && list2 != null) {
    	        if (list1.data <= list2.data) {
    	            tail.next = list1;
    	            list1 = list1.next;
    	        } else {
    	            tail.next = list2;
    	            list2 = list2.next;
    	        }
    	        tail = tail.next;
    	    }
    	    if (list1 != null) {
    	        tail.next = list1;
    	    }
    	    if (list2 != null) {
    	        tail.next = list2;
    	    }
    	    return current.next;
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

    Node mergedList = Merge_List.MergeList(list1.head, list2.head);
    Merge_List merged = new Merge_List();
    merged.head = mergedList;
    System.out.println("Merged List");
    merged.PrintList();
	}

}
