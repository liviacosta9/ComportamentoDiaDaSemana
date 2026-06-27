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

## Exemplo de Execução

```text
Informe seu nome: Maria
Informe a tarefa: Implementar relatório
Deseja usar o dia atual? (s/n): n
Informe o dia da semana: quarta-feira

Usuário: Maria
Dia consultado: quarta-feira
Prioridade: MEDIA
Mensagem: Dia de revisão: verifique o andamento da atividade "Implementar relatório".