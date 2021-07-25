/**
 * ... comment class...
 *
 * @author JKN janeck@protonmail.com
 * @since 21 July 2021 @ 21:43
 */


public class Stack<T> {

    private T[] elements;
    private int lastIndex;

    public Stack() {
        lastIndex = -1;
        elements = (T[]) new Object[10];
    }


    // This method is used to get an element from the top of Stack without removing it.
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return elements[lastIndex];
    }


    // This method is used to get an element from the top of Stack and removing it.
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T element = elements[lastIndex];
        elements[lastIndex] = null;
        lastIndex--;

        if (isOversize()) {
            elements = decreaseSizeOfArray();
        }
        return element;
    }


    // This method is used to add element on the top of Stack.
    public T push(T element) {
        if (isFull()) {
            elements = increaseSizeOfArray();
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
        return lastIndex + 1 == elements.length;
    }


    private boolean isOversize() {
        if (lastIndex > 16 && elements.length / (lastIndex + 2) >= 2) {
            return true;
        } else {
            return false;
        }
    }

    private T[] increaseSizeOfArray() {
        T[] temporary = (T[]) new Object[lastIndex + 10];
        for (int i = 0; i <= lastIndex; i++) {
            temporary[i] = elements[i];
        }
        return temporary;
    }

    private T[] decreaseSizeOfArray() {
        T[] temporary = (T[]) new Object[lastIndex + 20];
        for (int i = 0; i <= lastIndex; i++) {
            temporary[i] = elements[i];
        }
        return temporary;
    }

    public int getLastIndex() {
        return lastIndex;
    }


}
