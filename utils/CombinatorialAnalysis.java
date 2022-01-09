/**
 * Classe para cálculos de análises combinatórias
 * 
 * Autor: Alessandro Almeida
 */
package utils;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CombinatorialAnalysis {

    private List<List<Integer>> permutations = new ArrayList<>();

    // método retorna o fatorial de um número natural.
    public static int factorial(int number) {
        if(number < 0){
            return 0;
        }
        if(number == 0){
            return 1;
        }

        return number  * factorial(number-1);
    }

    // método retorna o número de inversões em uma sequência de naturais
    public int inversions(List<Integer> list){
        int inv = 0;
        for (int i = 0; i < list.size(); i++) {
            for(int k = i+1; k < list.size(); k++){
                if(list.get(i) > list.get(k)){
                    inv++;
                }
            }
        }
        return inv;
    }

    // método retorna uma lista com todas as permutações de N elementos
    // com os algarismos de 1 a N.
    public List<List<Integer>> permutationsN(int number){
        this.createPermutations(number);
        return this.permutations;
    }

    // método cria uma lista com todas as permutações de um lista de inteiros
    // e armazena a lista na variável permutations
    private void createPermutations(int number){
        List<Integer> array = generateList(number);
        createPermutations(array, array.size());
    }
    private void createPermutations(List<Integer> array, int pos){
        if(array.size() == pos){
            this.clearPermutations();
        }
        if (pos == 1){
            //criação de Lista auxiliar com nova permutação.
            List<Integer> aux = new ArrayList<>();
            for(int i = 0; i < array.size(); i++){
                aux.add(array.get(i));
            }

            //adiciona a nova permutação a lista
            this.permutations.add(aux);
        }
            
        // Ordenação dos elementos na array.
        for (int i = 0; i < pos; i++) {
            createPermutations(array, pos - 1);

            if (pos % 2 == 1) {
                Collections.swap(array, pos -1, 0);
                continue;
            }
            Collections.swap(array, pos - 1, i);
        }
    }

    private void clearPermutations(){
        this.permutations.clear();
    }

    private List<Integer> generateList(int number) {
        List<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < number; i++) {
            array.add(i+1);
        }
        return array;
    }

}