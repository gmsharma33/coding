package leetcode;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class BinaryTreeLength {
	
	static int len;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		System.out.println(new BinaryTreeLength().diameterOfBinaryTree(root));
		System.out.println(len);
	}

	public int diameterOfBinaryTree(TreeNode root) {
		if(root == null) {
			return 0;
		}
		len++;
		int length = 0;
		TreeNode node = root;
		length += diameterOfBinaryTree(node.left);
		length += diameterOfBinaryTree(node.right);
		return length;
	}

}
