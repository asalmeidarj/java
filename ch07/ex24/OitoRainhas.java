// OitoRainhas.java
//
// Programa resolve o problema das 8 rainhas utilizando algoritmo de força bruta
// Para representar um tabuleiro usamos um vetor int[8][8], onde int[0][1] representa
// linha 0 e coluna 1 do tabuleiro.
// As casas ocupadas pelas rainhas representaremos com o número 1 e as vazias com 0.
//
// Autor: Alessandro Almeida

package ch07.ex24;

public class OitoRainhas {

    private static int[][] tabuleiro;
    private static int contador = 0;

    // vetor auxiliar simula as posições inicias das rainhas nas diagonais.
    // Ex.: vetorAux[i] = i  -->  Rainha na linha  i e coluna i
    private static int[] vetorAux = new int[] { 0, 1, 2, 3, 4, 5, 6, 7 };

    public static void main(String[] args) {

        Solucoes(vetorAux, vetorAux.length);

    }

    // método gera todas as permutações de um vetor e exibe as que representam uma solução.
    private static void Solucoes(int[] vetor, int tamanho) {
        if (tamanho == 1) {
            if(ehSolucao(vetor)){
                contador++;
                System.out.printf("%nSolução: %s%n", contador);
                mostrarSolucao(vetor);
                System.out.println();
            }         
        }

        // reordenação dos elementos no vetor.
        for (int i = 0; i < tamanho; i++) {
            Solucoes(vetor, tamanho - 1);

            if (tamanho % 2 == 1) {
                trocarPosicao(vetor, tamanho - 1, 0);
                continue;
            }
            trocarPosicao(vetor, tamanho - 1, i);
        }
    }

    // método recebe por parâmetro vetor que representa uma
    // possível solução e valida a solução. (return é true, caso a solução seja válida)
    private static boolean ehSolucao(int[] vetor) {
        int linha;
        int coluna;
        int linhaRastro; // armazena posição da linha de uma diagonal da rainha
        int colunaRastro; // armazena posição da coluna de uma diagonal da rainha

        for (int i = 0; i < 8; i++) {
            linha = i; // número da linha que a rainha se encontra
            coluna = vetor[i]; // número da coluna que a rainha se encontra

            // atribui valor da posição da diagonal inferior direta
            linhaRastro = linha + 1;
            colunaRastro = coluna + 1;
            while (linhaRastro < 8 && colunaRastro < 8) {
                // se condição for verdadeira significa que
                // existe mais de uma rainha na diagonal
                if (vetor[linhaRastro] == colunaRastro)
                    return false;

                // avança para próxima diagonal no mesmo sentido
                linhaRastro++;
                colunaRastro++;
            }

            // atribui valor da posição da diagonal inferior esquerda
            linhaRastro = linha + 1;
            colunaRastro = coluna - 1;
            while (linhaRastro < 8 && colunaRastro >= 0) {
                // se condição for verdadeira significa que
                // existe mais de uma rainha na diagonal
                if (vetor[linhaRastro] == colunaRastro)
                    return false;

                // avança para próxima diagonal no mesmo sentido
                linhaRastro++;
                colunaRastro--;
            }
        }
        return true;
    }

    private static void trocarPosicao(int[] vetor, int pos1, int pos2) {
        int aux = vetor[pos1];
        vetorAux[pos1] = vetor[pos2];
        vetorAux[pos2] = aux;
    }

    private static void mostrarSolucao(int[] solucao) {
        tabuleiro = new int [8][8];
        for(int linha: solucao){
            tabuleiro[linha][solucao[linha]] = 1;
        }
        for (int linha = 0; linha < 8; linha++) {
            for (int coluna = 0; coluna < 8; coluna++) {
                if (coluna == 0) {
                    System.out.println();
                }
                System.out.printf("%3s", tabuleiro[linha][coluna]);
            }
        }
    }
}
