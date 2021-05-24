/**
 This class is for the Binary Search Tree, and it defines all the aspects of the tree that was asked for in the project.
 Within this class you will find lots of recursion being used as I figured it made the most sense when doing things like traversal, inserting, deleting, etc.
 For example, there is a "callable" delete function, and then a recursive delete function. This is because the "callable" function is used in the Main class while all the recursive work is done in the deletefunction method.
 The spacing in this class was important to me, each function is separated by a comment that briefly mentions what it does, and I tried to be as concise and dry as possible within the functions themselves.
 **/

package base;

import java.util.Queue;
import java.util.LinkedList;

public class BinarySearchTree {

    Node root;
    //function to delete an element or node in a tree
    void delete(int nodeval){
        root = deletefunction(root, nodeval);
    }
    //recursive function to aid the callable delete function
    Node deletefunction(Node root, int nodeval){
        if (root == null){
            return null;
        }
        if (nodeval < root.nodeval){
            root.left = deletefunction(root.left, nodeval);
        }
        else if (nodeval > root.nodeval){
            root.right  = deletefunction(root.right, nodeval);
        }
        else  {
            //here is where all the deleting happens by making the desired root null
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            root.nodeval = minValue(root.right);
            root.right = deletefunction(root.right, root.nodeval);
        }
        return root;
    }
    //recursive function to aid the callable insert function
    private Node insertElement(Node current, int nodeval) {
        if (current == null) {
            return new Node(nodeval);
        }

        if (nodeval < current.nodeval) {
            current.left = insertElement(current.left, nodeval);
        } else if (nodeval > current.nodeval) {
            current.right = insertElement(current.right, nodeval);
        } else {
            // value already exists
            return current;
        }

        return current;
    }
    //callable function to insert element or node into the tree
    public void insert(int nodeval) {
        root = insertElement(root, nodeval);
    }


    //function to find the maximum value in the tree
    public int maxValue(Node root) {
        if (root.right == null) {
            System.out.println(root.nodeval + " is the greatest value.");
        }
        else {
            maxValue(root.right);

        }
        return 0;
    }
    // function to find minimum value in the tree
    public int minValue(Node root){
        if (root.left == null){
            System.out.println(root.nodeval + " is the lowest value.");

        }
        else {
            minValue(root.left);
        }
        return 0;
    }
    //function that is callable to find if a value exists within a tree
    public void search(int value) {
        root = searchfunction(root, value);
    }

    //function to find if a certain node exists within the tree
    public static Node searchfunction(Node root, int value) {
        // If "root" does not exist OR the value of "root" = the requested value, then return such value
        if (root == null) {
            return null;
        }

        else {
            if (root.nodeval == value) {
                System.out.println(value + " exists within this Binary Search Tree.");
            }
            else if (value <= root.nodeval) {
                System.out.println("This node is not in the tree.");
                return searchfunction(root.left, value);
            }
            else {
                System.out.println("This node is not in the tree.");
                return searchfunction(root.right, value);
            }
        }
        return root;
    }

    //function that recursively finds the nth largest node (callable)
    public Node nthLargestFunction(Node root, int n) {
        Node current = root;
        Node nthLargest = null;
        int count = 0;
        while (current != null) {
            if (current.right == null) {
                if (++count == n)
                    nthLargest = current;
                current = current.left;
            }
            else {
                Node order = current.right;
                while (order.left != null && order.left != current)
                    order = order.left;
                if (order.left == null) {
                    order.left = current;
                    current = current.right;
                }
                else {

                    order.left = null;

                    if (++count == n)
                        nthLargest = current;
                    current = current.left;
                }
            }
        }
        return nthLargest;
    }
    //function that recursively assists the "callable" function to find the nth-largest node
    public void nthLargest(int n)
    {
        this.nthLargestFunction(this.root, n);
    }
    //postorder traversal of the tree
    public void postorder(Node root) {
        if (root == null)
            return;

        // Traverse left
        postorder(root.left);
        // Traverse right
        postorder(root.right);
        // Traverse root
        System.out.println(root.nodeval + " ");
    }
    //inorder traversal of the tree
    public void inorder(Node root) {
        if (root == null)
            return;

        // Traverse left
        inorder(root.left);
        // Traverse root
        System.out.println(root.nodeval + " ");
        // Traverse right
        inorder(root.right);
    }
    //preorder traversal of the tree
    public void preorder(Node root) {
        if (root == null)
            return;

        // Traverse root
        System.out.println(root.nodeval + " ");
        // Traverse left
        preorder(root.left);
        // Traverse right
        preorder(root.right);
    }
    //function to find the height of the tree after given a series of nodes
    public int height(Node root){
        if(root == null){
            return 0;
        }
        else{
            int leftheight = height(root.left);
            int rightheight = height(root.right);

            if (leftheight > rightheight){
                return 1 + leftheight;
            }
            else{
                return 1 + rightheight;
            }
        }
    }
    //function to execute breadth first search after given a series of nodes
    public void breadth(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        if (root == null)
            return;
        q.add(root);
        while (!q.isEmpty()) {
            Node n = (Node) q.remove();
            System.out.println(" " + n.nodeval);
            if (n.left != null)
                q.add(n.left);
            if (n.right != null)
                q.add(n.right);
        }
    }
    //function to print out the root
    public int printroot(){
        return root.nodeval;
    }
}