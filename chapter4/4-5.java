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


////////////////////////////////////////////

public boolean check(TreeNode root){
	public int last = Integer.MIN_VALUE;
	if(!check(root.getleft())) return false;
	if(root.data> last) return false;
	last = root.data;
	if(!check(root.getright())) return false;

	return true;
}


/////////////////////////////
pubic class 4-5{

	pubic boolean check(TreeNode root,int min, int max){
		if(root == null ) return false;
		if(root.getData() <= min || root.getData() > max) return false;
		if(!check (root.getleft(),min,root.getData())); return false;
		if(!check (root.getright(),root.getData(),max)); return false;
		return true;
	}

	boolean check(TreeNdoe root){
		return boolean check(root,Integer.MIN_VALUE,Integer.MAX_VALUE)
	}
}