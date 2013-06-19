package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok("Hello world")
 //  Redirect(routes.Application.hackathons)
  }
  
  def hackathons = TODO
  
  def newHackathon = TODO
  
  def deleteHackathon(id: Long) = TODO
  
}