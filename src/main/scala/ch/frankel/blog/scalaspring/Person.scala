package ch.frankel.blog.scalaspring

import java.util.Date

class Person(firstName: String, lastName: String, birthdate: Date) {

  def this(firstName: String, lastName: String) = this(firstName, lastName, null)
}
