import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

class day28 {
    static Node buildTree(Integer[] arr) {
        if (arr.length == 0 || arr[0] == null) {
            return null;
        }

        Node root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < arr.length) {
            Node current = queue.poll();

            if (i < arr.length && arr[i] != null) {
                current.left = new Node(arr[i]);
                queue.add(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                current.right = new Node(arr[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    static boolean isMirror(Node leftSub, Node rightSub) {
        if (leftSub == null && rightSub == null) {
            return true;
        }
        if (leftSub == null || rightSub == null) {
            return false;
        }
        return (leftSub.data == rightSub.data) &&
               isMirror(leftSub.left, rightSub.right) &&
               isMirror(leftSub.right, rightSub.left);
    }

    static boolean isSymmetric(Node root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    public static void main(String[] args) {
        Integer[] input = {1, 2, 2, 3, null, null, 3};
        Node root = buildTree(input);
        System.out.println(isSymmetric(root));
    }
}
