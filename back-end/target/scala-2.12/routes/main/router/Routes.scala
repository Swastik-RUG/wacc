// @GENERATOR:play-routes-compiler
// @SOURCE:/home/swastik/workspace/gitRepo/wacc/2019_group_30_s4151968_s4056167_s3922782/back-end/conf/routes
// @DATE:Tue Oct 29 18:13:47 CET 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.modules.reactivemongo.PathBindables._

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  EnergyController_0: controllers.EnergyController,
  // @LINE:16
  UserController_2: controllers.UserController,
  // @LINE:28
  StreamController_1: controllers.StreamController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    EnergyController_0: controllers.EnergyController,
    // @LINE:16
    UserController_2: controllers.UserController,
    // @LINE:28
    StreamController_1: controllers.StreamController
  ) = this(errorHandler, EnergyController_0, UserController_2, StreamController_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, EnergyController_0, UserController_2, StreamController_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """EnergyConsumptionStream""", """controllers.EnergyController.getEnergyConsumptionStream"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """energyConsumptionRT/""" + "$" + """userName<[^/]+>""", """controllers.EnergyController.energyConsumptionRT(userName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """EnergyConsumptionWS/""" + "$" + """userName<[^/]+>""", """controllers.EnergyController.energyConsumptionWS(userName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """EnergyConsumptionHistoryWS/""" + "$" + """userName<[^/]+>/""" + "$" + """lookbackPeriod<[^/]+>""", """controllers.EnergyController.energyConsumptionHistoryWS(userName:String, lookbackPeriod:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """userAuth/""" + "$" + """userName<[^/]+>/""" + "$" + """password<[^/]+>""", """controllers.UserController.authenticateLogin(userName:String, password:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUser/""" + "$" + """userName<[^/]+>/""" + "$" + """password<[^/]+>""", """controllers.UserController.createNewUser(userName:String, password:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteUser/""" + "$" + """userName<[^/]+>""", """controllers.UserController.deleteUser(userName:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """setEnergyToTrade/""" + "$" + """userName<[^/]+>/""" + "$" + """password<[^/]+>/""" + "$" + """energyToTrade<[^/]+>""", """controllers.UserController.setEnergyToTrade(userName:String, password:String, energyToTrade:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """getUserInformation/""" + "$" + """userName<[^/]+>""", """controllers.UserController.getUserInformation(userName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kafka_events""", """controllers.StreamController.akkaStreamSocket"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """kafka_Actor_stream""", """controllers.StreamController.akkaActorSocket"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_EnergyController_getEnergyConsumptionStream0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("EnergyConsumptionStream")))
  )
  private[this] lazy val controllers_EnergyController_getEnergyConsumptionStream0_invoker = createInvoker(
    EnergyController_0.getEnergyConsumptionStream,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EnergyController",
      "getEnergyConsumptionStream",
      Nil,
      "GET",
      this.prefix + """EnergyConsumptionStream""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_EnergyController_energyConsumptionRT1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("energyConsumptionRT/"), DynamicPart("userName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EnergyController_energyConsumptionRT1_invoker = createInvoker(
    EnergyController_0.energyConsumptionRT(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EnergyController",
      "energyConsumptionRT",
      Seq(classOf[String]),
      "GET",
      this.prefix + """energyConsumptionRT/""" + "$" + """userName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_EnergyController_energyConsumptionWS2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("EnergyConsumptionWS/"), DynamicPart("userName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EnergyController_energyConsumptionWS2_invoker = createInvoker(
    EnergyController_0.energyConsumptionWS(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EnergyController",
      "energyConsumptionWS",
      Seq(classOf[String]),
      "GET",
      this.prefix + """EnergyConsumptionWS/""" + "$" + """userName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_EnergyController_energyConsumptionHistoryWS3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("EnergyConsumptionHistoryWS/"), DynamicPart("userName", """[^/]+""",true), StaticPart("/"), DynamicPart("lookbackPeriod", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EnergyController_energyConsumptionHistoryWS3_invoker = createInvoker(
    EnergyController_0.energyConsumptionHistoryWS(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EnergyController",
      "energyConsumptionHistoryWS",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """EnergyConsumptionHistoryWS/""" + "$" + """userName<[^/]+>/""" + "$" + """lookbackPeriod<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_authenticateLogin4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("userAuth/"), DynamicPart("userName", """[^/]+""",true), StaticPart("/"), DynamicPart("password", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_authenticateLogin4_invoker = createInvoker(
    UserController_2.authenticateLogin(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "authenticateLogin",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """userAuth/""" + "$" + """userName<[^/]+>/""" + "$" + """password<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserController_createNewUser5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUser/"), DynamicPart("userName", """[^/]+""",true), StaticPart("/"), DynamicPart("password", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_createNewUser5_invoker = createInvoker(
    UserController_2.createNewUser(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "createNewUser",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """addUser/""" + "$" + """userName<[^/]+>/""" + "$" + """password<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UserController_deleteUser6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteUser/"), DynamicPart("userName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_deleteUser6_invoker = createInvoker(
    UserController_2.deleteUser(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "deleteUser",
      Seq(classOf[String]),
      "POST",
      this.prefix + """deleteUser/""" + "$" + """userName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_UserController_setEnergyToTrade7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("setEnergyToTrade/"), DynamicPart("userName", """[^/]+""",true), StaticPart("/"), DynamicPart("password", """[^/]+""",true), StaticPart("/"), DynamicPart("energyToTrade", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_setEnergyToTrade7_invoker = createInvoker(
    UserController_2.setEnergyToTrade(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "setEnergyToTrade",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """setEnergyToTrade/""" + "$" + """userName<[^/]+>/""" + "$" + """password<[^/]+>/""" + "$" + """energyToTrade<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_UserController_getUserInformation8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("getUserInformation/"), DynamicPart("userName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_getUserInformation8_invoker = createInvoker(
    UserController_2.getUserInformation(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUserInformation",
      Seq(classOf[String]),
      "POST",
      this.prefix + """getUserInformation/""" + "$" + """userName<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_StreamController_akkaStreamSocket9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kafka_events")))
  )
  private[this] lazy val controllers_StreamController_akkaStreamSocket9_invoker = createInvoker(
    StreamController_1.akkaStreamSocket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StreamController",
      "akkaStreamSocket",
      Nil,
      "GET",
      this.prefix + """kafka_events""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_StreamController_akkaActorSocket10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("kafka_Actor_stream")))
  )
  private[this] lazy val controllers_StreamController_akkaActorSocket10_invoker = createInvoker(
    StreamController_1.akkaActorSocket,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StreamController",
      "akkaActorSocket",
      Nil,
      "GET",
      this.prefix + """kafka_Actor_stream""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_EnergyController_getEnergyConsumptionStream0_route(params@_) =>
      call { 
        controllers_EnergyController_getEnergyConsumptionStream0_invoker.call(EnergyController_0.getEnergyConsumptionStream)
      }
  
    // @LINE:8
    case controllers_EnergyController_energyConsumptionRT1_route(params@_) =>
      call(params.fromPath[String]("userName", None)) { (userName) =>
        controllers_EnergyController_energyConsumptionRT1_invoker.call(EnergyController_0.energyConsumptionRT(userName))
      }
  
    // @LINE:10
    case controllers_EnergyController_energyConsumptionWS2_route(params@_) =>
      call(params.fromPath[String]("userName", None)) { (userName) =>
        controllers_EnergyController_energyConsumptionWS2_invoker.call(EnergyController_0.energyConsumptionWS(userName))
      }
  
    // @LINE:12
    case controllers_EnergyController_energyConsumptionHistoryWS3_route(params@_) =>
      call(params.fromPath[String]("userName", None), params.fromPath[String]("lookbackPeriod", None)) { (userName, lookbackPeriod) =>
        controllers_EnergyController_energyConsumptionHistoryWS3_invoker.call(EnergyController_0.energyConsumptionHistoryWS(userName, lookbackPeriod))
      }
  
    // @LINE:16
    case controllers_UserController_authenticateLogin4_route(params@_) =>
      call(params.fromPath[String]("userName", None), params.fromPath[String]("password", None)) { (userName, password) =>
        controllers_UserController_authenticateLogin4_invoker.call(UserController_2.authenticateLogin(userName, password))
      }
  
    // @LINE:18
    case controllers_UserController_createNewUser5_route(params@_) =>
      call(params.fromPath[String]("userName", None), params.fromPath[String]("password", None)) { (userName, password) =>
        controllers_UserController_createNewUser5_invoker.call(UserController_2.createNewUser(userName, password))
      }
  
    // @LINE:20
    case controllers_UserController_deleteUser6_route(params@_) =>
      call(params.fromPath[String]("userName", None)) { (userName) =>
        controllers_UserController_deleteUser6_invoker.call(UserController_2.deleteUser(userName))
      }
  
    // @LINE:22
    case controllers_UserController_setEnergyToTrade7_route(params@_) =>
      call(params.fromPath[String]("userName", None), params.fromPath[String]("password", None), params.fromPath[String]("energyToTrade", None)) { (userName, password, energyToTrade) =>
        controllers_UserController_setEnergyToTrade7_invoker.call(UserController_2.setEnergyToTrade(userName, password, energyToTrade))
      }
  
    // @LINE:24
    case controllers_UserController_getUserInformation8_route(params@_) =>
      call(params.fromPath[String]("userName", None)) { (userName) =>
        controllers_UserController_getUserInformation8_invoker.call(UserController_2.getUserInformation(userName))
      }
  
    // @LINE:28
    case controllers_StreamController_akkaStreamSocket9_route(params@_) =>
      call { 
        controllers_StreamController_akkaStreamSocket9_invoker.call(StreamController_1.akkaStreamSocket)
      }
  
    // @LINE:30
    case controllers_StreamController_akkaActorSocket10_route(params@_) =>
      call { 
        controllers_StreamController_akkaActorSocket10_invoker.call(StreamController_1.akkaActorSocket)
      }
  }
}
