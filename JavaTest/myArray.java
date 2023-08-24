package JavaTest;

public class myArray {
    private int[] arr;
    int size;


    public myArray(int[] arr) {
        this.arr = arr;
    }

    public myArray() {
        int[] arr = new int[6];
        size = 0;
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

    public int get(int number) {
        if (number >= 0 && number < size) {
            return arr[number];
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

//    public void subtractFromOdd() {
//        for (int number = 0; number < arr.length; number++) {
//            if (arr[number] % 2 != 0) {
//                arr[number] -= 1;
//                System.out.println(number + " ");
//            }
//        }
//    }

        public void collectOddNumbersAndSubtractTwo() {
            if (arr == null || arr.length == 0) {
                return;
            }

            System.out.println("Even numbers:");
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


