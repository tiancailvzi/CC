import java.util.*

public class 4.4{

	public ArrayList<LinkList<TreeNode>> createList(TreeNode root){


		ArrayList<LinkList<TreeNode>> lists = new ArrayList<LinkList<TreeNode>>();
		LinkList<TreeNode> current = new LinkList<TreeNode>();

		if(root !== null){
			current.add(root);
			
		}

		while(current.size() > 0){
			lists.add(current);
			LinkList<TreeNode> parent = current;
			current = new LinkList<TreeNode>();

			for(TreeNode t: parent){
				if(t.getleft()){
					current.add(t.getleft());
				}

				if(t.getright()){
					current.add(t.getright());
				}
			}

		return result;
			
		}

	}
}