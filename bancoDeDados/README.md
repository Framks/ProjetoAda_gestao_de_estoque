# Banco de dados

aqui ficara todos os arquivos correspondentes do banco de dados inclusive o container do postgresql que sera o banco de dados utilizado no projeto.
Para esse projeto é necesário ter instalado no seu computardor o docker (![pagina de download](https://www.docker.com/get-started/)).

## 1 docker-compose.yml:
```
Configuração: 
  banco de dados: postgresql
  username: postgres
  password: 1234
  database_name: estoque
```
para subir o postegres execute o seguinte comando dentro da pasta onde esta o docker-compose.yml
```bash
docker-compose up
```
## 2 Arquivo.csv

Aqui esta os dados que seram lidos no momento que iniciar a aplicação.

## 3 01-init.sql

Aqui esta a estrutura da tabela produto que sera executada no momento que iniciar o docker ele sera lido automaticamente pelo docker