import java.util.ArrayList;
import java.util.Collections;

public class AllPaths
{
	private ArrayList<String> myList;
	
	
	public String[] paths(TreeNode t) 
	{
      myList = new ArrayList<>();
      if (t == null)
      {
    	  return new String[0];
      }
        findPaths(t, "");
        Collections.sort(myList);
        return myList.toArray(new String[0]);
    }
	
	public void findPaths(TreeNode root, String path)
	{
		path += root.info;
		
		if (root.left == null && root.right == null)
		{
			myList.add(path);
		}
		
		else
		{
			path += "->";
			if (root.left != null)
			{
				findPaths(root.left, path);
			}
			if (root.right != null)
			{
				findPaths(root.right, path);
			}
		}
	}
	

}
