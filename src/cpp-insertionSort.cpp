/* 
O algoritmo insertion Sort faz  aordenação em dois sentidos.
Primeiramente há a comparação do elemento com o elemnto a sua direita,
caso seja necessária a troca,  então o elmento troca é comparado com o
item a sua esquerda, até chegar no índice zero e não ser mais necessária
alguma troca.
*/
#include <stdio.h>
#include <stdlib.h>
#include <iostream> // lib respoonsável pelo colunt

using namespace std;

int main() {
    int arrayEntrada[6] = {233, 15, 3, 78, 6, 22};

    
    for (int i = 1; i < 6; i++) {
        int chave = arrayEntrada[i];
        int indice_anterior = i - 1;

        while (indice_anterior >= 0 && arrayEntrada[indice_anterior] > chave) {
            arrayEntrada[indice_anterior + 1] = arrayEntrada[indice_anterior];
            indice_anterior = indice_anterior - 1;
        }

        arrayEntrada[indice_anterior + 1] = chave;
    }
    
    // Impressão do array
    
    for (int i = 0; i < 6; i++) {
        std::cout << arrayEntrada[i] << " ";
    }

    return 0;
}

/*
for iteração 1

chave  == 15
indice_anterior == 0
arrayEntrada[indice_anterior] == 233
arrayEntrada[indice_anterior + 1] == 15

 - começa o while

arrayEntrada[indice_anterior + 1] = 233 (anterior 15)


indice_anterior = -1 (anterior zero)

 - sai do while

arrayEntrada[indice_anterior + 1] = 15 (antes 233)

 - proximo for

{15, 233, 3, 78, 6, 22}

chave == 3
indice_anterior == 1
arrayEntrada[indice_anterior] == 233
arrayEntrada[indice_anterior + 1] == 3

 - começa o while

arrayEntrada[indice_anterior + 1] = 233 (anterior 3)

indice_anterior = 0 (anterior um)

arrayEntrada[indice_anterior] == 15

- Continua while

...




*/
