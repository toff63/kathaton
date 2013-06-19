package controllers

import models.Hackathon
import play.api.data.Form
import play.api.data.Forms.nonEmptyText
import play.api.mvc.Action
import play.api.mvc.Controller

object Application extends Controller {

  def index = Action {
    Ok("Hello world")
 //  Redirect(routes.Application.hackathons)
  }

  val hackatonForm = Form("label" -> nonEmptyText)

  def hackathons = Action {
    Ok(views.html.index(Hackathon.all(), hackatonForm))
  }

  def newHackathon = TODO

  def deleteHackathon(id: Long) = TODO

}