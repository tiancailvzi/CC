public class 4-8{

	public boolean issubtree(TreeNode a , TreeNode b){
		if(a == null) return true;
		if(b == null) return false;
		if(a.getData() == b.getData()){
			return match(a,b);
		}

		return (issubtree(a.getleft(),b) || issubtree(a.getright(),b));
	}

	public boolean match(TreeNode a, TreeNode b){
		if(a== null && b==null) return true;
		if(a==null || b==null) return false;
		return (match(a.getleft(),b.getleft()) && match(a.getright(),b.getright());
	}
	
}