package stepdefs

import io.cucumber.scala.{EN, PendingException, ScalaDsl}

class Login1 extends ScalaDsl with EN {
  Given("""^the user is on the login page$""") { () => // ^ = $ - matches exactly to what is written here
    // Write code here that turns the phrase above into concrete actions

    throw new PendingException()
  }

  When("""the user enters valid user name and password""") { () =>

  }

  And("""the user clicks the login button""") { () =>

  }

  Then("""the user should be logged in successfully""") { () =>

  }
}

