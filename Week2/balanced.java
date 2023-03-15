import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.Stack;

public class balanced {
    Stack<String> stack = new Stack<String>();
    HashMap<String, String> myHash = new HashMap<String, String>();


    public balanced(){
        myHash.put("]", "[");
        myHash.put("}", "{");
        myHash.put(")", "(");
    }
    
    public boolean checkBalanced(String input){

        stack.clear();
        String inputString =  input.replaceAll(" ", "");
        String[] inputStringArray = inputString.split("");
        
        for(String el : inputStringArray){
            if (el.equals("(") || el.equals("{") || el.equals("[")){
                stack.push(el);
            }else{
                try{
                    String top = stack.peek();
                    if (!top.equals(myHash.get(el))){
                        System.out.println("False");
                        return false;
                    }else{
                        stack.pop();
                    }
                }
                catch(EmptyStackException ex){
                    return false;

                }
                
                
            }
           
        }
        if (stack.empty()){
            System.out.println("True");
            return true;
        }else{
            System.out.println("False");
            return false;
        }
    }
    
    public static void main(String[] args){
        balanced b = new balanced();
        b.checkBalanced("[ ]");
        b.checkBalanced("{}{}[]()");
        b.checkBalanced("[{()}]");
        b.checkBalanced("(()[[[()({})]]])");
        b.checkBalanced("[ ] [");
        b.checkBalanced("{{}[](})");
        b.checkBalanced("[{)}]");
        b.checkBalanced("(()[()({})]]])");
    }
}
