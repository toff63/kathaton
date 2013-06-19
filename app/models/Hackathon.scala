package models

import java.util.Date

case class Hackathon(id: Long, project: String, date: Date)

object Hackathon {
  var hackatons:List[Hackathon] = List(new Hackathon(1,"Blastoise", new Date))
  
  def all(): List[Hackathon] = hackatons
  def create(name: String) { 
    hackatons :+ new Hackathon(hackatons.size, name, new Date)
    }
  def delete(id: Long) {}
}