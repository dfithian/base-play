package controllers

import javax.inject.{Inject, Singleton}
import akka.util.ByteString
import play.api.http.Writeable
import play.api.mvc.{Action, Controller}

@Singleton
class PingController @Inject() extends Controller {
  implicit def unitWriteable: Writeable[Unit] = new Writeable(_ => ByteString("{}"), None)
  def ping = Action { implicit request =>
    Ok(())
  }
}
