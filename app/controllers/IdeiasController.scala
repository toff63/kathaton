package controllers

import play.api.mvc._
import models.Ideia

object IdeiasController extends Controller {

  var listaString = List(new Ideia(1, "bla", 25), new Ideia(1, "ble", 100), new Ideia(1, "bli", 5), new Ideia(1, "blo", 50))

  def list = Action {
    Ok(views.html.ideia(listaString))
  }

}