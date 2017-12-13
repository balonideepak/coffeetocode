package ds.tree;

import java.util.Stack;

public class Tree {
	public TNode root;

	public void insert(int id) {TNode newNode = new TNode();    // make new node
	newNode.iData = id;           // insert data
	if(root==null)                // no node in root
		root = newNode;
	else                          // root occupied
	{
		TNode current = root;       // start at root
		TNode parent;
		while(true)                // (exits internally)
		{
			parent = current;
			if(id < current.iData)  // go left?
			{
				current = current.leftChild;
				if(current == null)  // if end of the line,
				{                 // insert on left
					parent.leftChild = newNode;
					return;
				}
			}  // end if go left
			else                    // or go right?
			{
				current = current.rightChild;
				if(current == null)  // if end of the line
				{                 // insert on right
					parent.rightChild = newNode;
					return;
				}
			}  // end else go right
		}  // end while
	}  // end else not root}
	}

	public void displayTree()
	{
		Stack globalStack = new Stack();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println(
				"......................................................");
		while(isRowEmpty==false)
		{
			Stack localStack = new Stack();
			isRowEmpty = true;

			for(int j=0; j<nBlanks; j++)
				System.out.print(' ');

			while(globalStack.isEmpty()==false)
			{
				TNode temp = (TNode)globalStack.pop();
				if(temp != null)
				{
					System.out.print(temp.iData);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);

					if(temp.leftChild != null ||
							temp.rightChild != null)
						isRowEmpty = false;
				}
				else
				{
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for(int j=0; j<nBlanks*2-2; j++)
					System.out.print(' ');
			}  // end while globalStack not empty
			System.out.println();
			nBlanks /= 2;
			while(localStack.isEmpty()==false)
				globalStack.push( localStack.pop() );
		}  // end while isRowEmpty is false
		System.out.println(
				"......................................................");
	}  // end displayTree()

}
