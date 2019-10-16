import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Encryption
{
	 public String encrypt(String message)
	 {
		 String alphabet = "abcdefghijklmnopqrstuvwxyz";
		//String[] alphabetSoup = alphabet.split(" ");
		ArrayList <String>noDup = new ArrayList <String>();
		HashMap<String, String> code = new HashMap<String, String>();
		String codeBreak ="";
		String codeX = "";
		 
		noDup = noDuplicates(message);
		codeX = keyCode(noDup,alphabet);
		
		for (int i=0; i<noDup.size(); i++)
		{
			code.put(noDup.get(i),codeX.substring(i,i+1));
		}
		
		for (int j=0; j< message.length(); j++)
		{
			codeBreak = codeBreak + (code.get(message.substring(j,j+1)));
		}

		

		
		 
		
return codeBreak;
}
	
	 public ArrayList <String> noDuplicates (String str)
	 {
		ArrayList <String>noDup = new ArrayList <String>();
		 
		 for (int i=0; i< str.length(); i++)
		 {
			 if (! (noDup.contains(str.substring(i,i+1))))
			 {
				 noDup.add(str.substring(i,i+1));
			 }
		 }
		 
		 return noDup;
	 }
	 
	 public String keyCode (ArrayList <String> noDup, String alphabet)
	 {
		 String keyCode ="";
		 for (int i=0; i<noDup.size(); i++)
		 {
			 if (! (keyCode.contains(alphabet.substring(i,i+1))))
			 {
				 keyCode = keyCode + alphabet.substring(i,i+1);
			 }
		 }
		 return keyCode;
	 }
	 
}
