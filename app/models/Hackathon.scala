package models

import java.util.Date

case class Hackathon(id: Long, project: String, date: Date)

object Hackathon {
  def all(): List[Hackathon] = Nil
  def create(name: String) {}
  def delete(id: Long) {}
}