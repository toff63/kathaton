package controllers


import play.api.mvc._
import models.Gambeiro

object GambeiroController extends Controller {

  var listaGambeiros = List(new Gambeiro(1, "Caopeao"))

  def list = Action {
    Ok(views.html.gambeiro(listaGambeiros))
  }
  
  
}