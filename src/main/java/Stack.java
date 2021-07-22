/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 21 July 2021 @ 21:43
 */


public class Stack {

    private int[] elements;
    private int lastIndex;

    public Stack() {
        lastIndex = -1;
        elements = new int[20];
    }


    // This method is used to get an element from the top of Stack without removing it.
    public int peek() {


        return 1;
    }

    // This method is used to get an element from the top of Stack and removing it.
    public int pop() {
        return 1;

    }

    // This method is used to add element on the top of Stack.
    public int push(int element) {
        if (isFull()) {
            increaseSizeOfArray();
        }

        return 1;

    }

    public boolean isEmpty() {
        if (lastIndex == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (lastIndex == elements.length) {
            return true;
        } else {
            return false;
        }
    }

    private void increaseSizeOfArray() {
        int[] temporary = new int[elements.length];
        System.arraycopy(elements, 0, temporary, 0, elements.length);
        elements = new int[elements.length + 20];
        System.arraycopy(temporary, 0, elements, 0, temporary.length);
    }


}
