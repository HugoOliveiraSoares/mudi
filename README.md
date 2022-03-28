# mudi

## Estrutura do projeto

```
|- pom.xml -> Arquivo onde se declara as dependências do projeto 
 |- mvnw -> Binário do gerenciador de dependências maven 
 |- /src/main -> Diretório onde estão os códigos fontes
 	|- /resources -> Diretório onde estão arquivos de configuração e as paginas html
 	 	|- templates -> Onde estão as paginas html
 		|- aplication.properties -> Configurações da aplicação, como conexão com o banco
 		|- messages.properties -> Altera algumas mensagens padrões
 	|- /java/br/com/alura/mvc/mudi
 		|- controller -> Pacote onde estão as Controllers
 		|- dto -> Pacote onde estão as classes de transferencia (Um padrão de software chamado DTO)
 		|- model -> Pacote onde estão os modelos do sistema
 		|- repository -> Pacote onde estão as interfaces que "controlam" o banco de dados
 	|- test -> Testes automatizados
```

## Como executar

### No terminal:

`./mvnw clean install`

se fez o build corretamente, rode:

`./mvnw spring-boot:run`

### No VsCode:
Abra a classe MudiAplication e clique no botão de _Run_


**E lembre-se de ter um banco de dados mysql rodando**

Com a aplicação rodando acesse http://localhost:8080/home