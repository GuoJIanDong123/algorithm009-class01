package Week_02;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Node;

public class TreePreorderTraversal {
	
	List<Integer> list = new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
        if(root == null) {
            return list;
        }
        list.add(root.val);
        for (int i = 0; i <root.children.size() ; i++) {
            preorder(root.children.get(i));
        }
        return list;
    
    }

}
