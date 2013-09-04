package controllers

import play.api.mvc._
import models.Ideia
import com.mongodb.casbah.Imports._
import com.mongodb.casbah.MongoURI

object IdeiasController extends Controller {

  var listaString = List(new Ideia(1, "Bot para Gtalk", 20), new Ideia(2, "BatWar", 25), new Ideia(3, "Sistema de Apostas", 30), new Ideia(4, "Wiki interna", 10), new Ideia(5, "Cozinha Mais", 60))

  def list = Action {
    val mongoConn = MongoConnection(MongoURI("mongodb://kathaton:gambetinha@dharma.mongohq.com:10077/kathaton"))
    val mongoColl = mongoConn("kathaton")("ideias")

  	mongoColl.find()
  	mongoColl.find().foreach { x =>
  	    listaString=listaString:::List(new Ideia(1, "%s".format(x("name")),1))
  		println("Found a user! %s".format(x("name")))
  	}
    Ok(views.html.ideia(listaString))
  }
  
  def vote(id:Long) = Action{
    listaString.filter(id == _.id).map(_.rank +=10);
    Ok(views.html.ideia(listaString))
  }
  
}