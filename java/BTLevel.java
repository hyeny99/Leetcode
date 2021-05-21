import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTLevel {
	
	 public List<List<Integer>> levelOrder(TreeNode root) {
		 List<List<Integer>> ans = new ArrayList<>();
		  if(root == null)
			 return ans;
		 
		 Queue<TreeNode> queue = new LinkedList<>();
		 queue.offer(root);
		 
		 
		 while(!queue.isEmpty()) {
			 List<Integer> list = new ArrayList<>();
			 int cnt = queue.size();
			 for(int i = 0; i < cnt; i++) {
				TreeNode temp = queue.peek();
				list.add(queue.poll().val);
				if(temp.left != null)
					queue.offer(temp.left);
				if(temp.right != null)
					queue.offer(temp.right);
			 }
			
			 ans.add(list);
		 }
		 return ans;
	       
	 }
	 
	/*static ArrayList<Integer> levelOrder(TreeNode node) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(node);
		
		ArrayList<Integer> ans = new ArrayList<>();
		while(!q.isEmpty()) {
			TreeNode n = q.peek();
			ans.add(q.poll().val);
			if(n.left != null)
				q.offer(n.left);
			if(n.right != null)
				q.offer(n.right);
			
		}
		
		return ans;

	}*/
}
