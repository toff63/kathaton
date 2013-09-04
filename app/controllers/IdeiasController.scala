package controllers

import play.api.mvc._
import models.Ideia
import com.mongodb.casbah.Imports._
import com.mongodb.casbah.MongoURI

object IdeiasController extends Controller {

  var listaString = List[Ideia]()

  def list = Action {
    val mongoConn = MongoConnection(MongoURI("mongodb://kathaton:gambetinha@dharma.mongohq.com:10077/kathaton"))
    val mongoColl = mongoConn("kathaton")("ideias")

  	mongoColl.find()
  	mongoColl.find().foreach { x =>
        listaString=listaString:::List(new Ideia("%s".format(x("_id")), "%s".format(x("name")),0,0))
  		println("Found a user! %s".format(x("name")))
  	}
    Ok(views.html.ideia(listaString))
  }
  
  def vote(id:String) = Action{
    // soma voto
    listaString.filter(_.id==id).map(m => m.totalVotos += 1 )

    // calcula percentual de cada ideia
    val somaVotos = listaString.map(_.rank).foldLeft(0)(_+_)

    if(somaVotos>0)
      listaString.map(m => m.rank = m.totalVotos * 100 / somaVotos)

    Ok(views.html.ideia(listaString))
  }
  
}