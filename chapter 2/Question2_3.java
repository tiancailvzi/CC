public class Question2_3{

	public static void main(String args[]){
		LinkNode head = new LinkNode(1);
		head.addTail(2);
		head.addTail(4);
		head.addTail(7);
		head.addTail(8);
		head.addTail(5);
		head.PrintList(head);
		deletenode(head.next.next); //类里面的方法直接用 不用加head.  addtail是linknode里面的方法 所以要用到对象的引用
		head.PrintList(head);	

	}

	public static void deletenode(LinkNode middle){
		
		
			middle.data = middle.next.data;
			middle.next = middle.next.next;

		
	}

	

}