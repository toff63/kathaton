package models

import java.util.Date

case class Hackathon(project: String, tech: String, date: Date)

object Hackathon {
  
  var hackatons:List[Hackathon] = List(new Hackathon("Gambetta", "Groovy", new Date))
  
  def all(): List[Hackathon] = hackatons
  
  def create(project: String, tech: String, date: Date): Unit = {
    hackatons = hackatons ++ List( new Hackathon(project, tech, date))
  }
  
  def delete(project: String) {}
}