package models

import java.util.Date

case class Hackathon(project: String, tech: String, date: Date)

object Hackathon {
  
  var hackatons:List[Hackathon] = List(new Hackathon("Gambetta", "Groovy", new Date))
  
  def all(): List[Hackathon] = Nil
  
  def create(project: String, tech: String, date: Date) {
    hackatons :+ new Hackathon(project, tech, new Date)
  }
  
  def delete(project: String) {}
}