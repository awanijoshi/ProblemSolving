package CTCIChapOne;

public class KthToLastElement {

	public static void main(String[] args) {
		int k =4;
		Node n = new Node('F');
		n.insert('O');
		n.insert('L');
		n.insert('L');
		n.insert('O');
		n.insert('W');
		n.insert(' ');
		n.insert('U');
		n.insert('P');
		kthElement(n,k);
	}

	private static void kthElement(Node head,int k) {
		int length = lengthLL(head);
		int count=0;
		Node temp=head;
		int actualPosition = length-k;
		while(count!=actualPosition)
		{
			count++;
			temp=temp.next;
		}
		System.out.println(temp.data);
	}

	private static int lengthLL(Node head) {
		Node temp=head;
		int count=0;
		if(head==null)
		return 0;
		if(head.next==null)
			return 1;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}
	
}
