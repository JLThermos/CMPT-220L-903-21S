package base;

import java.util.ArrayList;
import java.util.Collections;


public class DumbList {
    ArrayList<Node> list = new ArrayList<>();
    Node root;

    public DumbList(){ this.root = null;}

    public void add(int value){
        if (this.root == null){
            this.root = new Node(value);
            System.out.println("The value " + value + " has been added successfully.");
        }
        else{
            Node tempNode = this.root;
            while(tempNode.nextNode != null){
                tempNode = tempNode.nextNode;
            }
            tempNode.nextNode = new Node(value);
            System.out.println("The value " + value + " has been added successfully.");
        }
    }

    public void delete(int value){
        if (this.root == null){
            System.out.println("The root hasn't been set yet. The value isn't in the list.");
        }
        else {
            Node tempNode = this.root;
            while (tempNode.nextNode.value != value || tempNode.nextNode == null){
                tempNode = tempNode.nextNode;
            }
            if (tempNode.nextNode.nextNode != null){
                tempNode.nextNode = tempNode.nextNode.nextNode;
            }
            else{
                tempNode.nextNode = null;
            }
            System.out.println("The value " + value + " has been deleted successfully.");
        }
    }

    public void sort(){
      ArrayList<Integer> tempArr = new ArrayList<Integer>();
      if (this.root != null){
          Node tempNode = this.root;
          while (tempNode.nextNode != null){
              tempArr.add(tempNode.value);
              tempNode = tempNode.nextNode;
          }
          tempArr.add(tempNode.value);
      }
      Collections.sort(tempArr);
      this.root = null;
      for (Integer value: tempArr){
          this.add(value);
      }
      System.out.println(tempArr);
    }

    public Integer length(){
        Integer length = 0;
        if (this.root != null){
            Node tempNode = this.root;
            length++;
            while (tempNode.nextNode != null){
                tempNode = tempNode.nextNode;
                length++;
            }
        }
        return length;
    }

    public Node swap(Node root){
        Node temp = root;
        Node tempNextNode = root.nextNode.nextNode;
        root = root.nextNode;
        root.nextNode = temp;
        if (tempNextNode != null){
            root.nextNode.nextNode = tempNextNode;
        }
        else {
            root.nextNode.nextNode = null;
        }
        return root;
    }

    public void printList(){
        ArrayList<Integer> tempArr = new ArrayList<Integer>();
        if(this.root != null){
            Node tempNode = this.root;
            while (tempNode.nextNode != null){
                tempArr.add(tempNode.value);
                tempNode = tempNode.nextNode;
            }
            tempArr.add(tempNode.value);
        }
        System.out.println(tempArr);
    }
}
