package stack;

import java.util.Scanner;

public class Action {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Stack<String> stringStack = new Stack<String>(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals("(") || String.valueOf(s.charAt(i)).equals("[") || String.valueOf(s.charAt(i)).equals("{")) {
                stringStack.push(String.valueOf(s.charAt(i)));
            } else if (s.charAt(i) == ')') {
                if ("(".equals(stringStack.getTop())) {
                    stringStack.pop();
                } else {
                    System.out.println("unmatch!");
                    break;
                }
            } else if (s.charAt(i) == ']') {
                if ("[".equals(stringStack.getTop())) {
                    stringStack.pop();
                } else {
                    System.out.println("unmatch!");
                    break;
                }
            } else if (s.charAt(i) == '}') {
                if ("{".equals(stringStack.getTop())) {
                    stringStack.pop();
                } else {
                    System.out.println("unmatch!");
                    break;
                }
            }
        }
        if (stringStack.getTop() == null) {
            System.out.println("matched~");
        } else {
            System.out.println("unmatch!");
        }
    }
}
