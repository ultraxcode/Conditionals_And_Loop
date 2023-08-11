import java.util.Scanner;

/*public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Print 1 to 5
        for ( int i=1;i<=5;i++){
            System.out.println(i);
        }
        //print 1 to n
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for ( int j=1;j<=n;j++){
            System.out.println(j);
        }
    }
}*/
// Largest of the all three numbers
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;

        if(b>max){
            max = b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);


    }
}
