![spring](https://user-images.githubusercontent.com/45456833/156405610-f62de0be-f0ff-48c1-a1b5-54a2123a2686.svg)![thymeleaf](https://user-images.githubusercontent.com/45456833/156405650-90e3270b-8126-4a31-857e-927d0fa20645.svg)![bootstrap](https://user-images.githubusercontent.com/45456833/156405685-a9f7948a-4f7c-48ab-9d34-3453ad50e1db.svg)
# JavaSpringThymeleaf
 Uso simple do Thymeleaf com o Spring. Esse projeto irá mostrar uma lista de Clientes em sua pagina HTML e estilizado com o framework Bootstrap.
## Criando o arquivo no spring initializr.
![SpringDependencias](https://user-images.githubusercontent.com/45456833/156401407-2d28c221-c407-47b8-89f6-6fb09a1c938e.png)
 Depois de adicionar as dependências precisa gerar o arquivo para download. Após isso é só extrair e abrir com sua IDE favorita.
 ### Conhecendo as dependências.
 #### SpringWeb.
  Usado para criar aplicativos web, incluindo RESTful, usando Spring MVC. Usa o Apache Tomcat como o contêiner incorporado padrão.
 #### Thymeleaf.
 O Thymeleaf é uma template engine para projetos Java que facilita a criação de páginas HTML. Sendo assim, ele serve para gerar páginas HTML no lado servidor de forma dinâmica, permitindo a troca de informações entre o código Java e as página HTML, de tal maneira ele garante que o desenvolvedor consiga criar templates de forma mais fácil para suas aplicações. (https://www.treinaweb.com.br/blog/o-que-e-o-thymeleaf)
 ## Criando a Classe Controller.
 A camada de controle é responsável por intermediar as requisições enviadas pelo View com as respostas fornecidas pelo Model, processando os dados que o usuário informou e repassando para outras camadas. 
 Essa Classe será aonde irá os caminhos para as suas paginas web.
 ![SpringController](https://user-images.githubusercontent.com/45456833/156403366-0355fa8c-f0af-4880-ae01-e5fabd5d4e9d.png)
 ## Criando a Classe Cliente.
 ![SpringCliente](https://user-images.githubusercontent.com/45456833/156404625-84851af8-66e6-489e-8b37-a4edb05e91a0.png)
  Na classe Cliente iremos colocar as informações que a pessoa(Cliente) irá ter.
 ## Criando a Pagiana HTML
 ![SpringHTML](https://user-images.githubusercontent.com/45456833/156404699-2729c144-897c-465e-a4ed-b85aa7dbfe4f.png)
  Na pagina html implementamos em suas primeiras linhas os recursos do Bootstrap e do Thymeleaf. Dentro da pagina colocamos uma table com os reursos do thymeleaf, em que os dados irá vim do controller.
