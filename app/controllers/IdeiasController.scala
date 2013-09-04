package controllers

import play.api.mvc._
import models.Ideia
import com.mongodb.casbah.Imports._

object IdeiasController extends Controller {

  var listaString = List(new Ideia(1, "Bot para Gtalk", 20), new Ideia(2, "BatWar", 25), new Ideia(3, "Sistema de Apostas", 30), new Ideia(4, "Wiki interna", 10))

  def list = Action {
  val mongoConn = MongoConnection()
    Ok(views.html.ideia(listaString))
  }
  
  def vote(id:Long) = Action{
    listaString.filter(id == _.id).map(_.rank +=10);
    Ok(views.html.ideia(listaString))
  }
  
}