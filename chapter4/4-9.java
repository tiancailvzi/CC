public class 4-9{
	//////有parent指针
	public void findsum(TreeNde root,int sum){
		if(root == null) return null;
		TreeNode a = root;
		for(int i =1; a != null; ++i){
			int temp ==0;
			temp + = a.getData();
			if(temp == sum){
				print(root,i);
			}
			a = a.parent;

		}
		findsum(root.getleft(),sum);
		findsum(root.getright(),sum);
	}

	public void print(TreeNode root ,int level){
		Stack<Integer> s = new Stack<Integer>();
		for(int i = 0;i<level; ++i){
			s.push(root.getData());
			root = root.parent;

		}	
		while(!s.empty()){
			System.outprintln("s.pop()");

			}
		
	}
}


///////////////////没有指针
pulic class 6-9{
	public void findsum(TreeNode root ,int sum, int[] arrary; int level){
		if(root == null ){return null;}
		for(int i = level; i>0; i--){
			int temp ==0;
			arraty[i] = root.getData();
			temp+=arrary[level];
		if(temp ==sum){
			print(root,level);
		}
		}

		findsum(root.getleft(),sum,arrary,level+1);
		findsum(root.getrigt(),sum,arrary,level+1);
		
	}
}