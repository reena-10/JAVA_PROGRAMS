package linkedList;

public class LinkedList {

	    Node head;

	    static class Node {
	        int data;
	        Node next;

	        Node(int d) {
	            data = d;
	            next = null;
	        }
	    } 
	//Add element in first
	   public void addFirst(int data) {
		   Node newNode = new Node(data);
		   if(head == null) {
			   head = newNode;
			   return;
		   }
		   newNode.next = head;
		   head = newNode;
	   }
	//Add element in last
	    public void addLast(int data) {
	    	Node newNode  = new Node(data);
	    	if(head == null) {
	    		head = newNode;
	    		return;
	    	}
	    	Node currNode = head;
	    	while(currNode.next !=null) {
	    		currNode = currNode.next;
	    	}
	    	currNode.next = newNode;
	    }
	//rotate
	    public void Rotate(int k) {
	    	Node curr = head;
	    	if(head == null|k==0) {
	  	    	return;
	    	}
	    	int length =1;
	    	while(curr.next!=null) {
	    		curr = curr.next;
	    		length++;
	    	}
	    	//connect the last node to the head to form a circular Linkedlist
	    	curr.next = head;
	    	//Find the new tail node (length -k%length-1)
	    	Node newTail = head;
	    	for(int i=0; i<length-k%length-1; i++) {
	    		newTail = newTail.next;
	    	}
	    	//find the new head node(newTail.next)
	    	Node newHead = newTail.next;
	    	//Break the circular LinkedList at the new tail node
	    	newTail.next =null;
	    	//update the head of the LinkedList
	    	head = newHead;
	    }
    //reverse
	    void reverse() {
	        Node prev = null;
	        Node current = head;
	        Node next = null;

	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }

	        head = prev;
	    }
        // print
	    void printList() {
	    	if(head == null) {
	    		System.out.println("List is empty");
	    	    return;
	    	}
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    }
       //main method
	    public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        list.head = new Node(1);
	        list.head.next = new Node(2);
	        list.head.next.next = new Node(3);
	        list.head.next.next.next = new Node(4);
	        list.head.next.next.next.next = new Node(5);

	        System.out.println("Original List: ");
	        list.printList();
	        
	        list.addFirst(12);
	        System.out.println("After adding element in first");
	        list.printList();
	        
            list.addLast(20);
            System.out.println("After adding element in last: ");
	        list.printList();
            
	        list.reverse();
	        System.out.println("Reversed List: ");
	        list.printList();
	        
	        list.Rotate(2);
	        list.printList();
	    }
	}