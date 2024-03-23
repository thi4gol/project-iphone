# Projeto Iphone Menu

Este projeto Java 17 implementa um menu simulando as funcionalidades de um dispositivo Iphone, permitindo ao usuário interagir com opções como reprodutor musical, aparelho telefônico e navegador na internet.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- **src**: Contém as classes Java do projeto.
  - `App.java`: Classe principal que inicia a aplicação.
  - `Menu.java`: Classe responsável por exibir o menu e chamar os métodos correspondentes às opções selecionadas.

## Classes Principais

### `App`

A classe `App` é a classe principal do projeto. Ela contém o método `main` que inicia a aplicação criando uma instância da classe `Menu` e chamando o método `loopPrincipal()`.

### `Menu`

A classe `Menu` é responsável por exibir o menu de opções do Iphone e chamar os métodos correspondentes às opções selecionadas pelo usuário. Ela possui os seguintes métodos:

- `loopPrincipal()`: Método que implementa o loop principal do menu, exibindo o menu, lendo a opção do usuário e chamando os métodos correspondentes.
- `mostrarMenu()`: Método que exibe o menu de opções na tela.
- `musical()`: Método que simula as funcionalidades do reprodutor musical do Iphone.
- `telefonico()`: Método que simula as funcionalidades do aparelho telefônico do Iphone.
- `navegarNaInternet()`: Método que simula as funcionalidades do navegador na internet do Iphone.
- `limpa()`: Método que limpa o console.
- `voltarMenu()`: Método que aguarda o usuário pressionar Enter para voltar ao menu principal.

## Executando o Projeto

Para executar o projeto:

1. Certifique-se de ter o Java 17 instalado.
2. Compile os arquivos do projeto.
3. Execute o arquivo `App.class`.

## Uso

Ao iniciar o programa, você será apresentado com um menu contendo diversas opções para simular as funcionalidades do Iphone. Escolha uma opção digitando o número correspondente e siga as instruções exibidas na tela.

## Contribuindo

Se desejar contribuir com este projeto, siga estas etapas:

1. Faça um fork do projeto.
2. Implemente suas alterações.
3. Envie um pull request.

## Autor

Este projeto foi desenvolvido por Thiago Siqueira.

## Licença

Este projeto está licenciado sob a [Licença MIT](https://opensource.org/licenses/MIT).
