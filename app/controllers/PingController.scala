package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{Action, Controller}

@Singleton
class PingController @Inject() extends Controller {
  def ping = Action { implicit request =>
    Ok("")
  }
}
