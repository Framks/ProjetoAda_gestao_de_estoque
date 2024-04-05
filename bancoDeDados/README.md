# Banco de dados

aqui ficara todos os arquivos correspondentes do banco de dados inclusive o container do postgresql que sera o banco de dados utilizado no projeto.

## 1 docker-composer.yml:
```
Configuração: 
  banco de dados: postgresql
  username: postgres
  password: 1234
  database_name: estoque
```
para suber o postegres execute o seguinte comando dentro da pasta onde esta o docker-composer.yml
```bash
docker-compose up
```
ou 
```bash
 docker-compose -f docker-composer.yml up
 ```

## 2 Arquivo.csv
````
Aqui esta os dados que seram lidos no momento que iniciar a aplicação.
````
## 3 01-init.sql
````
Aqui esta a estrutura da tabela produto que sera executada no momento que iniciar o docker
````