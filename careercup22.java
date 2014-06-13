public class careercup22{
	public static void findnode(linknode head ,k){
		linknode currentnode = head;
		int i = 0;
		while(currentnode != null){
			for(i = 0; i < k; i++)
			currentnode = currentnode.getnext();
		}
		linknode pointer2 = head;
		while(currentnode.getnext != null){
			currentnode = currentnode.getnext();
			pointer2 =pointer2.getnext();
		}

		while(pointer2 != null){
			return pointer2.getvalue();

		}
	}
}