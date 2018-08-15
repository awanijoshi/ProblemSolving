package CTCIChapOne;

public class NodeInteger {
	int data;
	NodeInteger next;
	
	public NodeInteger(int data)
	{
		this.data=data;
		this.next=null;
	}
	public void insert(int data) 
	{
		NodeInteger newNode = new NodeInteger(data);
		NodeInteger n =this;
		while(n.next!=null)
			n=n.next;
		n.next=newNode;
	}	
}
