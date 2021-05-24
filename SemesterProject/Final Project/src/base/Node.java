/**
 This class is pretty simple, it's the class for the nodes in the tree, as the node is an object it should coded as such.
 There are additional comments below describing each of the variables.
 **/

package base;

public class Node {

    public int nodeval;
    //left child and right child
    public Node left;
    public Node right;
    public Node root;

    public Node(int nodeval){
        this.nodeval = nodeval;
        //sets the children of a node to nothing, bc a new node doesnt have any children
        left = right = null;

    }
}