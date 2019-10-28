package LinkedList;

public class LinkedList {

	private Node head;
	
	private int size;
	
	private Node tail;
	
	public void add(int number) {
		if(this.size==0) {
			Node node = new Node();
			node.setNumber(number);
			node.setNext(null);
			this.head=node;
			this.tail=this.head;
			this.size++;
			return;
		}
		Node node = new Node();
		node.setNumber(number);
		node.setNext(null);
		this.tail.setNext(node);
		this.tail=node;
		this.size++;
	}
	
	
	public void addFirst(int number) {
		this.addFirst(this.head,number);
	}
	
	public void addFirst(Node head, int number) {
		Node node = new Node();
		node.setNumber(number);
		node.setNext(head);
		this.head=node;
	}
	
	
	
	public void display() {
		this.display(this.head);
	}
	
	
	public void display(Node node) {
		while(node.getNext()!=null) {
			System.out.print(node.getNumber()+" ");
			node=node.getNext();
		}
		
	}
	
	public void addAt(int index, int number) throws Exception {
		if(this.size<index || index<0 ) {
			throw new Exception("Invalid Index");
		}
		else if(index==0) {
			this.addFirst(number);
		}
		else if(index==this.size) {
			this.add(number);
		}else {
			
		}
		
	}
	
	public Node getNodeAt(int index) throws Exception {
		
		if(index==0) {
			return this.head;
		}
		else if(index==this.size-1) {
			return this.tail;
		}
		else if(index<0 || index>=this.size) {
			throw new Exception("Invalid Arguments");
		}
		
		Node temp = this.head;
		for(int i=0;i<index;i++) {
			temp = temp.getNext();
		}
		return temp;
	}
	
	public void reverse() {
		this.reverse(this.head);
	}
	
	private void reverse(Node head) {
		
	}
	
	public Node deleteNodeByKey(int key) {
		return this.deleteNodeByKey(key,this.head);
	}
	private Node deleteNodeByKey(int key, Node head) {
		if(head.getNumber()==key) {
			this.head=null;
			this.size--;
		}
		
		Node curr = head.getNext();
		Node prev = head;
		while(curr.getNumber()!=key) {
			prev=curr;
			curr = curr.getNext();
		}
		prev.setNext(curr.getNext());
		return curr;
	}
	
	
	public Node deleteNodeByIndex(int index) throws Exception {
		return this.deleteNodeByIndex(index,this.head);
	}
	
	private Node deleteNodeByIndex(int index, Node head) throws Exception {
		if(index<0 || index>this.size-1) {
			throw new Exception("Invalid Index");
		}
		
		if(this.size==1) {
			Node rv = head;
			this.head = null;
			this.size--;
			return rv;
		}
		else if(index==0) {
			Node rv = this.head;
			this.head=this.head.getNext();
			this.size--;
			return rv;
		}
		
		int i=0;
		Node curr = head.getNext();
		Node prev = head;
		while(i!=index-1) {
			prev = curr;
			curr = curr.getNext();
			i++;
		}
		prev.setNext(curr.getNext());
		this.size--;
		return curr;
	}
	
	
	
	
	
	
	
}

