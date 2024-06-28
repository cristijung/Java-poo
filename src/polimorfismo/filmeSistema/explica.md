# Explicação dos Conceitos Utilizados

## Superclasse: 
- Conteudo é a superclasse que contém os atributos comuns a todos os conteúdos (filmes).

## Classe Abstrata: 
- Filme é uma classe abstrata que herda de Conteudo e adiciona o atributo diretor e um método abstrato calcularPreco.

## Classes: 
- FilmeAcao e FilmeComedia são classes concretas que herdam de Filme e implementam o método abstrato calcularPreco.

## Herança: 
- FilmeAcao e FilmeComedia herdam de Filme, e Filme herda de Conteudo.

## Polimorfismo: 
- O método calcularPreco é sobrescrito em FilmeAcao e FilmeComedia, demonstrando polimorfismo.

## Modificadores de Acesso: 
- private, public e protected são utilizados para controlar o acesso aos atributos e métodos.

## Métodos com Cálculo: 
- Os métodos calcularPreco em FilmeAcao e FilmeComedia realizam cálculos específicos para determinar o preço dos filmes.

## Classe Main: 
- Utiliza Scanner para entrada de dados do usuário e cria instâncias de FilmeAcao e FilmeComedia.
### Menu de Opções: 
- Foi adicionado um loop while que exibe um menu com três opções: 
adicionar um filme de ação, adicionar um filme de comédia ou sair do programa.
- Estrutura de Controle switch: 
A estrutura switch é usada para tratar a escolha do usuário. Dependendo da opção escolhida, uma das funções adicionarFilmeAcao ou adicionarFilmeComedia é chamada.
- Métodos adicionarFilmeAcao e adicionarFilmeComedia: 
Essas funções encapsulam a lógica para adicionar filmes específicos e exibem os detalhes e o preço calculado do filme.




