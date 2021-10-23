import java.util.*;

public class Cocktails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayDeque<Integer> queue=new ArrayDeque<>();

        Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(queue::offer);

        ArrayDeque<Integer> stack=new ArrayDeque<>();

        Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(stack::push);

        int ingredientsSum=0;
        int pearCount=0;
        int appleCount=0;
        int harvestCount=0;
        int fashionCount=0;

        Map<String,Integer> madeCocktails=new TreeMap<>();

       while (!queue.isEmpty()&& !stack.isEmpty()){

           int firstBucket=queue.peek();
           int firstFresh=stack.peek();

           int total=firstBucket*firstFresh;


           if (firstBucket==0){
               queue.poll();
               continue;
           }

           if (total==150||total==250||total==300||total==400){
               queue.poll();
               stack.pop();
           }
           else {
               stack.pop();
               int newIng=queue.poll()+5;
               queue.offer(newIng);
           }



           switch (total){
               case 150:
                   pearCount++;
                   madeCocktails.put("Pear Sour",pearCount);
                   break;
               case 250:
                   harvestCount++;
                   madeCocktails.put("The Harvest",harvestCount);
                   break;
               case 300:
                   appleCount++;
                   madeCocktails.put("Apple Hinny",appleCount);
                   break;
               case 400:
                   fashionCount++;
                   madeCocktails.put("High Fashion",fashionCount);
                   break;
           }

       }

        if (madeCocktails.size()>=4){
            System.out.println("It's party time! The cocktails are ready!");
            printMap(madeCocktails);
        }
        else {
            if (!stack.isEmpty()||!queue.isEmpty()){
                System.out.println("What a pity! You didn't manage to prepare all cocktails.");
                if (!queue.isEmpty()){
                    for (Integer val : queue) {
                        ingredientsSum+=val;
                    }
                    System.out.println("Ingredients left: "+ ingredientsSum);
                    printMap(madeCocktails);
                }
                else {
                    printMap(madeCocktails);
                }


            }
        }







    }


    private static void printMap(Map<String, Integer> madeCocktails) {
        for (Map.Entry<String, Integer> entry : madeCocktails.entrySet()) {
            if (entry.getValue()>=1){
                System.out.printf("# %s --> %d%n",entry.getKey(),entry.getValue());
            }
        }
    }
}
