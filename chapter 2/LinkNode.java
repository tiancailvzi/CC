public class LinkNode{
	public int data;
	public LinkNode next = null;

	public LinkNode(int data){
		this.data = data;
		this.next = null;
	}

	public void addTail(int newdata){
		LinkNode pointer = this;
		while(pointer.next != null){
			pointer = pointer.next;
		}
		LinkNode end = new LinkNode(newdata);
		pointer.next = end;
	}

	public int length(LinkNode head){
		LinkNode pointer = head;
		int count = 1;
		while(pointer.next != null){
			pointer = pointer.next;
			count++;
		}
		return count;
	}

	public void PrintList(LinkNode head)  
    {  
        LinkNode temp = head;  
        while (temp != null)  
        {  
           System.out.print(temp.data + " ");  
           temp = temp.next;  
             
        }  
        System.out.println("NULL");  
    }  
}