package model

import java.util.Date

case class Kathaton(id: String, name: String, date: Date)

object  Kathaton {
  
   def all(): List[Kathaton] = Nil
  
  def create(label: String) {}
  
  def delete(id: Long) {}

}