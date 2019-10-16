import java.util.*;
public class ClientsList
{
	 public class Person
		
	 {
		 private String myFirst;
		 private String myLast;
		 
		public Person (String name)
		{
			String str = ", ";
			String stri = " ";
			if (name.contains(str))
			{
				myLast = name.substring(0, name.indexOf(str));
				myFirst =name.substring(name.indexOf(str)+2);
			}
			else
			{
				myFirst = name.substring(0,name.indexOf(stri));
				myLast = name.substring(name.indexOf(stri)+1);
				
			}
		 
		}
		public String getFirst()
		{
			return myFirst;
		}
		
		public String getLast()
		{
			return myLast;
		}
		
	 }
	 public String[] dataCleanup(String[] list) 
	 {
		 String [] sorted = new String[list.length];
		Person[] names = new Person[list.length];
		for (int i=0; i<list.length;i++ )
		{
			String s = list[i];
			names[i] = new Person(s);
			
		}
		
		Arrays.sort(names, Comparator.comparing(Person::getLast).thenComparing(Person::getFirst));
		for (int k=0; k< sorted.length;k++)
		{
			sorted[k]= names[k].getFirst() + " " + names[k].getLast();
		}
		return sorted;
	 }
	 
	 
	 
		 
	 }


