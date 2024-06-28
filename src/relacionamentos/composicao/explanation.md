# Explicação
## Classe Quarto: 
- Representa um quarto com um atributo tipo. 
- Possui um método mostrarDetalhes para exibir os detalhes do quarto.
## Classe Casa: 
- Representa uma casa que contém um quarto. 
- A composição é demonstrada pelo atributo quarto, que é uma instância da classe Quarto. 
- O construtor da classe Casa cria uma nova instância de Quarto.
## Classe Main: 
- Classe principal onde criamos uma instância de Casa e chamamos o método mostrarDetalhes, que por sua vez chama o método mostrarDetalhes do quarto contido na casa.

### Neste exemplo, a relação de composição é clara porque a instância de Quarto é criada e gerenciada pela instância de Casa. Se a instância de Casa for destruída, a instância de Quarto também será, demonstrando a forte dependência entre os dois objetos.