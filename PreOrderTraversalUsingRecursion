/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right =null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int[]nodes){
            idx++;
            if(nodes[idx]== -1){
                return null;
            }
            Node root = new Node(nodes[idx]);
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);
            
            return root;
        }
        public static void preOrderTraversal(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nodes = new int[n];
		for(int i=0;i<n;i++){
		    nodes[i]= sc.nextInt();
		}
	    BinaryTree bt = new BinaryTree();
	    Node root = bt.buildTree(nodes);
	    bt.preOrderTraversal(root);
	}
}
