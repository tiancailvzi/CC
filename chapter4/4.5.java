public class isBinarySearchTree{
	public void copy(TreeNode root, int[] array){
		int index == 0;
		if(root == null) return;
		copy(root.getleft() ,array);
		array[index] = root.getData();
		index++;
		copy(root.getright(),array);
	}
	public boolean isBinarySearchTree(TreeNode root){
		int[] array = new int[root.size];
		copy(root,array);
		for(int i = 1;i<array.length;i++){
			if(array[i] < array[i-1];
				return false;
		}
		return true;
	}
}

public boolean check