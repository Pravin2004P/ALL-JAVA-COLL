import java.util.*;
public class Print_Root_To_Leaf_Path {
        public static class Node {
            int data;
            Node left;
            Node right;
        public Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
        }   
        public static Node insert (Node root,int value) {
            if(root == null) {
                root = new Node(value);
                return root;
            }
            if(root.data>value) {
                root.left = insert(root.left, value);
            }
            else {
                root.right = insert(root.right, value);
            }
            return root;
        }
        public static void inordrt(Node root) {
            if(root == null) {
                return;
            }
            inordrt(root.left);
            System.out.print(root.data + " ");
            inordrt(root.right);
        }
        public static boolean isthere (Node root , int key) {
            if(root == null) {
                return false;
            }
            if(root.data == key) {
                return true;
            }
            else if(root.data>key) {
                return isthere(root.left, key);
            }
            else {
                return isthere(root.right, key);
            }
        }
        public static Node delete (Node root ,int val ) {
            if(root == null) {
                return null;
            }
            if(root.data < val) {
                root.right = delete(root.right, val);
            }
            else if(root.data>val) {
                root.left = delete(root.left, val);
            }
            else {
                if(root.right == null && root.left == null) {
                    return null;
                }
                else if (root.left == null) {
                    return root.right;
                }
                else if (root.right == null) {
                    return root.left;
                }
                Node IS = Is(root.right);
                root.data = IS.data;
                root.right = delete(root.right, IS.data);
            }
            return root;
        }
        public static Node Is (Node root) {
            while(root.left != null) {
                root = root.left;
            }
            return root;
        }
        public static void Print_In_Rang (Node root , int x , int y) {
            if(root == null) {
                return;
            }
            if(root.data >= x && root.data <= y) {
                Print_In_Rang(root.left , x ,y);
                System.out.print(root.data + " ");
                Print_In_Rang(root.right , x , y);
            }
            else if(root.data >= y) {
                Print_In_Rang(root.left , x ,y);
            }
            else {
                Print_In_Rang(root.right , x , y);
            }
        }
        public static void printpath (ArrayList<Integer>path) {
            for(int i = 0;i<path.size();i++) {
                System.out.print(path.get(i)+"->");
            }
            System.out.println();
        }
        public static void Print_Root_To_Leaf_Paths(Node root , ArrayList<Integer> path) {
            if(root == null) {
                return;
            }
            path.add(root.data);
            //check if leaf
            if(root.left == null && root.right == null) {
                printpath(path);
            }else{
                Print_Root_To_Leaf_Paths(root.left,path);
                Print_Root_To_Leaf_Paths(root.right,path);
            }
            path.remove(path.size()-1);
        }
    
        public static void main(String[] args) {
            int[] value = {8,5,3,1,4,6,10,11,14};
            Node root = null;
            for(int i = 0;i<value.length;i++) {
                root = insert(root, value[i]);
            }
            inordrt(root);
            System.out.println();
            System.out.print(isthere(root, 11));
            System.out.println();
            delete(root, 14);
            inordrt(root);
            System.out.println();
            Print_Root_To_Leaf_Paths(root ,new ArrayList<>());
        }
}
