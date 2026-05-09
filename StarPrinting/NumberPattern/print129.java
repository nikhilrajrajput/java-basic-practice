package StarPrinting.NumberPattern;

public class print129 {

    public static void main(String[] args) {
        int counter=1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    
}
