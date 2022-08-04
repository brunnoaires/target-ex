import javax.sound.midi.SysexMessage;
import java.lang.reflect.Array;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sp = 67738.43, rj = 36678.66, mg = 29229.88, es = 27165.48, ot = 19849.53, total = 0, sa = 0 ;
        double [] Array = {sp, rj, mg, es, ot};

        for (int i = 0; i < Array.length; i++)
        {
            total += Array[i];
        }

        for (int i = 0; i < Array.length; i++)
        {
            Array[i] = ( Array[i] / total ) *100;
        }

        for (int i = 0; i < Array.length; i++)
        {
            System.out.printf("o valor é: %.2f\n", Array[i]);
        }
    }
}

