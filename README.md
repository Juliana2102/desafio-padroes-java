## Projeto: Padrões de Projeto - Estratégias de Pagamento

Descrição

Este projeto demonstra a aplicação do padrão de projeto Strategy e do padrão Facade para o processamento de pagamentos em diferentes métodos, como Bitcoin, Cartão de Crédito e PayPal. Ele é dividido em várias classes que representam os diferentes métodos de pagamento e como eles podem ser gerenciados de forma unificada pelo sistema.

Estrutura do Projeto

O projeto está organizado da seguinte maneira:

PagamentoBitcoin.java: Implementa o pagamento usando Bitcoin.

PagamentoCartaoCredito.java: Implementa o pagamento usando Cartão de Crédito.

PagamentoPayPal.java: Implementa o pagamento usando PayPal.

ProcessadorPagamento.java: Classe responsável por processar o pagamento com a estratégia fornecida.

FacadePagamento.java: Fornece uma interface simples para gerenciar diferentes tipos de pagamento.

Main.java: Ponto de entrada do programa, onde os pagamentos são processados com base na escolha do usuário.


Padrões de Projeto Utilizados

Strategy: Cada método de pagamento é uma estratégia diferente implementada de acordo com a interface comum de pagamento.

Facade: Simplifica a interação com os diversos métodos de pagamento, oferecendo uma única interface de processamento.

Exemplo de Uso

No Main.java, o usuário pode escolher entre diferentes formas de pagamento, e o sistema processará o pagamento utilizando a estratégia escolhida. Exemplo de execução:

Escolha o método de pagamento:
1. Bitcoin
2. Cartão de Crédito
3. PayPal
Opção: 2

Processando pagamento com Cartão de Crédito...
Pagamento realizado com sucesso!

Tecnologias Utilizadas

Java SE: Linguagem de programação utilizada para implementar o projeto.
