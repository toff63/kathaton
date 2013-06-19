package models

import java.util.Date

case class Hackathon(project: String, tech: String, date: Date)

object Hackathon {
  def all(): List[Hackathon] = Nil
  def create(project: String, tech: String, date: Date) {}
  def delete(project: String) {}
}