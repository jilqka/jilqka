import java.util.ArrayList;

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

    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
    public static <E> void shuffle(ArrayList<E> list){
        for (int i = 0;  i<list.size() ; i++) {
            int randomIndex=(int) (Math.random()*list.size());
            E temp= list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex,temp);

        }
    }
    public static <E extends Comparable<E>> void sort(ArrayList<E> list){
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.size() - 1; i++) {
            currentMin = list.get(i);
            currentMinIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin.compareTo(list.get(j)) > 0) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list.set(currentMinIndex,list.get(i));
                list.set(i,currentMin);
            }
        }
    }
    public static <E extends Comparable<E>> E min(ArrayList<E> list){
        E currentMin=list.get(0);

        for (int i = 0; i < list.size() - 1; i++) {
            if (currentMin.compareTo(list.get(i))>0) {
                currentMin=list.get(i);
            }
        }
        return currentMin;
    }


}