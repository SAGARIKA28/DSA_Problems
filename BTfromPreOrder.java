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
    }
	public static void main(String[] args) {
		int[] A = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
	    BinaryTree bt = new BinaryTree();
	    Node newNode = bt.buildTree(A);
	    System.out.print(newNode.data);
	
	}
}
