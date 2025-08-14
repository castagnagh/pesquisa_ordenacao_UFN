## Atividade de fixação
1) pesquisar na literatura, internet ou IA Generativa sobre os métodos de ordenação e categoriza-los em:
    - algoritmo de memória interna ou memória externa
    - estabilidade (estável ou instável)
    - complexidade
    - porções de ordenação

### Exemplos:
    Pesquisar os seguintes métodos de ordenação:
    - bolha (bubble sort)
        - memória interna
        - estável
        - O(nˆ2)
        - porção ordenada: final

    - seleção (selection sort)
        - memória interna
        - instável
        - O(nˆ2)
        - porção ordenada: início

    - inserção (inserction sort)
        - memória interna
        - estável
        - O(nˆ2)
        - porção ordenada: início
### Minha pesquisa
    
    - pente (combsort)
        - memória interna
        - instável
        - O(n²) no pior caso, ~O(n log n) médio
        - porção ordenada: final

    - agitação (shakesort ou cocktailsort)
        - memória interna
        - estável
        - O(n²)
        - porção ordenada: início e final (ordenando dos dois lados)

    - shellsort
        - memória interna
        - instável
        - depende da sequência de incrementos (pior caso O(n²), melhor ~O(n log² n))
        - porção ordenada: múltiplas subsequências

    - bucketsort
        - memória interna (ou externa, se - buckets forem grandes)
        - estável (se o algoritmo interno de ordenação for estável)
        - O(n + k) onde k é o número de baldes
        - porção ordenada: cada bucket individualmente

    - radix
        - memória interna
        - estável (se o algoritmo interno usado for estável, ex.: counting sort)
        - O(n·k) onde k é o número de dígitos
        - porção ordenada: por dígito (menos significativo para mais significativo)

    - heapsort
        - memória interna
        - instável
        - O(n log n)
        - porção ordenada: final

    - mergesort
        - memória interna (pode ser externa em arquivos grandes)
        - estável
        - O(n log n)
        - porção ordenada: combinações de sublistas

    - quicksort
        - memória interna
        - instável
        - O(n²) no pior caso, O(n log n) médio
        - porção ordenada: posição do pivô a cada partição