import java.util.*;

public class Main {
    public static void main(String[] args) {
         Random r = new Random();

        int[] array = new int[5];
        for (int i = 1; i < array.length; i++) {
            array[i] = r.nextInt(2);
        }
        Arrays.sort(array);

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(r.nextInt(2));
        }

        Collections.sort(arrayList);
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.add(r.nextInt(2));
        }


        Collections.sort(linkedList);
        san(array);
        System.out.println();
        sandar(arrayList);
        System.out.println();
        sandarLinked(linkedList);
    }

    public static int[] san(int[] number) {
        for (int i : number) {
            if (i == 0) {
                System.out.print(i + ",");
            }
            if (i == 1) {
                System.out.print(i + ",");
            }

        }
        return number;
    }

    public static ArrayList<Integer> sandar(ArrayList<Integer> number) {
        for (int i : number) {
            if (i == 0) {
                System.out.print(i + ",");
            }
            if (i == 1) {
                System.out.print(i + ",");
            }
        }
        return number;

    }

    public static LinkedList<Integer> sandarLinked(LinkedList<Integer> number) {
        for (int i : number) {
            if (i == 0) {
                System.out.print(i + ",");
            }
            if (i == 1) {
                System.out.print(i + ",");
            }
        }
        return number;

    }
    }