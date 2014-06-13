void preorder(BinartTreeNode root){
	if(root == null){
		return;
	}

	if(root != null){
		System.out.println(root.getData());
		preorder(root.getleft());
		preorder(root.getright());
	}
} //recursive method


void preorder(BianryTreeNode root){
	if(root == null){
		return;
	}
	LLStack s = new LLStack();
	while(true){
		while(root != null){
			System.out.println(root.getData());
			s.push(root);
			root = root.getleft();
		}

		while(!s.isEmpty){
			root = (BinaryTreeNode) s.pop();
			root = root.getright();
		}
	}

	return;
}