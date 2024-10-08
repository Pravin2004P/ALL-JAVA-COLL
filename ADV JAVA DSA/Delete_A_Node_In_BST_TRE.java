public class Delete_A_Node_In_BST_TRE {
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
    if(root.data > value) {
        root.left = insert(root.left, value);
    }
    else {
        root.right = insert(root.right, value);
    }
    return root;
}

public static void inorder (Node root) {
    if(root == null) {
        return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
}
public static boolean search (Node root , int key) {
    if(root == null) {
        return false;
    }
    if(root.data>key) {
        return search(root.left, key);
    }
    else if (root.data==key) {
        return true;
    }
    else {
        return search(root.right, key);
    }
}
public static Node delete(Node root, int val) {
    if (root == null) {
        return null; // base case when root is null
    }
    if (root.data > val) {
        root.left = delete(root.left, val); // correct recursive call on left subtree
    } else if (root.data < val) {
        root.right = delete(root.right, val); // correct recursive call on right subtree
    } else {
        // Case 1: Node with no children (leaf node)
        if (root.left == null && root.right == null) {
            return null;
        }
        // Case 2: Node with only one child
        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        }
        // Case 3: Node with two children
        Node Is = inorderSuccessor(root.right);
        root.data = Is.data;
        root.right = delete(root.right, Is.data); // delete the inorder successor
    }
    return root;
}

public static Node inorderSuccessor(Node root) {
    while (root.left != null) {
        root = root.left;
    }
    return root;
}


public static void main(String []args) {
    int[] value = {8,5,3,1,4,6,10,11,14};
    Node root = null;
    for(int i = 0;i<value.length;i++) {
        root = insert(root, value[i]);
    }
    inorder(root);
    System.out.println();
    delete(root, 4);
    inorder(root);
 }

}