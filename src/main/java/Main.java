
/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 21 July 2021 @ 22:46
 */


public class Main {

    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        System.out.println(stack.push(1));
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        for (int i = 0; i < 70; i++) {
            stack.push(i);
        }
        System.out.println(stack.peek());
        for (int i = 0; i < 70; i++) {
            stack.pop();
        }
        System.out.println(stack.peek());


    }


}
