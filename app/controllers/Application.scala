package controllers

import models.Hackathon
import play.api.data.Form
import play.api.data.Forms.nonEmptyText
import play.api.mvc.Action
import play.api.mvc.Controller

object Application extends Controller {

  def index = Action {
    Redirect(routes.Application.hackathons)
  }

  val hackatonForm = Form("Hackaton:" -> nonEmptyText)

  def hackathons = Action {
    Ok(views.html.index(Hackathon.all(), hackatonForm))
  }

  def newHackathon = Action { implicit request =>
    hackatonForm.bindFromRequest.fold(
      errors => BadRequest(views.html.index(Hackathon.all(), errors)),
      label => {
        Hackathon.create(label)
        Redirect(routes.Application.hackathons)
      })
  }

  def deleteHackathon(id: Long) = TODO

}