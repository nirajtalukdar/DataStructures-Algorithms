/**
 * 1. Initialize start as 0, end as (length of the array - 1)
2. Set mid as (start+end)/2
3. Create a tree node with mid as root (lets call it A).
4. Recursively do following steps:
    a). Calculate mid of left sub array and make it root of left sub tree of A.
    b). Calculate mid of right sub array and make it root of right sub tree of A.
    */
import java.util.*;
public class BSTfromArray{
    Node root;
    public static void main(String[] args){
        BSTfromArray bstarrayobj = new BSTfromArray();
        int [] a = new int[] {0, 1, 2, 3, 4, 5, 6, 7};
        int n = a.length -1 ;
        bstarrayobj.root = bstarrayobj.createBST(0, n, a);
        
        System.out.println("Preorder traversal of constructed BST");
		bstarrayobj.findpreOrder(bstarrayobj.root);
    }
    
    public Node createBST (int start, int end, int[] a){
          System.out.println("Parsing "+start+","+end);
        if(start > end) return null;
        int mid = (start+end)/2;
        Node node = new Node(mid);
        node.left = createBST(start, mid-1, a);
        node.right = createBST(mid+1,end,a);
        return node;
    }
    
    
     void findpreOrder(Node node){
      if(node == null) return;
      Stack<Node> s = new Stack();
      s.push(node);
      while(s.size()>0){
          node = s.pop();
          System.out.print(" "+node.key);
          if(node.right!=null){
              s.push(node.right);
          }
          if(node.left!=null){
              s.push(node.left);
          }
      }
       
    }
}