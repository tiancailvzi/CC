import java.util.hashset

public class 2.1{

	public static void removedouble(linknode head){
		HashSet<Integer> myset = new HashSet<>();
		linknode current = head;
		myset.append(head.value);

		while(current.gernext() != null){
			if(myset.contains(current.getnext().getvalue())){
				current.setnext = current.getnext().getnext();
			}else{
				myset.append(current.getvalue());
				current = current.getnext();
			}
		}

	}


	public sattic void removedouble2(linknode head){
		if(head == null){
			return;
		}

		linknode pointer1 = head;
		while(pointer1 != null){
			linknode pointer2 = pointer1;
			while(pointer2.getnext()!= null){
				if(pointer2.getnext().getvalue() = pointer1.getvalue()){
					pointer2.setnext(pointer2.getnext().getnext());
				}
			}
			pointer1 = pointer.getnext();
		}

	}


	public static void main(String[] argv){
		
		LinkNode head = new LinkNode(1);
		head.append(new LinkNode(2));
		head.append(new LinkNode(3));
		head.append(new LinkNode(1));
		head.append(new LinkNode(5));
		
		printLinkedList(head);
		removeDuplicateNode(head);
		printLinkedList(head);
		
		
		LinkNode head2 = new LinkNode(1);
		head2.append(new LinkNode(2));
		head2.append(new LinkNode(3));
		head2.append(new LinkNode(1));
		head2.append(new LinkNode(5));
		
		printLinkedList(head2);
		removeDuplicateNode_NoBuffer(head2);
		printLinkedList(head2);
		
	}
	
	
	public static void printLinkedList(LinkNode head){
		while(head != null){
			System.out.print(head.getValue());
			System.out.print("->");
			head = head.getNext();
		}
		System.out.println("null");
	}
	
}




public class linknode{
	
	private int value;
	private linknode next;

	public linknode(int value){
		this.value = value;
		this.next = null;
	}

	public void setvalue(int value){
		this.value = value;
	}

	public int getvalue(){
		return value;
	}

	public void setnext(linknode next){
		this.next = next;
	}

	public linknode getnext(){
		return next;
	}

	public void append(linknode next){
		linknode current = this;
		while(current.next != null){
			current = current.next;
		}
		current.next = next;

	}
}