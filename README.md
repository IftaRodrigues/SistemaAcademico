# SistemaAcademico REST
Desenvolvimento Web Services REST em Java utilizando JAX-RS com Hibernate JPA e CDI no NetBeans
## 1. Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
  1. JDK 1.8 
  2. IDE NetBeans 12
  3. Servidor de aplicação GlassFish 5 (a ser mostrado como instalar)
  4. MySQL

##  2. Configurando o Back End (servidor)

 - Faça o clone do projeto
 - Crie um servidor GlassFish 5 no NetBeans
 - Como vamos usar o MySQL como banco de dados, precisaremos do MySQL
   Connector J, driver JBDC do MySQL (que vai ser utilizado internamente
   para acesso ao BD). Baixe do [site
   oficial](https://dev.mysql.com/downloads/connector/j/)
   Após descompactar o driver, o único arquivo que nos interessa é o `mysql-connector-java-X.X.X-bin.jar` (onde X.X.X é a versão do driver). Copie tal arquivo para a pasta `glassfish5/glassfish/domains/domain1/lib` (considerando que glassfish5 é a pasta onde descompactou o GlassFish). As bibliotecas colocadas em tal pasta serão carregadas automaticamente pelo GlassFish.
   -Crie um banco de dados no MySQL e altere o arquivo [persistence.xml](/ServerAcad/src/main/resources/META-INF/persistence.xml), onde estiver **BancoAqui** coloque o nome do banco criado e onde estiver **senhaAqui** coloque a senha do root do MySQL, caso seu usuário não seja root trocar para o correto
   
##  2. Rodando o projeto
Antes de acessar uma URL de um método de um serviço REST implementado, aconselho clicar no botão `Clean and Build` (Limpar e Construir) para apagar quaisquer versões anteriores das classes compiladas e implantar as novas. Agora, podemos clicar no botão `Play` (F6) para executar o projeto.

Ao executar o projeto, uma página como [http://localhost:8080/ServerAcad/](http://localhost:8080/ServerAcad/) aparecerá porém nela não estará de fato a API REST na próxima seção estará os detalhes de como testar a api

## 3. Testando o serviço criado

Pode ser usado o [Hoppscotch](https://hoppscotch.io/) para testar os métodos da API
| **Método** |  **Verbo HTTP** | **Comando**  |
|--|--|--|
| Inserir Aluno | POST | {"nome": "João", "cpf": "99999999999", "dataNascimento": "02/12/2011"} http://localhost:8080/ServerAcad/api/aluno  |
| Buscar Aluno | GET | http://localhost:8080/ServerAcad/api/aluno/1  |
