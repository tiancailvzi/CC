//4.3 Given a sorted (increasing order) array, write an algorithmto create a binary search tree with minimal height

public class BinaryTreewithminimalheight{
	
	public static BinaryTreeNode createtree(int[] arr,int start, int end){
		if(start > end){
			return null;
		}

		int mid =(start + end) /2;
		BinaryTreeNode root = new BinaryTreeNode(arr[mid]);
		root.setleft() = createtree(arr,start,mid-1);
		root.setright() = createtree(arr,mmid+1,end);

		return root;
	}
}