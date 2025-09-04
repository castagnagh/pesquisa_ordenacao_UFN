## Revisão: bolha, seleção, inserção, agitação, pente, shell
  
## O que é ordenação e por que é importante ordenar estruturas de dados?
  
  Ordenação é quando usamos uma estrutura de dados utilizando uma chave ou valor colocando em ordem crescente ou decrescente.
  A importancia de ordenar uma estrutura de dados é porque traz ao usuário uma visualização mais amigável, e otimiza a busca dos dados. 
  
## Dos vários algoritmos de ordenação, há categorias que os classificam, como:
  estabilidade
  complexidade
    
## Explique o que é estabilidade e complexidade. Se necessário, dar exemplos. Quais os métodos estudados que são estáveis e quais que são instáveis

  Estabilidade é quando o processo de ordenação garante uma ordenação temporária da estrutura, evitando trocas de valores das suas posições.
  Instabilidade é o contrario, quando o processo não garante a ordenação temporária da estrutura, ocorrendo trocas de valores que já estavam em sua posição correta.

  bolha, inserção, agitação (estável)
  seleção, pente (instável) 

## Dos métodos estudados, quais suas complexidades? Como é avaliada a complexidade de um método de ordenação?

  bolha, inserção, agitação (estável)
  seleção, pente (instável)
  
## Dos métodos estudados, qual o melhor método de ordenação?
 
  bolha O(n²), 
  
  inserção O(n²), 
  
  agitação O(n²)
  
  seleção O(n²) 
  
  O melhor método é este abaixo, pois é um aprimoramento do Bolha, que faz uma varredura de acordo com a distância calculada
  pente O(n²) no pior caso, no caso médio O(n log n)
  
## Faça um método na sua linguagem de preferência que retorne true/True se a lista enviada como parâmetro está ordenada, o false/False caso contrário

```
bool ValidaOrdenação(List<> lista)
{
  while(lista.Count()-1){
    if(lista.Count() > lista.Count()+1){
      return false;
    }
    return true;
}
```

## Da a sequência de valores na estrutura abaixo, contabilize quantas comparações e quantas trocas há para os métodos:
    - bolha - 56 comparações e 22 trocas 
    - pente - 35 comparações e e 8 trocas
    - seleção

    0   1   2   3   4   5   6   7   8
    30  90  10  20  80  10  20  40  10 
    30  10  90  20  80  10  20  40  10
    10  30  90  20  80  10  20  40  10
    10  30  20  90  80  10  20  40  10
    10  30  20  80  90  10  20  40  10
    10  30  20  80  10  90  20  40  10
    10  30  20  10  80  90  20  40  10
    10  30  20  10  80  90  20  40  10
                
## Na sua linguagem de preferência, implemente (sem consulta) seu método escolhido para saber.

## Como ordenar pela segunda ou terceira chave
    Exemplo uma lista de Alunos(codigo, curso, nome) - ordenar por curso e ordenar por nome
