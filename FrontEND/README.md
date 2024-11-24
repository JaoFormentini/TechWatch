# TechWatch

TechWatch é um programa criado para gerenciar e monitorar computadores de uma rede de lojas. Verificando seus nomes, ips, endereço MAC, sistema operacional, quantidade de memoria RAM, data que foi feita instalaçao do sistema, e a data que o programa rodou pela ultima vez. Com essas informaçoes é possivel gerenciar e melhorar como é feito a troca e manutenção desses equipamentos especificos, fazendo assim com que o departamento responsavel por isso consiga executar suas funçoes com maior precisão e velocidade. Este programa é pensado e criado para funcionar na estrutura de uma rede de lojas em especifico, porem pode ser adaptado para qualquer empresa.

As tecnologias utilizadas foram:

- Java

Utilizado para inserir os dados dos computadores no banco de dados (programa feito externamente e inserido manualmente em todos os computadores) Utilizado na API em spring, onde todo BackEnd da API foi feito em java utilizando as tecnologias do Spring. Spring

Utilizado no backend em conjunto com Maven, e suas dependecias, JPA, JDBC, SPRING WEB.

- Maven

Utilizado no Backend em Conjunto com o Spring, e o Java, para a criaçao da API e suas propiedades.

- AWS - EC2

Utilizado para instalaçao e configuraçao de uma maquina virtual onde seria configurado o banco de dados. ( Necessario para ser possivel o acesso externo de todas as lojas e da matriz, sem a mudança constante de IP publico dos provedores, porem pode ser utilizado um banco de dados local, se a configuração de rede for com IP fixo.

- MySQL

Utilizado dentro da VM na EC2 para receber as conexoes e dados dos computadores e da API.

- JDBC

Dependencia do Spring utilizada para configuraçao da API e suas propiedades.

- JPA

Dependencia do Spring utilizada para configuraçao da API e suas propiedades.

- JWT Security

Dependencia do Spring utilizada para fazer a configuração de autenticaçao de usuario e senha com token.

- React

Utilizado para criação do FrontEnd, e estilização da pagina.

- Vite

Utilizado para criação do Frontend e suas configuraçoes.

- JavaScript, Html, Css

Utilizado para aplicar a logica necessaria no FrontEnd. Criaçao e Estilização da pagina FrontEnd, com todas as suas propiedades.

🚀 Pré-requisitos Sistema Operacional: Windows.

- Um gerenciador de arquivos (VS Code, IntelliJ).
- Spring e dependencias (JPA, JDBC, Spring WEB, JWT Security).
- JAVA 8 (minimo).
- Banco de dados(MySQL). 
- Vite instalado.

🎲 Rodando o Front End (servidor)

🖥 Clone ou baixe o repositório.

[https://github.com/JaoFormentini/TechWatch.git](https://github.com/JaoFormentini/TechWatch.git) (Para o FRONTEND)

Apos baixar ou clonar, basta ir em ProjetoJavaPooAPI/FrontEND/ e executar o comando. 

```bash
$ npm install -D vite
```
Apos a instalação, basta executar no mesmo diretorio o comando.

```bash
npm run dev
```
Apartir dai, o FrontEND ja irá funcionar, a API vai startar, e utilizar a porta 5173.


🌟 Funcionalidades

Executa uma API de monitoramento e checagem de computadores em um banco de dados.

Mostra todos os computadores no banco de dados.

Mostra um computador específico utilizando o ID como parametro.

Mostra todos os computadores de uma loja especifica (ex loja05)

Adiciona um computador manualmente no banco de dados.

Deleta um computador manualmente no banco de dados.

Edita um computador manualmente no banco de dados.

Vale lembrar que todas as funçoes exceto "Mostrar" devem ser utilizadas por um usuario "ADMIN".

SEGUE LINK DA DOCUMENTAÇAO NO POSTMAM --> https://documenter.getpostman.com/view/38631377/2sAYBUDY8x
