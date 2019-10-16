
public class PathSum 
{
	public int hasPath(int target, TreeNode tree)
	{
		int sum =0;
		if (tree == null)
		{
			return 0;
		}
		
		if ((tree.left == null) && ( tree.right ==null) && (tree.info == target) && sum == 0)
		{
			return 1;
		}
		if ((tree.left == null) && (tree.right == null)) 
		{
			return sum;
		}
		
        return sum;
    }

}
