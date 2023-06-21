# CRUD-Worker
A API de Worker é uma aplicação desenvolvida em Spring Boot que oferece operações CRUD (Create, Read, Update, Delete) para gerenciar informações de trabalhadores.

Recursos Disponíveis
A API de Worker disponibiliza os seguintes recursos:

GET /Worker: Recupera todos os trabalhadores cadastrados.
GET /Worker/{id}: Recupera um trabalhador específico com base no ID.
POST /Worker: Cadastra um novo trabalhador.
PUT /Worker/{id}: Atualiza as informações de um trabalhador existente.
DELETE /Worker/{id}: Exclui um trabalhador do sistema.

**Formato de Dados**
A API utiliza o formato JSON para envio e recebimento de dados. As solicitações e respostas devem estar no formato JSON.

**Executando a API**

Para executar a API de Trabalhadores, siga as etapas abaixo:

Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.
Faça o download do código-fonte do projeto ou clone-o através do comando "git clone https://github.com/Hugo-Nobr/CRUD-Worker".
Navegue até o diretório raiz do projeto.
Execute o comando ./mvnw spring-boot:run para iniciar a aplicação.
A API estará disponível em http://localhost:8080.
Endpoints
A seguir, estão os endpoints disponíveis para interagir com a API:

**Recuperar todos os trabalhadores**
URL: GET http://localhost:8080/trabalhadores

**Resposta de Exemplo:**

[
  {
    "id": 1,
    "nome": "João Silva",
    "idade": 30,
    "cargo": "Engenheiro"
  },
  {
    "id": 2,
    "nome": "Maria Souza",
    "idade": 25,
    "cargo": "Analista"
  },
  ...
]

**Recuperar um trabalhador específico**

URL: GET http://localhost:8080/trabalhadores/{id}

{
  "id": 1,
  "nome": "João Silva",
  "idade": 30,
  "cargo": "Engenheiro"
}

**Cadastrar um novo trabalhador**
URL: POST http://localhost:8080/trabalhadores

{
  "nome": "Pedro Santos",
  "idade": 28,
  "cargo": "Programador"
}

**Atualizar um trabalhador**
URL: PUT http://localhost:8080/trabalhadores

{
  "nome": "Pedro Santos",
  "idade": 28,
  "cargo": "Programador"
}

**Excluir um trabalhador**
URL: DELETE http://localhost:8080/trabalhadores/{id}

**Contribuição**
Se você deseja contribuir para o desenvolvimento da API de Trabalhadores, fique à vontade para fazer um fork do repositório, implementar melhorias e enviar um pull request
