import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavra = sc.next();
        String invert = "";

        for(int i = palavra.length() - 1; i >= 0; i--){
            invert = invert + Character.toString(palavra.charAt(i));

        }
        System.out.println(invert);

    }
}

