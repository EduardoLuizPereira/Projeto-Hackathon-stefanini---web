package pageObjects;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginEComprasPage {
	Actions acao = new Actions(driver);
	
	@FindBy(css = "a[class='login']")
	private WebElement CampoEntrar;

	public void clicandoCampoBotaoEntrar() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(CampoEntrar));
		CampoEntrar.click();

	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement campoEmail;

	public void informandoCampoEmail(String email) {
		campoEmail.sendKeys(email);
	}

	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement campoSenha;

	public void informandoCampoSenha(String senha) {
		campoSenha.sendKeys(senha);
	}

	@FindBy(xpath = "(//button[@id='SubmitLogin'])")
	private WebElement clicarBotaoLogin;

	public void clicandoBotaoLogin() {
		clicarBotaoLogin.click();

	}

	@FindBy(xpath = "//div//h1[contains(.,'My account')]")
	private WebElement campoMyAccount;

	public void campoLoginSucesso() {
		assertTrue(campoMyAccount.isDisplayed());

	}

	@FindBy(xpath = "(//li[@class='lnk_wishlist'])")
	private WebElement clicarBotaoDesejo;

	public void clicandoBotaoDesejo() {
		clicarBotaoDesejo.click();

	}

	@FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[1]")
	private WebElement clicarBotaoChiffon;

	public void clicarBotaoVestidoChiffon() {
		clicarBotaoChiffon.click();

	}

	@FindBy(xpath = "(//a[@id='wishlist_button'])[1]")
	private WebElement clicarBotaoListaDesejos;

	public void clicarBotaoAddListaDesejos() {
		clicarBotaoListaDesejos.click();

	}

	@FindBy(xpath = "(//a[@title='Close'])[1]")
	private WebElement clicarBotaoFechar;

	public void clicarcampofechar() {
		clicarBotaoFechar.click();

	}

	@FindBy(xpath = "(//p[@id='add_to_cart'])[1]")
	private WebElement clicarBotaoAddCarrinho;

	public void clicarcampoAddCarrinho() {
		clicarBotaoAddCarrinho.click();

	}

	@FindBy(xpath = "(//a[@class='btn btn-default button button-medium'])[1]")
	private WebElement clicarBotaoContinuar;

	public void clicandoBotaoContinuar() {
		clicarBotaoContinuar.click();
	}

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement clicarBotaoCheckOut;

	public void clicarBotaoFazerCheckOut() {
		clicarBotaoCheckOut.click();
	}

	@FindBy(xpath = "(//button[@name='processAddress'])[1]")
	private WebElement clicarBotaoEnderecoCobranca;

	public void clicarBotaoCobranca() {
		clicarBotaoEnderecoCobranca.click();

	}

	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	private WebElement clicarBotaoConfirmar;
	
	public void clicarBotaoConfirmarEndereco() {
		clicarBotaoConfirmar.click();

	}

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement clicarBotaoTermosCondicoes;

	public void clicarBotaoTermosECondicao() {
		clicarBotaoTermosCondicoes.click();
		

	}

	@FindBy(xpath = "//a[@title='Close']")
	private WebElement clicarBotaoFecharTermos;
	
	@FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_cms=3&controller=cms&content_only=1']")
	private WebElement clicarBotaoLerTermos;

	public void clicarBotaoLerTermosECondicao() {
		clicarBotaoLerTermos.click();
		clicarBotaoFecharTermos.click();

	}

	@FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement clicarBotaoAvancar;

	public void clicarBotaoBotaoAvanco() {
		clicarBotaoAvancar.click();

	}

	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	private WebElement efetuarPagamento;

	public void botaoPagamento() {
		efetuarPagamento.click();

	}
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement clicarFinalizarCompra;

	public void compraFinalizada() {
		clicarFinalizarCompra.click();

	}
	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement clicarVoltarAosPedidos;

	public void voltandoAosPedidos() {
		clicarVoltarAosPedidos.click();

	}
	@FindBy(xpath = "//a[@title='Return to Home']")
	private WebElement clicarHome;

	public void botaoHome() {
		clicarHome.click();

	}
	@FindBy(xpath = "(//a[contains(.,'Add to cart')])[1]")
	private WebElement botaoAddPrimeiraRoupaCarrinho;

	@FindBy(xpath = "(//div//h5[@itemprop='name'])[1]")
	private WebElement primeiraRoupa;

	@FindBy(xpath = "(//a[contains(.,'Add to cart')])[2]")
	private WebElement botaoAddSegundaRoupaCarrinho;

	@FindBy(xpath = "(//div//h5[@itemprop='name'])[2]")
	private WebElement segundaRoupa;
	
    @FindBy(xpath = "//span[@title='Continue shopping']")
	private WebElement campoContinuarCompra;

	public void AddCarrinho() {
		    
			acao.moveToElement(primeiraRoupa).build().perform();
			new WebDriverWait(driver, 7).until(ExpectedConditions.visibilityOf(primeiraRoupa));
			botaoAddPrimeiraRoupaCarrinho.click();
			campoContinuarCompra.click();
			acao.moveToElement(segundaRoupa).build().perform();
			new WebDriverWait(driver, 7).until(ExpectedConditions.visibilityOf(segundaRoupa));
			botaoAddSegundaRoupaCarrinho.click();
			campoContinuarCompra.click();

	}
	@FindBy(xpath = "(//a[@title='Delete'])[1]")
	private WebElement campoRemover;

    @FindBy(xpath = "//a//b[contains(.,'Cart')]")
	private WebElement campoCarrinho;
    
	public void removerRoupaCarrinho() {
		campoCarrinho.click();
		campoRemover.click();
	}

    @FindBy(xpath = "//span[@id='summary_products_quantity']")
    private WebElement campoQuantidadeCarrinho;
    
    public void quantidadeRoupas() {
		
		assertTrue(campoQuantidadeCarrinho.isDisplayed());
	}
	
	@FindBy(xpath = "//input[@name='search_query']")
	private WebElement clicarCampoBusca;

	public void campoBusca(String string) {
		clicarCampoBusca.sendKeys(string);
				
	}

	@FindBy(xpath = "(//strong[contains(.,'Printed Summer Dress')])[1]")
	private WebElement primeiroElementoEncontrado;

	@FindBy(xpath = "(//strong[contains(.,'Printed Summer Dress')])[2]")
	private WebElement segundoElementoEncontrado;

	@FindBy(xpath = "//li[contains(.,'Summer Dresses > Printed Chiffon Dress')]")
	private WebElement terceiroElementoEncontrado;

	public void campoBuascaApresentaQuantidadeProduto() {
		assertTrue(primeiroElementoEncontrado.isDisplayed());
		assertTrue(segundoElementoEncontrado.isDisplayed());
		assertTrue(terceiroElementoEncontrado.isDisplayed());

	}
}
