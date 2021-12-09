## Atividade

Escreva um programa que modele um sistema comercial de transação de pagamentos. O sistema deve ser compatível com vários métodos de pagamentos. Sabendo disso, você recebeu do arquiteto de software a seguinte arquitetura:

![Classes](https://github.com/gustavoleitao/imd0040-atv05/blob/main/src/main/resources/atv5-uml.png?raw=true)

Para efeito de simulação, faça a implementação via cartão **sempre retornar falha** e a implementação do PIX **sempre retornar sucesso**.

Em seguida crie uma classe chamada `ProcessadorPagamentos`. Essa classe simula o processamento de um pagamento feito com um ou mais métodos de pagamento.

O processador de pagamentos deve iterar sobre os métodos e chamar o método debitar. Se algum método falhar, este deve estornar o pagamento daqueles já processados com sucesso.

> Atenção utilize exatamente os mesmos nomes para as classes, atributos e métodos da imagem de referência.

## Testes

O programa possui testes automatizados implementados. Se quiser testar execute o seguinte comando:

```console
$ ./gradlew test
```