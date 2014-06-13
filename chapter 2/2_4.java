public static class Question2_4{


	public static void main(String args[]){
		LinkNode head = new LinkNode();
		head.add(1);
		head.add(3);
		head.add(5);
		head.add(8);
		head.add(4);
		head.add(9);
		head.add(6);
		head.add(2);
		head.PrintList(head);
		partition(head,7);
		head.PrintList(head);

	}

	public LinkNode partitoin(LinkNode n, int x){
		LinkNode head1 = null;
	    LinkNode tail1 = null;
		LinkNode head2 = null;
		LinkNode tail2 = null;

		while(n != null){
			if(n.data < x){
				if(head1 = null){
					head1 = n;
					tail1 = n;
				}else{
					tail.next = n;
					tail = n;
				}
			}else{
				if(head2 = null){
					head2 = n;
					tail2 = n;
				}else{
					tail2.next =n;
					tail2 = n ;
				}
			}

			n = n.next;
		}

		if(head1 = null){
			return head2;
		}else{
			tail1.next = head2;
			return head1;
		}
	}


}