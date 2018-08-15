package CTCIChapOne;

import java.util.HashSet;

public class RemoveDuplicatesLinkedList {

	public static void main(String[] args) {
		Node n = new Node('F');
		Node n1 = new Node('P');
		n.insert('O');
		n.insert('L');
		n.insert('L');
		n.insert('O');
		n.insert('W');
		n.insert(' ');
		n.insert('U');
		n.insert('P');
		n1.insert('E');
		n1.insert('O');
		n1.insert('P');
		n1.insert('L');
		n1.insert('E');
		n1.insert(' ');
		n1.insert('O');
		n1.insert('P');
	removeDuplicates(n);
	removeDuplicatesInPlace(n1);
	}
	private static void removeDuplicatesInPlace(Node head) {
		Node temp =head;
		while(temp!=null) 
		{
			Node prev =null;
			Node temp2=temp.next;
			while(temp2!=null)
			{
				if(temp.data!=temp2.data)
				{
					prev=temp2;
					temp2=temp2.next;
				}
				else
				{
					prev.next=temp2.next;
					temp2=temp2.next;
				}
			}
			temp=temp.next;
		}
		print(head);
	}
	private static void removeDuplicates(Node head) 
	{
		HashSet<Character> set = new HashSet<Character>();
		Node temp = head;
		Node prev = null;
		while(temp!=null)
		{
			if(!set.contains(temp.data))
				{
				set.add(temp.data);
				prev=temp;
				temp=temp.next;
				}
			else
			{
				prev.next=temp.next;
				temp=temp.next;
			}	
		}
		print(head);
		
	}
	private static void print(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
