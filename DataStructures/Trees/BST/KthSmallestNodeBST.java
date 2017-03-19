/**
 * LOGIC: Keep traversing in "in-order" way.
 *        Every time we visit a node, we increment the counter. 
 *        When counter == k, we return the node value.
 * */
import java.util.*;
public class KthSmallestNodeBST{
    Node root;
    static int k;
    public static void main(String args[]){
        KthSmallestNodeBST obj = new KthSmallestNodeBST();
        
         
        /**
		 * 
		 * 	        16 
		                /    \
	* 		    12     20
	*                      / \    /  \ 
	*                     7  14  19  23
	* 		 / \	     \
	*                   3  9           30
		 *        /
		 *      2          
		 */
       
                     obj.root = new Node(16);
		 obj.root.left = new Node(12);
		 obj.root.right = new Node(20);
		 obj.root.left.left = new Node(7);
		 obj.root.left.right = new Node(14);
		 obj.root.right.left = new Node(19);
		 obj.root.right.right = new Node(23);
		 obj.root.left.left.left = new Node(3);
		 obj.root.left.left.right = new Node(9);
		 obj.root.right.right.right = new Node(30);
		 obj.root.left.left.left.left = new Node(2);
		 k = 4;
		 obj.getKthSmallestNode(obj.root, k);

    }

           static int counter = 1;
           public static void getKthSmallestNode(Node root, int k) {
               if (root != null) {
                   getKthSmallestNode(root.left, k);
                       if (counter == k) {
                           System.out.println(root.key);
                           counter++;
                           return;
                       } else counter++;

                   getKthSmallestNode(root.right, k);
               } 
           }
    
}