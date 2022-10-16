public class Main {
    public static void main(String[] args){
        Solution solution = new Solution();

        TreeNode seven = new TreeNode(7);
        TreeNode fifteen = new TreeNode(15);
        TreeNode twenty = new TreeNode(20, fifteen, seven);

        TreeNode nine = new TreeNode(9);

        TreeNode root = new TreeNode(3, nine, twenty);

        System.out.println("Example One : " + solution.isBalanced(root));
    }
}
