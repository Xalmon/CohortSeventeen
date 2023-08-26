package JavaTest;

public class myArray {
    private int[] arr;

    public myArray(int[] arr) {
        this.arr = arr;
    }

    public myArray() {
        this.arr = new int[6];
    }

    public boolean isEmpty() {
        return arr.length == 0;
    }

    public void add(int i) {
        if (arr.length < 6) {
            int[] newArray = new int[arr.length + 1];
            System.arraycopy(arr, 0, newArray, 0, arr.length);
            newArray[arr.length] = i;
            arr = newArray;
        }
    }

    public int get(int index) {
        if (index >= 0 && index < arr.length) {
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
        for (int number = 0; number < arr.length; number++) {
            if (arr[number] % 2 != 0) {
                arr[number] -= 1;
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public void collectOddNumbersAndSubtractTwo() {
        System.out.println("Odd numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                arr[i] -= 2;
                System.out.println(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public int[] toArray() {
        return arr;
    }
}
