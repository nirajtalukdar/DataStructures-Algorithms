// Java program to convert a given Binary Tree to 
// Doubly Linked List
//we traverse the tree in inorder fashion. We add nodes at the beginning of current linked list and update head of the list using pointer to head pointer. Since we insert at the beginning, we need to process leaves in reverse order. For reverse order, we first traverse the right subtree before the left subtree. i.e. do a reverse inorder traversal.
 

class BTtoDLL 
{
    // 'root' - root of binary tree
    Node root;
     
    // 'head' - reference to head node of created
    //double linked list
    Node head;
 
    // A simple recursive function to convert a given
    // Binary tree to Doubly Linked List
    void BToDLL(Node root) 
    {
        // Base cases
        if (root == null)
            return;
 
        // Recursively convert right subtree
        BToDLL(root.right);
 
        // insert root into DLL
        root.right = head;
 
        // Change left pointer of previous head
        if (head != null)
            (head).left = root;
 
        // Change head of Doubly linked list
        head = root;
 
        // Recursively convert left subtree
        BToDLL(root.left);
    }
 
    // Utility function for printing double linked list.
    void printList(Node head) 
    {
        System.out.println("Extracted Double Linked List is : ");
        while (head != null) 
        {
            System.out.print(head.key + " ");
            head = head.right;
        }
    }
 
    // Driver program to test the above functions
    public static void main(String[] args) 
    {
        /* Constructing below tree
               5
             /   \
            3     6
           / \     \
          1   4     8
         / \       / \
        0   2     7   9  */
         
        BTtoDLL tree = new BTtoDLL();
        tree.root = new Node(5);
        tree.root.left = new Node(3);
        tree.root.right = new Node(6);
        tree.root.left.right = new Node(4);
        tree.root.left.left = new Node(1);
        tree.root.right.right = new Node(8);
        tree.root.left.left.right = new Node(2);
        tree.root.left.left.left = new Node(0);
        tree.root.right.right.left = new Node(7);
        tree.root.right.right.right = new Node(9);
 
        tree.BToDLL(tree.root);
        tree.printList(tree.head);
    }
}