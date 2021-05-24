/**
 This is the main class that also contains the main function.
 This is just where all the functions from the Binary Search Tree class are called and executed.
 The descriptions for each of the functions called here can be found in the Binary Search Tree class.
 **/

package base;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree BST = new BinarySearchTree();
        BST.insert(5);
        BST.insert(8);
        BST.insert(1);
        BST.insert(6);
        BST.insert(5);
        BST.insert(1);
        BST.insert(7);
        BST.insert(9);
        System.out.println("The root of this tree is: " + BST.printroot());
        int nth = 2; //makes it easier to change the nth node instead of typing it in the print statement below
        System.out.println("The " + nth + "(nth/nd/st) largest node is: " + BST.nthLargestFunction(BST.root, nth).nodeval);
        BST.minValue(BST.root);
        BST.maxValue(BST.root);
        System.out.println("Breadth First: ");
        BST.breadth(BST.root);
        System.out.println("Preorder:");
        BST.preorder(BST.root);
        System.out.println("Postorder: ");
        BST.postorder(BST.root);
        System.out.println("Inorder: ");
        BST.inorder(BST.root);
        System.out.println("The height of the tree is: " + BST.height(BST.root));
        BST.search(5);
        BST.search(4);
        BST.delete(9);
        BST.search(9);
    }
}