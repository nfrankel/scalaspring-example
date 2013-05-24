package ch.frankel.blog.scalaspring

import javax.sql.DataSource
import org.springframework.jdbc.datasource.{DataSourceTransactionManager, SingleConnectionDataSource, DriverManagerDataSource}
import org.springframework.scala.context.function.FunctionalConfiguration

class TestScalaConfiguration extends ScalaConfiguration {

  val dataSource = singleton() {
    val dataSource: DriverManagerDataSource = new SingleConnectionDataSource()
    dataSource.setDriverClassName("org.h2.Driver")
    dataSource.setUsername("SA")
    dataSource.setUrl("jdbc:h2:mem:")
    dataSource
  }
}
