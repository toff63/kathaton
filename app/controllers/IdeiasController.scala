package controllers

import play.api.mvc._
import models.Ideia

object IdeiasController extends Controller {

  var listaString = List(new Ideia(1, "bla", 5))

  def list = Action {
    Ok(views.html.ideia(listaString))
  }

  def hello(name: String) = Action {
    Ok("Hello " + listaString)
  }

}