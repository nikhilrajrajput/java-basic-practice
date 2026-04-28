package LogicOperator;

public class printAMPM {

    public static void main(String[] args) {
        int time=28;
        if (time>24) {
            System.out.println("Invalid Time");
        }

        else if (time>=12) {
            System.out.println("PM");
        }
        else{
            System.out.println("AM");
        }
    }
    
}
