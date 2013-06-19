package controllers

import play.api.mvc._
import models.Ideia

object IdeiasController extends Controller {

  var listaString = List(new Ideia(1, "Bot para Gtalk", 90), new Ideia(1, "BatWar", 75), new Ideia(1, "Sistema de Apostas", 30), new Ideia(1, "Wiki interna", 10))

  def list = Action {
    Ok(views.html.ideia(listaString))
  }

}