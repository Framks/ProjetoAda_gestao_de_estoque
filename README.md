# Projeto de Técnicas de programação: AdaTech

Este projeto visa utilizarmos o lambda, threads e técnicas de que estudamos no módulo 4 do Santander bootcamp com Adatech, carreira Desenvolvimento Back-end.

O projeto consiste em ler um arquivo CSV(Comma-separated values) valores separados por virgula, fazer a inserção dos dados no PostgreSQL e permitir a leitura desses dados.

### 1 INICIALIZAR O CONTAINER DO POSTGRES

Para iniciar o container do postgres e olhar a configuração entre em:
[bancoDeDados/README.md](/bancoDeDados/README.md)

## 2 INICIAR A APLICAÇÃO SPRING

Em seu ambiaente de desenvolvimento inicialize a aplicação do spring
ao iniciar o programa fara a leitura do arquivo e fara a inserção de dados no banco de dados.
Apos isso é só utilizar no browser ou POSTMAN ( ![Pagina de download do postman](https://www.postman.com/downloads/))

## 3 UTILIZAÇÃO DA API

esta é uma API simples que para o ambito desta atividade, portanto só tera metodos GET
a aplicação pode ser acessada por meio dos comandos:

Pegar todos os dados: 
```
localhost:8080/tudo
```

Buscar a quantidade de produtos cadastrados em cada categoria:
```
localhost:8080/quantidadeDeProdutoPorCategoria
```

Buscar o valor medio dos produtos para cada categoria:
```
localhost:8080/valorMedioPorCategoria
```

Buscar o valor medio de todos os produtos: 
```
localhost:8080/valorMedioDosProdutos
```

Buscar a quantidade de categorias que existem no sistema:
```
localhost:8080/quantidadeDeCategoria
```

Buscar a lista de produtos que estão com a quantidade igual ou abaixo de 3:
```
localhost:8080/quantidadeBaixa
```

## Versões:
- Java 21;
- Spring Boot 3.2.4;
- PostgreSQL 3.9;