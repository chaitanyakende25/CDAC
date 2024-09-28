class LinkedList1{

	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			this.data=d;
			next=null;
		}
	}
}

public static void main(String [] args){
LinkedList1 l1=new LinkedList1();
l1.head=new Node(10);//we assining node data=10 to head here;
}
}