package CTCIChapOne;

public class SortLinkedList {

	public static void main(String[] args) {
		NodeInteger n = new NodeInteger(8);
		n.insert(7);
		n.insert(5);
		n.insert(11);
		n.insert(1);
		n.insert(3);
		int mid = 4;
		NodeInteger result = sort(n,mid);
		print(result);
	}

	private static NodeInteger sort(NodeInteger head, int mid) {
		NodeInteger temp = head;
		NodeInteger result = null;
		while(temp!=null)
		{
			if(temp.data<mid)
			{
				insertHead(result,temp.data);
				temp=temp.next;
			}
			else
			{
				insertTail(result,temp.data);
				temp=temp.next;
			}
		}
		return result;
		
	}

	private static NodeInteger insertTail(NodeInteger head, int data) {
		NodeInteger newNode = new NodeInteger(data);
		NodeInteger temp = head;
		if(head==null)
			return newNode;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
		return head;
	}

	private static NodeInteger insertHead(NodeInteger head, int data) {
		NodeInteger newNode = new NodeInteger(data);
		if(head==null)
			return newNode;
		newNode.next=head;
		head=newNode;
	 return head;	
	}
	private static void print(NodeInteger head)
	{
		NodeInteger temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
