void inorder(BinartTreeNode root){
	if(root == null){
		return;
	}

	if(root != null){
		
		inorder(root.getleft());
		System.out.println(root.getData());
		inorder(root.getright());
	}
} //recursive method


void inorder(BianryTreeNode root){
	if(root == null){
		return;
	}
	LLStack s = new LLStack();
	while(true){
		while(root != null){
			
			s.push(root);
			root = root.getleft();

		}

		while(!s.isEmpty){
			root = (BinaryTreeNode) s.pop();
			System.out.println(root.getData());
			root = root.getright();
		}
	}
	return;
}