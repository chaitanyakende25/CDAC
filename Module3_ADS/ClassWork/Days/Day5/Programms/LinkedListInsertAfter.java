class LinkedListInsertAfter{
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
	
	void insertAfter(Node prev_node, int new_data){
		Node new_node=new Node(new_data);//creating new node
		new_node.next=prev_node.next;//assigning prev_node.next value to new_node.next.
		prev_node.next=new_node;// assigning prev_node.next=new_node
		
	}
	
	public static void main(String [] args){
		LinkedListInsertAfter l=new LinkedListInsertAfter();
		
		l.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		
		l.head.next=second;
		second.next=third;
		
		l.display();
		l.insert(40);
		l.insert(50);
		l.insertAfter(l.head.next,60);
		
		l.insertAfter(l.head.next.next,70);
		System.out.println();
		l.display();
		
	}

}