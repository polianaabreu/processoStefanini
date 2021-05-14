package com.cadastro.pages;

import org.openqa.selenium.By;

public class CadastroPage {

    By campoNome = By.id("name");
    By campoEmail = By.id("email");
    By campoSenha = By.id("password");
    By botaoCadastrar = By.id("register");
    By mensagemErro = By.xpath("//p[@class='error' and preceding-sibling::input[@type = 'text']]");
    By mensagemErroEmail = By.xpath("//p[@class = 'error' and preceding-sibling::input[@type = 'email']]");
    By mensagemErroSenha = By.xpath("//p[@class = 'error' and preceding-sibling::input[@type = 'password']]");
    By excluirId = By.id("removeUser1");

    public By getCampoNome() {
        return campoNome;
    }

    public By getCampoEmail() {
        return campoEmail;
    }

    public By getCampoSenha() {
        return campoSenha;
    }

    public By getBotaoCadastrar() {
        return botaoCadastrar;
    }

    public By getMensagemErro() {
        return mensagemErro;
    }

    public By getMensagemErroEmail() {
        return mensagemErroEmail;
    }

    public By getMensagemErroSenha() {
        return mensagemErroSenha;
    }

    public By getExcluirId() {
        return excluirId;
    }
}
