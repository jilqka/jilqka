public class Generic_sort {
    public static void main(String[] args) {
        GeometricObject[] geometricArr = {new Circle(4), new Circle(2), new Rectangle(5,4)};
        System.out.println("Before sort:\n");
        printList(geometricArr);
        sort(geometricArr);
        System.out.println("Sorted: \n");
        printList(geometricArr);
    }

    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length - 1; i++) {
            currentMin = list[i];
            currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    /** Print an array of objects */
    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}