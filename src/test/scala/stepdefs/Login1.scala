package stepdefs

import io.cucumber.scala.{EN, PendingException, ScalaDsl}
import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

import java.time.Duration

class Login1 extends ScalaDsl with EN {

  val driver: WebDriver = new ChromeDriver()

  Given("""^the user is on the login page$""") { () => // ^ = $ - matches exactly to what is written here
    // Write code here that turns the phrase above into concrete actions
    driver.get("https://parabank.parasoft.com/parabank/index.htm")

  }

  When("""the user enters valid user name and password""") { () =>
    val username = driver.findElement(By.name("username"))
    username.sendKeys("john")

    val password = driver.findElement(By.name("password"))
    password.sendKeys("demo")
  }

  And("""the user clicks the login button""") { () =>

    val loginButton = driver.findElement(By.cssSelector("input[type='submit']"))
    loginButton.click()
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))
  }

  Then("""the user should be logged in successfully""") { () =>
    val successfulLogin = driver.findElement(By.tagName("h1")).getText
    val expectedHeader = "Accounts Overview"
    if (successfulLogin == expectedHeader) {
      println("Login successful")
    }
  }

}

