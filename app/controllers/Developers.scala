package controllers

import play.api.mvc._
import com.mongodb.casbah.Imports._
import models.Developer

object Developers extends Controller {

  var developers = List(new Developer(1, "Chuck Norris", "chuck@hotmail.com", "@oficialchuck"),
      new Developer(2, "Rambo", "rambo1972@yahoo.com", "@ramboisback"),
      new Developer(3, "Matheus", "mattboschetti@gmail.com", "@mattboschetti"));
  
  def list = Action {
  	Ok(views.html.Developer.list(developers))
  }
  
  def delete(id:Integer) = Action {
    developers = developers.filterNot(id == _.id);
    Ok(views.html.Developer.list(developers))
  }
  
  def createForm() = Action {
    Ok(views.html.Developer.create())
  }
  
  def create(desenvolvedor: Developer) = Action {
    developers:+desenvolvedor
    Ok(views.html.Developer.list(developers))
  }
  
  def get(id:Integer) = Action {
    var developer = developers.filter(id == _.id)
    if (developer != null) Ok(views.html.Developer.update(developer))
    else NotFound("User not found")
  }
  
}