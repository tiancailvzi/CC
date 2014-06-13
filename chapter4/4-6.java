public class 4-6{
	public TreeNode leftmost(TreeNode root){
		if(root == null) return ;
		while(root.getleft() != null){
			root = root.getleft();
		}
		return root;
	}

	public TreeNode getnext(TreeNode root){
		if(root == null) return null;

		if(root.parent == null || root.getright()!== null){
			return leftmost(root.getright());
		}else{
			TreeNode p = root;
			TreeNode x = p.parent;
			while(x! = null && x.getright()= p){
				p = x;
				x = x.parent;

			}

		}
	}
}


public class 4-6{
	public TreeNode leftmost(TreeNode root){
		if(root == null ) return null;
		while(root.getleft() != null){
			root = root.getleft();
		}
		return root;
	}

	public TreeNode getnext(TreeNode root){
		if(root == null) return null;

		if(root.getright()!==null || root.parent == null){
			return leftmost(root.getright());
		}else{
			TreeNode p = root;
			TreeNode x = p.parent;
			while(x.getright()==p && x!=null){
				p = x;
				x = x.parent;
			}
		}
	}
}