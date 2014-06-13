public class isTreeBalance{
	private BinaryTreeNode root;

	public boolean isBalanced(BinaryTreeNOde root){
		if(root == null) return false;
		if(Math.abs(getheight(root.getleft())-getheight(root.getright()))>1){
			return false;
		}else if(!isBalanced(root.getleft())||!isBalanced(root.getright())){
			return false;
		}

		return true;

	}

	public int getheight(BinaryTreeNode root){}
}