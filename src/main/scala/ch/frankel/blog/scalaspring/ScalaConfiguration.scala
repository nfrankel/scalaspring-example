package ch.frankel.blog.scalaspring

import org.springframework.scala.context.function.FunctionalConfiguration
import javax.sql.DataSource
import org.springframework.scala.jdbc.core.JdbcTemplate
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.jdbc.datasource.DataSourceTransactionManager

trait ScalaConfiguration extends FunctionalConfiguration {

  val dataSource: DataSource

  lazy val transactionManager = singleton("transactionManager") {
    new DataSourceTransactionManager(dataSource)
  }

  bean() {
    new Person("Jo", "Dalton")
  }

  bean() {
    new Person("Jack", "Dalton")
  }

  bean() {
    new Person("William", "Dalton")
  }

  singleton("averell") {
    new Person("Averell", "Dalton")
  }

  lazy val jdbcTemplate = singleton() {
    new JdbcTemplate(dataSource)
  }
}
