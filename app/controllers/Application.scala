package controllers

import models.Hackathon
import play.api.data._
import play.api.data.Forms._
import play.api.mvc.Action
import play.api.mvc.Controller

object Application extends Controller {

  def index = Action {
    Redirect(routes.Application.hackathons)
  }

  def hackathons = Action {
    Ok(views.html.index(Hackathon.all(), hackathonForm))
  }

//  def newHackathon = Action { implicit request =>
//    hackathonForm.bindFromRequest.fold(
//      errors => BadRequest(views.html.index(Hackathon.all(), hackathonForm)),
//      label => {
//        Hackathon.create(label)
//        Redirect(routes.Application.hackathons)
//      })
//  }

  def deleteHackathon(id: Long) = TODO

    val hackathonForm = Form(
        mapping(
            "project" -> nonEmptyText,
            "tech" -> nonEmptyText,
            "date" -> date("dd/MM/yyyy")
        )(Hackathon.apply)(Hackathon.unapply)
    )
}