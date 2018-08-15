package CTCIChapOne;

public class SumOfTwoDigitsLinkedList {

	public static void main(String[] args) {
		NodeInteger n = new NodeInteger(8);
		n.insert(7);
		n.insert(5);
		NodeInteger n1 = new NodeInteger(8);
		n1.insert(1);
		n1.insert(3);
		NodeInteger resultHead = sum(n,n1);
		print(resultHead);
	}

	private static NodeInteger sum(NodeInteger n1, NodeInteger n2) {
		NodeInteger prev=null;
		NodeInteger head3=null;
		int sum=0,carry=0;
		NodeInteger temp1 = n1;
		NodeInteger temp2 = n2;
		while(temp1!=null && temp2!=null)
		{	
			NodeInteger temp3 =null;
			sum=temp1.data+temp2.data+carry;
			if(sum<=9)
			{
				if(prev==null)
				{
					prev=new NodeInteger(sum);
					head3=prev;					
				}	
				else
				{
					temp3=new NodeInteger(sum);
					prev.next=temp3;
					prev=temp3;
					carry=0;
				}
			}
			else
			{
				carry=sum/10;
				sum=sum%10;
				if(prev==null)
				{
					prev=new NodeInteger(sum);
					head3=prev;
				}	
				else
				{
					temp3=new NodeInteger(sum);
					prev.next=temp3;
					prev=temp3;
				}
			}
			temp1=temp1.next;
			temp2=temp2.next;
		}
		if(carry!=0)
		{
			NodeInteger temp3 =null;
			temp3=new NodeInteger(carry);
			prev.next=temp3;
		}
		return head3;
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
