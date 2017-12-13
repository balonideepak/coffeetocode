package ds.tree;

public class TNode {public int iData;              // data item (key)
public double dData;           // data item
public TNode leftChild;         // this node's left child
public TNode rightChild;        // this node's right child

public void displayNode()      // display ourself
   {
   System.out.print('{');
   System.out.print(iData);
   System.out.print(", ");
   System.out.print(dData);
   System.out.print("} ");
   }}
