public  class Question2_4{


	public static void main(String args[]){
		LinkNode head = new LinkNode(8);
		head.addTail(1);
		head.addTail(3);
		head.addTail(5);
		head.addTail(8);
		head.addTail(4);
		head.addTail(9);
		head.addTail(6);
		head.addTail(2);
		head.PrintList(head);
		
		
		//LinkNode pointer1 = partition(head,7);

		LinkNode pointer2=  partition2(head,5);
		
//pointer1.PrintList(pointer1);


pointer2.PrintList(pointer2);

	}

	public static LinkNode partition(LinkNode n, int x){
		LinkNode head1 = null;
	    LinkNode tail1 = null;
		LinkNode head2 = null;
		LinkNode tail2 = null;

		while(n != null){
			
			if(n.data < x){

				if(head1 == null){
					head1 = n;
					tail1 = n;
				}else{
					tail1.next = n;
					tail1 = n;
				}
			}else{
				
				if(head2 == null){
					head2 = n;
					tail2 = n;
				}else{
					tail2.next =n;
					tail2 = n ;
				}
			}

			n = n.next; 

			
		}

		tail1.next = null;

		tail2.next = null;  

		 
			
		if(head1 == null){
			return head2;
		}else{
			tail1.next = head2;
			return head1;
		}

	}

	public static LinkNode partition2(LinkNode head, int x){
		if(head == null || head.next == null){
			return head;
		}
		LinkNode tnode = new LinkNode(x);
		LinkNode pre = null;
		tnode.next = head;

		head = tnode;
		//tnode = head;
		//System.out.println(head.data);
		//System.out.println(head.next.data);

		LinkNode current = head;

		while(current.next != null){

			if(current.next.data < x){

				LinkNode temp = current.next;
				temp.next = head;

				head = temp;
				//temp = head;
				current.next = current.next.next;

				
		System.out.println(head.data);
		System.out.println(head.next.data);
		System.out.println(current.data);

				if(head.next == tnode){
					pre = head;
				}



			}

			current.next = current;
		}

		

		pre.next = tnode.next;
		return head;

	}


}