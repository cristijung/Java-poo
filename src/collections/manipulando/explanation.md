# Explicação do Código
## Classe Medicamento:
- Define os atributos codigo, nome, e preco.
- Inclui métodos getters e setters.
- Override de toString(), equals(), e hashCode() para correta manipulação de objetos em coleções.
- Implementa Comparable<Medicamento> para que os medicamentos sejam ordenados pelo codigo.
## Classe Main:
- Cria uma List<Medicamento> sincronizada para gerenciar medicamentos.
- Usa a classe Scanner para obter a entrada do usuário.
- Permite que o usuário adicione medicamentos, atualize preços, remova medicamentos, e liste todos os medicamentos.
- Oferece opções para ordenar medicamentos, buscar por código (usando busca binária), inverter a ordem e embaralhar os medicamentos.
- Inclui um método auxiliar encontrarMedicamentoPorCodigo para encontrar um medicamento pelo codigo.

### Este exemplo permite que o usuário interaja com o programa através do terminal, adicionando, atualizando, removendo, listando, ordenando, buscando, invertendo e embaralhando medicamentos em uma farmácia.