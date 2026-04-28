package LogicOperator;

public class findMedian {
    

    public static void main(String[] args) {
        int a=12;
        int b=15;
        int c=18;

         int median;

        // Logic: median is the number that is not min or max
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            median = a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            median = b;
        } else {
            median = c;
        }

        System.out.println("Median value is: " + median);
    }
}
