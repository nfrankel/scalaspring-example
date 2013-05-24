package ch.frankel.blog.scalaspring

import org.testng.annotations.{Test, BeforeMethod}
import org.springframework.test.context.ContextConfiguration
import org.springframework.scala.test.context.{FunctionalConfigurations, FunctionalConfigContextLoader}
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests
import javax.inject.{Qualifier, Named, Inject}
import javax.annotation.Resource
import org.springframework.beans.factory.annotation.Autowired

@ContextConfiguration(loader = classOf[FunctionalConfigContextLoader])
@FunctionalConfigurations(classOf[TestScalaConfiguration])
class SpringScalaTest extends AbstractTestNGSpringContextTests {

  @Autowired
  var averell: Person = _

  @BeforeMethod
  def setup = {}

  @Test
  def testAlso = {

    println("kj")
  }
}
