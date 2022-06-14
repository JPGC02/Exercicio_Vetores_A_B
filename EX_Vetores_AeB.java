import java.util.Arrays;


public class EX_Vetores_AeB {


    public static void main(String[] args) {


        // Declaracao das variaveis
        int A[] = {
            4,
            6,
            7,
            1,
            0
        }, B[] = {
            7,
            1,
            3,
            1,
            2
        };
        int C = 0;
        int X = 0;

        System.out.print("Valores do vetor A maiores que 4 sao: ");

        // repetiçao do vetor
        for (X = 0; X < 5; X++) {
            // resoluçao do vetor A maior que 4
            if (A[X] > 4) {
                System.out.printf("%d ", A[X]);
            }

        }

        System.out.printf("\n");


        // repetiçao do vetor
        for (X = 0; X < 5; X++) {


            // resoluçao do vetor B maior que 4
            if (B[X] > 4) {


                System.out.printf("Valores do vetor B maiores que 4 sao: %d",
                    B[X]);

            }

        }
        System.out.printf("\n");
        System.out.print("Valores do vetor A menores ou iguais a 5 sao: ");


        // repetiçao do vetor
        for (X = 0; X < 5; X++) {


            // resoluçao do vetor A menor ou igual a 5
            if (A[X] <= 5) {
                System.out.printf("%d ", A[X]);

            }

        }
        System.out.printf("\n");
        System.out.print("Valores do vetor B menores ou iguais a 5 sao: ");


        for (X = 0; X < 5; X++) {

            // resoluçao do vetor B menor ou igual a 5
            if (B[X] <= 5) {
                System.out.printf("%d ", B[X]);
                C = A[X] * B[X];

            }

        }
        System.out.printf("\n");

        // mostrar a variavel C
        System.out.printf("O valor de C = %d", C);

    }

}
