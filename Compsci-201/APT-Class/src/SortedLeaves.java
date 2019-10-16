import java.util.ArrayList;
import java.util.Collections;

public class SortedLeaves 


{
	  private ArrayList <Character> myList;
	  public String[] values(TreeNode tree) 
	  {
		  myList = new ArrayList<>();
		  doWork(tree);
		  ArrayList<String> converter = new ArrayList<>();
		  for (Character chara : myList)
		  {
			  converter.add(Character.toString(chara));
		  }
		  Collections.sort(converter);

		  String[] finisher = converter.toArray(new String[0]);
		  
		  return finisher;
		  
        

      }
	  
	  public void doWork (TreeNode root)
	  {
		  if (root == null)
		  {
			  return;
		  }
		  
		  if (root.left == null && root.right == null)
		  {
			  myList.add((char)root.info);
			  return;
		  } 
		  
		  doWork(root.left);
		  doWork(root.right);
	  
	
	  }
	  
	  
}
