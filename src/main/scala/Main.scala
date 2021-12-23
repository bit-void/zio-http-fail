import zio._
import zhttp.http._
import zhttp.service.Server

object HelloWorld extends App {
  val app = Http.collectM[Request] {
    case Method.GET -> !! / "text" => ZIO.succeed(Response.text("Hello World!"))
  }

  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] =
    Server.start(8090, app).exitCode
}