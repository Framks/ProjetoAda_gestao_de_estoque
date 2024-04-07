# Projeto de Técnicas de Programação: AdaTech

Este projeto tem como objetivo a aplicação de conceitos como lambda, threads e técnicas estudadas no módulo 4 do Santander Bootcamp com AdaTech, na carreira de Desenvolvimento Back-end.

O projeto consiste em ler um arquivo CSV (Comma-separated values), realizar a inserção dos dados no PostgreSQL e possibilitar a leitura desses dados.

----
### 1. INICIALIZAR O CONTAINER DO POSTGRES

Para inicializar o container do PostgreSQL e conferir as configurações, consulte:
[bancoDeDados/README.md](/bancoDeDados/README.md)

----
### 2. INICIAR A APLICAÇÃO SPRING

No seu ambiente de desenvolvimento, inicialize a aplicação Spring. Ao iniciar o programa, será feita a leitura do arquivo e a inserção dos dados no banco de dados. Após isso, basta acessar através do browser ou do Postman ([Página de download do Postman](https://www.postman.com/downloads/)).

----
### 3. UTILIZAÇÃO DA API

Esta é uma API simples criada para o escopo desta atividade, portanto, contém apenas métodos GET. A aplicação pode ser acessada pelos seguintes comandos:

- Pegar todos os dados:
```
localhost:8080/tudo
```

- Buscar a quantidade de produtos cadastrados em cada categoria:
```
localhost:8080/quantidadeDeProdutoPorCategoria
```

- Buscar o valor médio dos produtos para cada categoria:
```
localhost:8080/valorMedioPorCategoria
```

- Buscar o valor médio de todos os produtos:
```
localhost:8080/valorMedioDosProdutos
```

- Buscar a quantidade de categorias existentes no sistema:
```
localhost:8080/quantidadeDeCategoria
```

- Buscar a lista de produtos que estão com a quantidade igual ou abaixo de 3:
```
localhost:8080/quantidadeBaixa
```

----
## Versões:
- Java 21;
- Spring Boot 3.2.4;
- PostgreSQL 3.9;