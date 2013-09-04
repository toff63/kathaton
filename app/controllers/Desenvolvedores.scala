package controllers

import play.api.mvc._
import com.mongodb.casbah.Imports._
import models.Desenvolvedor
import models.Desenvolvedor
import models.Desenvolvedor

object Desenvolvedores extends Controller {

  var desenvolvedores = List(new Desenvolvedor(1, "Chuck Norris", "chuck@hotmail.com", "@oficialchuck"),
      new Desenvolvedor(2, "Rambo", "rambo1972@yahoo.com", "@ramboisback"));
  
  def list = Action {
  	Ok(views.html.Desenvolvedor.list(desenvolvedores))
  }
  
  def delete(id:Integer) = Action {
    desenvolvedores = desenvolvedores.filterNot(id == _.id);
    Ok(views.html.Desenvolvedor.list(desenvolvedores))
  }
  
  def createForm() = Action {
    Ok(views.html.Desenvolvedor.create())
  }
  
  def create(desenvolvedor: Desenvolvedor) = Action {
    desenvolvedores:+desenvolvedor
    Ok(views.html.Desenvolvedor.list(desenvolvedores))
  }
  
  def desenvolvedor(id:Integer) = Action {
    var desenvolvedor = desenvolvedores.filter(id == _.id)
    if (desenvolvedor != null) Ok(views.html.Desenvolvedor.update(desenvolvedor))
    else NotFound("User not found")
  }
  
}