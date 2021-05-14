#language: pt
#enconding: UTF-8
#author: Poliana Abreu
#date: 12/05/2021
#version: 1.0


Funcionalidade: Cadastrar usuário
  Com essa funcionalidade iremos conseguir realizar
  o cadastro de novos usuários.

  Contexto: Acessar a página do cadastro
    Dado estiver na tela do cadastro

  @smoke_test
  Cenário: Validar mensagem de erro ao preencher apenas o primeiro nome
    Quando inserir apenas o primero nome
    Então o sistema exibirá a mensagem "Por favor, insira um nome completo."

  Cenário: Validar mensagem de erro ao preencher e-mail inválido
    Quando inserir um e-mail inválido
    Então devo vizualizar a mensagem "Por favor, insira um e-mail válido."

  Cenário: Validar mensagem de erro ao preencher senha com menos de 8 caracteres
    Quando inserir senha com menos de 8 caracteres
    Então vizualizar a mensagem "A senha deve conter ao menos 8 caracteres."

  @CadastroValido
  Cenário: Validar cadrasto válido na aplicação
    E exibir abaixo do formulário uma tabela com os dados do usuário
    Quando inserir usuário válido o sistema deve exibir opção excluir para cada id
    Então o sistema exibirá os usuários ordenando-os pelo id do menor para o maior

  @regression
  Cenário: Excluir usuário na aplicação
    Quando inserir a opção excluir de um elemento da tabela de usuário
    Então o sistema excluirá a linha em questão sem interferir na ordem dos outros id's