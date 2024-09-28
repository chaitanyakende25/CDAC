class LinkedList1{
	
	Node head; //this head is starting point of list of type node. head will store first node reference.
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data=d;
			next=null; //whenever we create new node it will point to null couse next node not present.
		}
	}
	
	public static void main(String [] args){
		LinkedList1 l1=new LinkedList1();
		l1.head=new Node(10); //here we store reference of node which contain 10, in head.
		Node second=new Node(20);
		Node third=new Node(30);
		
		l1.head.next=second;//here we assining head's next to second node
		second.next=third; // here we assining second head's value to third
		//and third next value point to null.
	}
	
}


/*if we not create Node class static then we will get error like
error: non-static variable this cannot be referenced from a static context
                l1.head=new Node(10); //here we store reference of node which contain 10, in head.
                        ^
						*/