

## Descrição do projeto Spring Boot


Abaixo existe uma breve descrição do roteiro da construção de um simples projeto, no qual se trata de um sistema de controle de despesas e receitas genéricas. 


<html>
<head>

</head>

<body>

<h1><b>Primeira etapa</b></h1>

<h3>Introdução</h3>
<ol>

<li>1.1. Introdução ao curso</li>
<li>1.2. Como usar o suporte</li>
<li>1.3. O que é SOFEA?</li>
<li>1.4. O que é REST?</li>
<li>1.5. Conhecendo o projeto do curso</li>
<li>1.6. Ambiente de desenvolvimento REST</li>
<li>1.7. Testando APIs com Postman</li>
<li>1.8. Introdução ao protocolo HTTP</li>

</ol>


<h3>Fundamentos do REST</h3>
<ol>

<li>2.1. O que é um recurso?</li>
<li>2.3. Modelo de maturidade Richardson - O nível 0</li>
<li>2.4. Modelo de maturidade Richardson - O nível 1</li>
<li>2.5. Modelo de maturidade Richardson - O nível 2</li>
<li>2.6. Modelo de maturidade Richardson - O nível 3</li>
<li>2.7. HATEOAS</li>
<li>2.8. Segurança de APIs REST</li>
<li>2.9. Idempotência</li>

</ol>

<h3>Primeiras consultas e cadastros na API</h3>
<ol>

<li>3.1. Criando o projeto da API</li>
<li>3.2. Conectando ao MySQL</li>
<li>3.3. Migração de dados com Flyway</li>
<li>3.4. Consultando primeiro recurso com GET</li>
<li>3.5. Coleção vazia, o que retornar?</li>
<li>3.6. Cadastrando nova categoria com POST</li>
<li>3.7. Retornar 404 caso não exista a categoria</li>
<li>3.8. Validando atributos desconhecidos</li>
<li>3.9. Tratando erros com ExceptionHandler</li>
<li>3.10.Validando valores inválidos com Bean Validation</li>
<li>3.11.Criando o cadastro de pessoa</li>
<li>3.12. Usando eventos para adicionar header Location</li>
</ol>



<h3>Atualização e remoção de recursos na API</h3>
<ol>

<li>4.1  Removendo pessoa com DELETE</li>
<li>4.2. Sobre atualização de recursos REST</li>
<li>4.3. Atualizando pessoa com PUT</li>
<li>4.4. Implementando atualização parcial com PUT</li>
</ol>


<h3>Relacionamentos entre recursos REST</h3>
<ol>

<li>5.1. Criando a migração e entidade de lançamento</li>
<li>5.2. Lista e busca de lançamentos</li>
<li>5.3. Cadastrando o primeiro lançamento</li>
<li>5.4. Validando inconsistências</li>
<li>5.5. Validando lançamento com Bean Validation</li>
<li>5.6. Regra para não salvar pessoa inativa</li>
<li>5.7. Implementando pesquisa de lançamento com Metamodel</li>
<li>5.8. Removendo lançamentos</li>
<li>5.9. Implementando a paginação de lançamento</li>
</ol>


<h3>Segurança da API</h3>
<ol>

<li>6.1. Implementando autenticação BASIC</li>
<li>6.2. Fluxo básico do OAuth</li>
<li>6.3. Implementando a segurança com OAuth 2</li>
<li>6.4. JSON Web Tokens - JWT</li>
<li>6.5. Configurando JWT no projeto</li>
<li>6.6. Renovando o access token com o refresh token</li>
<li>6.7. Movendo o refresh token para o cookie</li>
<li>6.8. Movendo o refresh token do cookie para a requisição</li>
<li>6.9. O que é CORS?</li>
<li>6.10. Criando filtro para CORS</li>
<li>6.11. Movendo o usuário para o banco de dados</li>
<li>6.12. Adicionando permissões de acesso</li>
<li>6.13. Finalizando permissões de acesso</li>
<li>6.14. Implementando o logout</li>
</ol>




<h3>Deploy da API em produção</h3>
<ol>

<li>7.1. Implementando projeção de lançamento</li>
<li>7.2. Profiles do Spring</li>
<li>7.3. Criando a conta no Heroku</li>
<li>7.4. Deploy da API na nuvem</li>
</ol>

<h3>Introdução ao Angular</h3>
<ol>

<li>8.1. Introdução ao front-end com Angular</li>
<li>8.2. AngularJS vs Angular: a confusão das versões</li>
<li>8.3. Conhecendo e instalando o Visual Studio Code</li>
<li>8.4. Introdução ao HTML</li>
<li>8.5. Introdução ao CSS</li>
<li>8.6. Instalando o Node e NPM</li>
<li>8.7. Instalando e criando um projeto com Angular CLI</li>
<li>8.8. Criando seu primeiro component</li>
</ol>



<h3>Fundamentos do Angular</h3>
<ol>

<li>9.1. Arquitetura do Angular</li>
<li>9.2. Escrevendo templates</li>
<li>9.3. Interpolação e data binding</li>
<li>9.4. Two-way data binding</li>
<li>9.5. Iterando com a diretiva ngFor</li>
<li>9.6. Exibindo dados condicionais com ngIf</li>
<li>9.7. Adicionando estilos CSS em um componente</li>
<li>9.8. Criando o projeto do curso</li>
<li>9.9. Escolhendo uma biblioteca de componentes</li>
<li>9.10. Instalando e testando o PrimeNG</li>
</ol>




<h3>Módulos e página de pesquisa</h3>
<ol>

<li>10.1. Criando o protótipo da página de pesquisa de lançamentos</li>
<li>10.2. Exibindo um diálogo de confirmação</li>
<li>10.3. Entendendo os módulos (ngModule)</li>
<li>10.4. Organizando o projeto em Feature Modules</li>
<li>10.5. Tabela de dados do PrimeNG</li>
<li>10.6. Fazendo paginação de dados</li>
<li>10.7. criando página de pesquisa de pessoa</li>
</ol>


<h3>Componentes, diretivas e pipes</h3>
<ol>

<li>11.1. Criando mais componentes</li>
<li>1.2. Ciclo de vida de componentes e Lifecycle Hooks</li>
<li>11.3. Passando valores com @Input</li>
<li>11.4. Passando eventos com @Output e EventEmitter</li>
<li>11.5. Respondendo as interações dos usuários</li>
<li>11.6. Criando diretivas/li>
<li>11.7. Respondendo a eventos de usuários com @HostListener</li>
<li>11.8. Usando @HostBinding</li>
<li>11.9. Manipulando o Template e DOM com @ViewChild</li>
<li>11.10. Conhecendo e usando pipes nativos</li>
</ol>



<h3>Formulários e página de cadastro</h3>
<ol>

<li>12.1. Criando o protótipo da página de cadastro de lançamentos</li>
<li>12.2. Criando formulários (Template-driven forms)</li>
<li>12.3. Adicionando campos com máscara</li>
<li>12.4. Adicionando campos monetários (decimal)</li>
<li>12.5. Adicionando campos de datas (Date Picker)</li>
<li>12.6. Adicionando caixas de seleção</li>
<li>12.7. Validando formulários</li>
<li>12.8. Criando a página de cadastro de pesso</li>
</ol>



<h3>Serviços, injeção de dependências e HTTP</h3>
<ol>

<li>13.1. Introdução aos serviços</li>
<li>13.2. O que é injeção de dependências?</li>
<li>13.3. Injetando dependências com Angular</li>
<li>13.4. Fazendo chamadas HTTP (GET, POST, PUT e DELETE)</li>
<li>13.5. Tratando erros HTTP</li>
<li>13.6. Implementando os serviços do projeto</li>
<li>13.7. Implementando serviço</li>
</ol>




<h3>Roteamento e navegação</h3>
<ol>

<li>14.1. Introdução a rotas e SPA (Single Page Application)</li>
<li>14.2. Configurando rotas na aplicação</li>
<li>14.3. Navegando com RouterLink</li>
<li>14.4. Recebendo parâmetros da rota</li>
<li>14.5. Fazendo roteamento imperativo</li>
<li>14.6. Criando um módulos de rotas (Routing Module)</li>
<li>14.7. Fazendo redirecionamento</li>
<li>14.8. Tratando rota não encontrada</li>
<li>14.9. Carregamento de módulos por demanda (lazy loading)</li>
<li>14.10. Definindo o título da página dinamicamente</li>
<li>14.11. Implementando roteamento</li>
</ol>


<h3>Segurança do front-end</h3>
<ol>

<li>15.1. Introdução à segurança do front-end</li>
<li>15.2. Criando o protótipo da tela de login</li>
<li>15.3. Implementando o serviço de autenticação com OAuth 2 e JWT</li>
<li>15.4. Recebendo o JWT (JSON Web Token)</li>
<li>15.5. Exibindo o nome do usuário logado</li>
<li>15.6. Implementando o logout</li>
<li>15.7. Exibindo o menu do sistema conforme permissões do usuário</li>
<li>15.8. Protegendo componentes</li>
<li>15.9. Introdução a guarda de rotas</li>
<li>15.10. Protegendo rotas com CanActivate</li>
<li>15.11. Renovando o access token</li>
<li>15.12. Implementando a segurança de pessoas</li>
</ol>





</body>
</html>