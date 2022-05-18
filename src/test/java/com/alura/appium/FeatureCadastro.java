package com.alura.appium;

import static org.junit.Assert.assertTrue;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;

/**
 * Unit test for simple App.
 */
public class FeatureCadastro
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void nao_consigo_cadastrar_usuario_com_senha_que_nao_confere() throws MalformedURLException {
        AppiumDriverConfig driver = new AppiumDriverConfig();

        MobileElement botaoCadastro = (MobileElement)driver.driver.findElementById("br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario");
        botaoCadastro.click();

        MobileElement campoNome = (MobileElement)driver.driver.findElementById("br.com.alura.aluraesporte:id/input_nome");
        MobileElement campoSenha = (MobileElement)driver.driver.findElementById("br.com.alura.aluraesporte:id/input_senha");
        MobileElement campoConfirmarSenha = (MobileElement)driver.driver.findElementById("br.com.alura.aluraesporte:id/input_confirmar_senha");

        campoNome.setValue("Bugan");
        campoSenha.setValue("123");
        campoConfirmarSenha.setValue("1235");

        MobileElement botaoConfirmarCadastro = (MobileElement)driver.driver.findElementById("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar");
        botaoConfirmarCadastro.click();

        MobileElement erro = (MobileElement)driver.driver.findElementById("br.com.alura.aluraesporte:id/erro_cadastro");
        Assert.assertEquals("Senhas não conferem",erro.getText());

        assertTrue( true );
    }
}
