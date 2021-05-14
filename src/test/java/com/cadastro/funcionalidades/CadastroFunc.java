package com.cadastro.funcionalidades;

import com.cadastro.common.BaseTest;
import com.cadastro.pages.CadastroPage;

public class CadastroFunc extends BaseTest {

    CadastroPage cadastroPage = new CadastroPage();

    public void telaCadastro() {
        driver.get("http://prova.stefanini-jgr.com.br/teste/qa/");
    }

    //Cenário de cadastro inválido na aplicação.
    public void nomeCompletoInvalido() {
        driver.findElement(cadastroPage.getCampoNome()).sendKeys("Poliana");
        driver.findElement(cadastroPage.getCampoEmail()).sendKeys("poliana@teste.com");
        driver.findElement(cadastroPage.getCampoSenha()).sendKeys("*************");
        driver.findElement(cadastroPage.getBotaoCadastrar()).click();
    }

    public String mensagemDeErro() {
        return driver.findElement(cadastroPage.getMensagemErro()).getText();
    }

    public void cadastroEmailInvalido() {
        driver.findElement(cadastroPage.getCampoNome()).sendKeys("Poliana Abreu");
        driver.findElement(cadastroPage.getCampoEmail()).sendKeys("poliana.teste.com");
        driver.findElement(cadastroPage.getCampoSenha()).sendKeys("***********");
        driver.findElement(cadastroPage.getBotaoCadastrar()).click();
    }

    public String emailInvalido() {
        return driver.findElement(cadastroPage.getMensagemErroEmail()).getText();

    }

    public void cadastroSenhaInvalida() {
        driver.findElement(cadastroPage.getCampoNome()).sendKeys("Poliana Abreu");
        driver.findElement(cadastroPage.getCampoEmail()).sendKeys("poliana@teste.com");
        driver.findElement(cadastroPage.getCampoSenha()).sendKeys("****");
        driver.findElement(cadastroPage.getBotaoCadastrar()).click();
    }

    public String senhaInvalida(){
        return driver.findElement(cadastroPage.getMensagemErroSenha()).getText();
    }

    //Cenário de cadastro válido na aplicação.
    public void cadastroValido(){
        driver.findElement(cadastroPage.getCampoNome()).sendKeys("Poliana Abreu");
        driver.findElement(cadastroPage.getCampoEmail()).sendKeys("poliana@teste.com");
        driver.findElement(cadastroPage.getCampoSenha()).sendKeys("***********");
        driver.findElement(cadastroPage.getBotaoCadastrar()).click();
        driver.findElement(cadastroPage.getCampoNome()).sendKeys("João da Silva");
        driver.findElement(cadastroPage.getCampoEmail()).sendKeys("joaosilva@teste.com");
        driver.findElement(cadastroPage.getCampoSenha()).sendKeys("************");
        driver.findElement(cadastroPage.getBotaoCadastrar()).click();
        driver.quit();
    }

    public void excluirCadastro(){
        driver.findElement(cadastroPage.getCampoNome()).sendKeys("Poliana Abreu");
        driver.findElement(cadastroPage.getCampoEmail()).sendKeys("poliana@teste.com");
        driver.findElement(cadastroPage.getCampoSenha()).sendKeys("***********");
        driver.findElement(cadastroPage.getBotaoCadastrar()).click();
        driver.findElement(cadastroPage.getExcluirId()).click();
        driver.findElement(cadastroPage.getCampoNome()).sendKeys("João da Silva");
        driver.findElement(cadastroPage.getCampoEmail()).sendKeys("joaosilva@teste.com");
        driver.findElement(cadastroPage.getCampoSenha()).sendKeys("************");
        driver.findElement(cadastroPage.getBotaoCadastrar()).click();
        driver.quit();
    }

}
