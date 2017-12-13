package ds.tree;

public class TreeApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Tree treeObj = new Tree();
        treeObj.insert(100);
        treeObj.insert(120);
        treeObj.insert(40);
        treeObj.insert(30);
        treeObj.insert(20);
        treeObj.insert(10);
        
        treeObj.displayTree();
	}

}
