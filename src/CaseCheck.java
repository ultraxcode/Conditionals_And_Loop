import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter = input.next().trim().charAt(0);
        if(letter>='a'&& letter<='z'){
            System.out.println("LowerCase");
        }
        else{
            System.out.println("UpperCase");
        }
    }
}
