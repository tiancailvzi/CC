void levelorder(BinaryTreeNode root){
	BInaryTreeNode aa ;
	LLQueue q = new LLQueue();
	if(root == null){
		return;
	}

	q.enQueue(root);

	while(!q.isEmpty){
		aa = q.deQueue();
		System.out.println(temp.getData())；

		if(temp.getleft()){
			aa.enQueue(temp.getleft());
		}

		if(temp.getright()){
			aa.enQueue(temp.getright());
		}
	}

	q.deleteQueue();
}