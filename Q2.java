public class Q2{
    public static void main(String[] args) {
        
        String myString1 = "Srijan";
        String myString2 = "Verma";
        
        myString1 = String.join(" ",myString1,myString2);
        System.out.println("String After Joining: "+myString1);
        
        System.out.println("Is the Stirng is Empty: "+myString1.isEmpty());
        
        myString1 = myString1.replace("Verma","Hi");
        System.out.println("String After Replacing: "+myString1);
        
        String[] words=myString1.split("\\s"); //splits the string based on whitespace 
        System.out.println("String After Spliting: ");
        for(String w:words){  
            System.out.println(w);  
        }        
        System.out.println("A substring of the original string is: "+myString1.substring(6,10));
    }
}