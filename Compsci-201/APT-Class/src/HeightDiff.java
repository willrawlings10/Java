
public class HeightDiff 
{
	public int maxhd(TreeNode root) 
	{
		int heightLeft = height(root.left);
		int heightRight = height(root.right);
		int height = Math.abs(heightLeft-heightRight);
		
		//int diff = Math.max(heightLeft, heightRight);
		return Math.max(height, maxhd(root.right));
    }
	
	 public int height(TreeNode root)
	 {
	       if (root == null) return 0;
	       return 1 + Math.max(
	                     height(root.left), 
	                     height(root.right));
	   }

}
