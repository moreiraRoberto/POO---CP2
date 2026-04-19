FiapDelivery - Sistema de Logística e Transporte

A ideia principal foi refatorar um código feito por um estagiário que estava com vários erros de organização e segurança e refazer tudo do zero, incluindo a inclusão de nomes coerentes para as variaveis

Eu foquei em quatro pontos principais para profissionalizar o código:

Encapsulamento: Antes, qualquer um podia mudar os dados de qualquer jeito. Agora, os atributos são privados. Criei métodos (Getters e Setters) que conferem se a informação faz sentido. Por exemplo, o sistema agora impede que um veículo seja cadastrado com capacidade de carga negativa.

Herança: Para não ter que repetir código em toda classe, criei a classe mãe Veiculo. Ela guarda o que todo transporte tem (placa e capacidade). As classes Moto e Caminhao herdam isso e só cuidam das suas partes específicas, como o número de eixos ou se tem baú.

A classe Rota ficou muito mais inteligente. Antes ela só aceitava caminhão. Agora, ela aceita qualquer tipo de Veiculo que passe na teoria "É um". 

Organização (Clean Code): Usei nomes claros para as variáveis e separei o projeto em pacotes. Assim, qualquer pessoa que abrir o código consegue entender o que cada parte faz sem dificuldade.

Estrutura das Classes

Veiculo: É a base que tem as regras gerais de placa e carga.

Caminhao e Moto: São as variações dos veículos com seus detalhes próprios.

Pacote: Representa a mercadoria, com o código de rastreio e o peso.

Rota: É onde o pacote é vinculado a um veículo para iniciar a entrega.

SistemaPrincipal: É a classe onde o programa roda e onde testamos se as validações estão funcionando.# POO---CP2
