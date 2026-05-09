package StarPrinting;

public class charPattern {

    public static void main(String[] args) {
        int n = 5;
        
        for (int row=n;row>=1;row--){
            char ch = 'A';
            for(int col=1;col<=row;col++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
    
}
