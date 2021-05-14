package com.cadastro.steps;

import com.cadastro.funcionalidades.CadastroFunc;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class CadastroStep {

    CadastroFunc cadastroFunc = new CadastroFunc();

    @Dado("estiver na tela do cadastro")
    public void telaCadastro() {
        cadastroFunc.telaCadastro();
    }

    @Quando("inserir apenas o primero nome")
    public void inserirPrimeiroNome() {
        cadastroFunc.nomeCompletoInvalido();

    }

    @Então("o sistema exibirá a mensagem {string}")
    public void exibirMensagem(String mensagem) {
        Assert.assertEquals(mensagem, cadastroFunc.mensagemDeErro());
    }

    @Quando("inserir um e-mail inválido")
    public void emailInvalido() {
        cadastroFunc.cadastroEmailInvalido();
    }

    @Então("devo vizualizar a mensagem {string}")
    public void vizualizarMensagem(String mensagemEmail) {
        Assert.assertEquals(mensagemEmail, cadastroFunc.emailInvalido());

    }

    @Quando("inserir senha com menos de 8 caracteres")
    public void senhaInvalida() {
        cadastroFunc.cadastroSenhaInvalida();
    }

    @Então("vizualizar a mensagem {string}")
    public void inserirSenhaInvalida(String mensagemSenha) {
        Assert.assertEquals(mensagemSenha, cadastroFunc.senhaInvalida());
    }

    @Dado("exibir abaixo do formulário uma tabela com os dados do usuário")
    public void formularioTabelaDadosUsuario() {

    }

    @Quando("inserir usuário válido o sistema deve exibir opção excluir para cada id")
    public void usuarioValido() {
        cadastroFunc.cadastroValido();
    }

    @Quando("o sistema exibirá os usuários ordenando-os pelo id do menor para o maior")
    public void exibirUsuario() {

    }

    @Quando("inserir a opção excluir de um elemento da tabela de usuário")
    public void excluirElemento() {
        cadastroFunc.excluirCadastro();

    }

    @Então("o sistema excluirá a linha em questão sem interferir na ordem dos outros id's")
    public void excluirLinha() {

    }

}
