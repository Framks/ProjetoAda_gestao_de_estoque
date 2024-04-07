# Banco de Dados

Aqui ficarão todos os arquivos correspondentes ao banco de dados, incluindo o container do PostgreSQL que será utilizado no projeto. Para este projeto, é necessário ter o Docker instalado em seu computador ([página de download](https://www.docker.com/get-started/)).

## 1. docker-compose.yml:

```
Configuração:
  - banco de dados: PostgreSQL
  - username: postgres
  - password: 1234
  - nome_do_banco_de_dados: estoque
```

Para iniciar o PostgreSQL, execute o seguinte comando dentro da pasta onde está o docker-compose.yml:

```bash
docker-compose up
```

## 2. arquivo.csv

Aqui estão os dados que serão lidos no momento da inicialização da aplicação.

## 3. 01-init.sql

Aqui está a estrutura da tabela produto que será executada automaticamente quando iniciar o Docker. Este arquivo será lido automaticamente pelo Docker.