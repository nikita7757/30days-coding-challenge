import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class day25 {
    static int maxValue(Node node) {
        if (node == null) return Integer.MIN_VALUE;
        return Math.max(node.data, Math.max(maxValue(node.left), maxValue(node.right)));
    }

    static int minValue(Node node) {
        if (node == null) return Integer.MAX_VALUE;
        return Math.min(node.data, Math.min(minValue(node.left), minValue(node.right)));
    }

    static boolean isBST(Node node) {
        if (node == null) return true;
        if (node.left != null && maxValue(node.left) >= node.data)
            return false;
        if (node.right != null && minValue(node.right) <= node.data)
            return false;
        return isBST(node.left) && isBST(node.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the root node value:");
        int rootVal = sc.nextInt();
        Node root = new Node(rootVal);

        System.out.println("Enter the left child of root (-1 for null):");
        int leftChild = sc.nextInt();
        if (leftChild != -1) {
            root.left = new Node(leftChild);
        }

        System.out.println("Enter the right child of root (-1 for null):");
        int rightChild = sc.nextInt();
        if (rightChild != -1) {
            root.right = new Node(rightChild);
        }

        if (root.left != null) {
            System.out.println("Enter the left child of left node (-1 for null):");
            int leftLeftChild = sc.nextInt();
            if (leftLeftChild != -1) {
                root.left.left = new Node(leftLeftChild);
            }

            System.out.println("Enter the right child of left node (-1 for null):");
            int leftRightChild = sc.nextInt();
            if (leftRightChild != -1) {
                root.left.right = new Node(leftRightChild);
            }
        }

        if (isBST(root)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close();
    }
}
