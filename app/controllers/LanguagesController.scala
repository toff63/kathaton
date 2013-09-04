package controllers

import models.Ideia
import play.api.mvc._

object LanguagesController extends Controller {

  var lista = List(new Ideia(1, "Scala", 25), new Ideia(2, "Clojure", 50))

  def list = Action {
    Ok(views.html.ideia(lista))
  }
}
