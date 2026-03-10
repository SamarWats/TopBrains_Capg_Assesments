package trainer1;

import java.util.Arrays;
public class method_reference {
      	// Method
    public static void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args){
        
        String[] names = {"Sam", "Samar", "Rishabh"};

        // Using method reference to print each name
        Arrays.stream(names).forEach(method_reference::print);
    }
}