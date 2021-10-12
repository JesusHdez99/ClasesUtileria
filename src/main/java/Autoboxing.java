
public class Autoboxing { 
    public static void main (String[] args) 
    { 
        // creating an Integer Object 
        // with value 10. 
        Integer i = new Integer(10); 

        // unboxing the Object 
        int i1 = i; 

        System.out.println("Valor de i: " + i); 
        System.out.println("valor de i1: " + i1); 

        //Autoboxing of char 
        Character gfg = 'a'; 

        // Auto-unboxing of Character 
        char ch = gfg; 
        System.out.println("Valor de ch: " + ch); 
        System.out.println("Valor de gfg: " + gfg); 

    } 
} 