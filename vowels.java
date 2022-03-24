import java.util.Scanner;

public class vowels{
    public static void main(String[] args){
        String userInput;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character : ");
        userInput = sc.nextLine();
        char letter = userInput.charAt(0);
        sc.close();

        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println("The input character is a vowel");
        }
        else{
            System.out.println("The given charater is a consonant");
        }
    }
}