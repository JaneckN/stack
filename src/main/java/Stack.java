/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 21 July 2021 @ 21:43
 */


public class Stack {

    private String[] elements;
    private int lastIndex;

    public Stack() {
        lastIndex = -1;
        elements = new String[20];
    }


    // This method is used to get an element from the top of Stack without removing it.
    public String peek() {
        if (isEmpty()) {
            return null;
        }
        return elements[lastIndex];
    }

    // This method is used to get an element from the top of Stack and removing it.
    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String element = elements[lastIndex];
        elements[lastIndex] = null;
        lastIndex--;
        return element;


    }

    // This method is used to add element on the top of Stack.
    public String push(String element) {
        if (isFull()) {
            increaseSizeOfArray();
        }
        elements[lastIndex + 1] = element;
        lastIndex++;
        return elements[lastIndex];


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
        String[] temporary = new String[elements.length];
        System.arraycopy(elements, 0, temporary, 0, elements.length);
        elements = new String[elements.length + 20];
        System.arraycopy(temporary, 0, elements, 0, temporary.length);
    }


}
