import java.util.*;

public class UniqueTreeValues 

{
	public int[] unique(TreeNode root) 
	{
       ArrayList<Integer> un = adder(root);
        
        Collections.sort(un);
        
        int[] uniqu = new int[un.size()];
        
        for (int i=0; i<uniqu.length;i++)
        {
        	uniqu[i] = un.get(i);
        }
        return uniqu;
        
     
    }
	
	public ArrayList<Integer> adder (TreeNode root)
	{
		ArrayList<Integer>  add = new ArrayList<>();
		
		if (root.left != null)
		{
			if (!add.contains(root.info))
			{
				add.add(root.info);
				
			}
			adder(root.left);
		}
		if (root.right != null)
		{
			if (!add.contains(root.info))
			{
				add.add(root.info);
				
			}
			adder(root.right);
		}
		
		return add;
	}
	
	
	

}
