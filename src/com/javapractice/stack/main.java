package com.javapractice.stack;


import java.util.Stack;

//LIFO>> if I pop() , the top item will be removed.
//real life uses:
// 1.undo/redo function in text editors
// 2. back /forward in browser
// 3. calling funtions (call stack)
public class main {
    public static void main(String[] args){

        Stack<String> stack = new Stack<>();
        stack.push("BMW");
        stack.push("Audi");
        stack.push("McLaren");
        stack.push("Buggati");
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        String topItem = stack.peek(); // show the top item
        System.out.println(topItem);

        System.out.println(stack.empty());

        System.out.println(stack.search("BMW"));
    }
}
