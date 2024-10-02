import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x) {
        val = x;
    }
}

public class day23 {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }

    public TreeNode insertLevelOrder(int[] arr, TreeNode root, int i) {
        if (i < arr.length) {
            TreeNode temp = new TreeNode(arr[i]);
            root = temp;

            root.left = insertLevelOrder(arr, root.left, 2 * i + 1);
            root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Day23 tree = new Day23();

        System.out.println("Enter the number of nodes in the binary tree:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the values of the nodes in level order:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        TreeNode root = tree.insertLevelOrder(arr, null, 0);

        System.out.println("Enter the values of the two nodes to find their LCA:");
        int pValue = scanner.nextInt();
        int qValue = scanner.nextInt();

        TreeNode p = findNode(root, pValue);
        TreeNode q = findNode(root, qValue);

        if (p != null && q != null) {
            TreeNode lca = tree.lowestCommonAncestor(root, p, q);
            System.out.println("LCA of " + pValue + " and " + qValue + " is: " + (lca != null ? lca.val : "null"));
        } else {
            System.out.println("One or both nodes not found in the tree.");
        }
        
        scanner.close();
    }

    public static TreeNode findNode(TreeNode root, int value) {
        if (root == null) {
            return null;
        }
        if (root.val == value) {
            return root;
        }

        TreeNode left = findNode(root.left, value);
        if (left != null) {
            return left;
        }
        return findNode(root.right, value);
    }
}
