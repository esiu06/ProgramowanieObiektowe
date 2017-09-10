package ZadaniaPowtorkowe.Zad2;

import java.util.Stack;


public class Nawiasy {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        for (String s:args) {
            if(s.equals("(")){
                stack.push("(");
            }
            if(s.equals(")")){
                try {
                    stack.pop();
                }
                catch (Exception e){
                    System.out.println("Błędne nawiasy");
                    return;
                }
            }
        }
        if(!stack.empty()){
            System.out.println("Błędne nawiasy");
            return;
        }
        System.out.println("Nawiasy poprawne");
    }
}
