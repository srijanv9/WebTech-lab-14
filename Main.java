import java.util.*;  
public class Main
{
	public static void main(String[] args) {
	  LinkedList<String> al=new LinkedList<String>();  
          al.add("Srijan");  
          al.add("Triyam");  
          al.add("Swarnavo");  
          al.add("Shubham");
	  al.add("Shubhayu");  
          
          Iterator<String> itr=al.iterator();  
          while(itr.hasNext()){  
           System.out.println(itr.next());  
          }  
    }
}