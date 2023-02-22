Atividade 1 : Pesquisa sobre os paradigmas de OO e procedural.

O paradigma de programação procedural e a orientação a objetos são dois paradigmas de programação distintos. Enquanto a orientação a objetos enfatiza a reutilização de código por conta da sua estrutura modular, o paradigma procedural é mais focado na execução sequencial de instruções e em funções ou procedimentos que executam tarefas específicas. Mais detalhadamente:

O paradigma procedural é uma abordagem linear para escrever programas, onde uma sequência de instruções é executada em ordem, com ou sem desvio condicional, amplamente utilizado em linguagens de programação como C, Pascal e BASIC. Nessa abordagem, os dados são separados das operações que são realizadas sobre eles. As funções ou procedimentos são usados para modularizar o código e organizar as instruções em blocos lógicos. A reutilização de código é limitada, pois cada função ou procedimento é projetado para executar uma tarefa específica. Isso pode levar a um grande número de funções que se tornam difíceis de gerenciar conforme o código cresce.

A orientação a objetos é uma abordagem para escrever programas baseada em objetos. Os objetos são instâncias de classes que encapsulam dados e operações relacionadas em uma única unidade, utilizada em linguagens de programação como Java, C++, Python e Ruby. A OO Permite que o código seja organizado em módulos reutilizáveis e de fácil manutenção. Os objetos podem ser criados e usados em diferentes partes do código, sem precisar reescrever as mesmas funcionalidades.



Atividade 2: Algoritmo em portugol

Algoritmo Acordar

```portugol
início
Se o despertador estiver ligado, faça:
    Enquanto despertador estiver tocando, pergunte: "Está atrasado?" 
        Se a reposta for não (soneca = verdadeiro). Então
             Esperar(10)
        Senão, (soneca = falso). Então
             Esperar(0)
        Fim Se
        Fim Enquanto
Senão
    despertador está desligado
Fim Se
Falar: "Droga, perdi a hora!"
Ação: Levantar
fim_algoritmo
```

