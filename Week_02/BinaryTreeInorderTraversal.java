package Week_02;

public class BinaryTreeInorderTraversal {
	
	List<Integer> list = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
         if(root == null) {
             return list;
         }
         if(root.left != null) {
            inorderTraversal(root.left);
         }
         list.add(root.val);

         if(root.right != null) {
            inorderTraversal(root.right);
         }

         return list;
    }

}
