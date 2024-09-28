class LinkedListInsertFun{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data=d;
			next=null;
		}
	}
	
	void display(){
		Node n=head;
		while(n!=null){
			System.out.print(n.data+"---->");
			n=n.next;
		}
	}
	
	void insert(int new_data){
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	
	public static void main(String [] args){
		LinkedListInsertFun l=new LinkedListInsertFun();
		
		l.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		
		l.head.next=second;
		second.next=third;
		
		l.display();
		l.insert(40);
		l.insert(50);
		System.out.println();
		l.display();
	}

}