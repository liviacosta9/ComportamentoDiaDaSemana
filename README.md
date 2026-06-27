# Comportamento por Dia da Semana

Projeto desenvolvido utilizando os padrões de projeto **Strategy** e **Null Object**.

## Alunas

Gabrielle Suemi Iquejiri Alencar

Lívia Costa da Silva

## Objetivo

O sistema identifica um dia da semana (atual ou informado pelo usuário) e executa um comportamento específico para esse dia, exibindo uma mensagem e uma recomendação de prioridade.

## Padrões Utilizados

### Strategy
Cada dia da semana possui uma estratégia própria responsável por executar sua ação.

### Null Object
Quando o dia informado é inválido ou não possui estratégia associada, o sistema utiliza uma estratégia padrão (`EstrategiaAusente`), evitando verificações de `null`.

## Funcionalidades

- Consulta automática do dia atual.
- Consulta manual de qualquer dia da semana.
- Recebimento de nome e tarefa do usuário.
- Exibição de mensagem personalizada.
- Exibição de prioridade (ALTA, MÉDIA ou BAIXA).
- Tratamento seguro para entradas inválidas.

## Exemplos de Execução

### Exemplo 1 - Entrada válida

Informe seu nome: Maria
Informe a tarefa: Implementar relatório
Deseja usar o dia atual? (s/n): n
Informe o dia da semana: quarta-feira

Saída:

Usuário: Maria
Dia consultado: quarta-feira
Prioridade: MEDIA
Mensagem: Dia de revisão: verifique o andamento da atividade "Implementar relatório".

### Exemplo 2 - Entrada inválida

Informe seu nome: Ana
Informe a tarefa: Implementar relatório
Deseja usar o dia atual? (s/n): n
Informe o dia da semana: feriado

Saída:

Usuário: Ana
Dia consultado: inválido
Prioridade: BAIXA
Mensagem: Não há estratégia associada para o dia informado.

## Questões de Reflexão

### 1. Como evitar verificações repetidas de valores nulos no código principal?

Podemos utilizar um objeto padrão para representar a ausência de uma estratégia. Dessa forma, o código principal sempre trabalha com um objeto válido, sem a necessidade de verificar se ele é nulo.

### 2. Qual padrão de projeto pode ser utilizado para representar a ausência de uma estratégia de forma segura?

O padrão Null Object.

### 3. Explique brevemente como esse padrão seria incorporado à solução.

Foi criada a classe `EstrategiaAusente`, que implementa a interface `EstrategiaDia`. Quando o dia informado é inválido ou não possui uma estratégia cadastrada, o sistema retorna uma instância dessa classe em vez de retornar `null`. Assim, o programa continua funcionando normalmente e fornece uma resposta adequada ao usuário.