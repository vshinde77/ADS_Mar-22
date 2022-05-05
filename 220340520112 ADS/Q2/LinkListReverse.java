class LinkListReverse{
	
	static Node head;
	
	static class Node {
		
		
		int data;
		Node next;
		
		
		Node (int d){
			
			data = d;
			next = null;
		}
		
		
	}
	
	Node reverse (Node node){
		
		Node prev = null;
		Node current = node;
		Node next = null;
		while( current !=null){
			next = current.next;
			current.next = prev;
			current = next;
			
		}
		node = prev;
		return node;
		
		
	}
	
	
	void PrintList(Node node){
		while(node!= null){
	
		
		System.out.print(node.data+ " ");
		node = node.next;
		
		}
		
	}
	public static void main (String [] args){
		LinkListReverse list = new LinkListReverse();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		
		System.out.println("Given Linked list");
		list.PrintList (head);
		
		head = list.reverse(head);
		System.out.println(" ");
		head = list.reverse(head);
		System.out.println("Reverse Linked list");
		head = list.reverse(head);
		list.PrintList(head);
		
		
		
		
		
	}




}