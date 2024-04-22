# BackEnd-N2-

**Projeto de distãncia entre 2 destinos**

**Objetivo**

O projeto utiliza da api ViaCEP, nesta api é possível pesquisar o cep desejado e trazer dados como uf, bairro, logradouro, entre outros.
Utilizando deste principio, foi criado um modelo para puxar um cep de origem e um de destino, após a busca destes ceps, é gerado um número aleatório do cep de origem e destino, e o resultado irá aparecer para o usuário com a seguinte frase: "A Distância entre o CEP " + OrigemCEP + " e o CEP " + DestinoCEP + " é " + DistanciaCEP + " Km".

**Funcionamento**

ControllerCEP.java:
É um controlador REST que gerencia as requisições relacionadas a consultas de CEP.
No método consultarCEP(), ele instancia um objeto Localizacao, define valores para seus atributos e retorna informações formatadas sobre a localização e a distância entre CEPs.

Localizacao.java:
É uma classe simples que representa informações de localização, como CEP, logradouro, bairro e UF (unidade federativa).
Possui getters e setters para acessar e modificar os atributos.

IntService.java:
É uma interface que define métodos para consultar CEP e calcular distância.
Os métodos consultarCEP(String cep) e calcularDistancia() são declarados aqui.

ServiceCEP.java:
É uma implementação da interface IntService.
No método consultarCEP(String cep), ele monta uma URL de consulta usando o CEP fornecido.
No método calcularDistancia(), ele gera dois CEPs aleatórios, calcula a distância entre eles e retorna uma mensagem com a distância calculada em quilômetros.

