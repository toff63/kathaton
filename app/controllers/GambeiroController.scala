package controllers


import play.api.mvc._
import models.Gambeiro

object GambeiroController extends Controller {

  var listaGambeiros = List(new Gambeiro(1, "Caopeao"), new Gambeiro(1, "Borges"), new Gambeiro(1, "Joel Santana"), new Gambeiro(1, "Bob Miner"))

  def list = Action {
    Ok(views.html.gambeiro(listaGambeiros))
  }
  
  
}