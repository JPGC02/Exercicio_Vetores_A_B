# Exercicio_Vetores_A_B
___________________________________________________________________________________________

CONSIDERE OS DOIS VETORES A E B E QUE CADA UM CONTENHA CINCO ELEMENTOS A PARTIR DO 1. QUAL SERÁ O VALOR DA VARIÁVEL C A SER EXIBIDA PELO FLUXOGRAMA (NA IMAGEM), SE FOREM DIGITADOS OS SEGUINTES VALORES PARA OS VETORES A E B:

ELEMENTOS DE A: (4, 6, 7, 1, 0) (NESTA ORDEM);
ELEMENTOS DE B: (7, 1, 3, 1, 2) (NESTA ORDEM).

______________________________________________________________________________________________

  INÍCIO
      VAR 
      x <- 0
      a:  cadeia
      b: cadeia

      x <- x + 1
      A[4,6,7,1,0]
      B[7,1,3,1,2]

        ENQUANTO x > 4, FAÇA
          x <- 1
          C <- 0
        FIM ENQUANTO

      SE x <= 5, FAÇA
        ENQUANTO x <= 5, FAÇA
        EXIBIR(C <- C + A[x] * B[x])
        x <- x + 1
        FIM ENQUANTO
    SE NÃO
        EXIBIR(C)
    FIM SE    
FIM
_____________________________________________________________________________________________

![Fluxograma Vetores A e B](https://user-images.githubusercontent.com/103973489/173206742-a5eeb2f8-b449-4a7e-a909-0b594c5c51bd.png)

_____________________________________________________________________________________________
