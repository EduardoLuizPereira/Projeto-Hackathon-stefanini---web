package stepsDefinitions;

import static utils.Utils.acessarSistema;
import static utils.Utils.capturarTela;
import static utils.Utils.driver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before()
	public void funcionalidadeLogin() {
		acessarSistema();
	}

//	@After()
//	public void tearDown(Scenario Scenario) {
	//	capturarTela(Scenario);
	//}	
	@After()
		public void quit() throws InterruptedException {
		Thread.sleep(10000);
		  driver.quit();
	}
}