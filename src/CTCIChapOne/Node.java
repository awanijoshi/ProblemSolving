package CTCIChapOne;

public class Node {
	char data;
	Node next;
	
	public Node(char data)
	{
		this.data=data;
		this.next=null;
	}
	public void insert(char data) 
	{
		Node newNode = new Node(data);
		Node n =this;
		while(n.next!=null)
			n=n.next;
		n.next=newNode;
	}	
}
