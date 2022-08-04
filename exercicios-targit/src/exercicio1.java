public class exercicio1


        public static void main(String[] args) {


        int a = 0, b = 1, c = 0, n, contador = 2;

        do {
        System.out.println("Qual numero deseja calcular? ");
        n = sc.nextInt();
    } while (n < 1);

        if (n == 1) {
        System.out.println("0");
    } else {
        if (n == 2) {
            System.out.println("1");
        } else {
            while (c <= n) {
                c = a + b;
                a = b;
                b = c;

                if( c == n ){
                    System.out.println("pertence :D");
                    break;
                }

                else if( c > n) {
                    System.out.println("nao pertence");

                }
            }
        }
    }
}
}
}
