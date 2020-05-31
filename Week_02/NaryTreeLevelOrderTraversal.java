package Week_02;

public class NaryTreeLevelOrderTraversal {
	
	List<List<Integer>> list = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(Node root) {
        if(root != null) {
           levelSearch(root,0);
        }
        return list;

    }
    public void levelSearch(Node node,Integer level) {
        if (list.size() <= level) {
            list.add(new ArrayList<>());
        }
        list.get(level).add(node.val);
        for(Node child:node.children) {
            levelSearch(child,level+1);
        }
    }

}
