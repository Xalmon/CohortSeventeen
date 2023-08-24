package JavaTest;

public class myArray {
    private int[] arr;
    private int size;

    public myArray(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
    }

    public myArray() {
        this.arr = new int[6];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int i) {
        if (size < arr.length) {
            arr[size] = i;
            size++;
        }
    }

    public void swishArray() {
    }

    public int get(int index) {
        if (index >= 0 && index < size) {
            return arr[index];
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
    }

    public void checkEvenOdd() {
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }

    public void subtractFromOdd() {
        for (int index = 0; index < size; index++) {
            if (arr[index] % 2 != 0) {
                arr[index] -= 1;
                System.out.print(index + " ");
            }
        }
        System.out.println();
    }

    public void collectOddNumbersAndSubtractTwo() {
        System.out.println("Odd numbers:");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                arr[i] -= 2;
                System.out.println(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public int[] toArray() {
        int[] newArray = new int[size];
        System.arraycopy(arr, 0, newArray, 0, size);
        return newArray;
    }
}
