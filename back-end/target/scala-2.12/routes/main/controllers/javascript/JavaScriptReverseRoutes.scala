// @GENERATOR:play-routes-compiler
// @SOURCE:/home/swastik/workspace/gitRepo/wacc/2019_group_30_s4151968_s4056167_s3922782/back-end/conf/routes
// @DATE:Tue Oct 29 18:13:47 CET 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.modules.reactivemongo.PathBindables._

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseEnergyController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def energyConsumptionRT: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EnergyController.energyConsumptionRT",
      """
        function(userName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "energyConsumptionRT/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userName", userName0))})
        }
      """
    )
  
    // @LINE:12
    def energyConsumptionHistoryWS: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EnergyController.energyConsumptionHistoryWS",
      """
        function(userName0,lookbackPeriod1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "EnergyConsumptionHistoryWS/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userName", userName0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("lookbackPeriod", lookbackPeriod1))})
        }
      """
    )
  
    // @LINE:6
    def getEnergyConsumptionStream: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EnergyController.getEnergyConsumptionStream",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "EnergyConsumptionStream"})
        }
      """
    )
  
    // @LINE:10
    def energyConsumptionWS: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EnergyController.energyConsumptionWS",
      """
        function(userName0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "EnergyConsumptionWS/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userName", userName0))})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def setEnergyToTrade: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.setEnergyToTrade",
      """
        function(userName0,password1,energyToTrade2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "setEnergyToTrade/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userName", userName0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("password", password1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("energyToTrade", energyToTrade2))})
        }
      """
    )
  
    // @LINE:18
    def createNewUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.createNewUser",
      """
        function(userName0,password1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userName", userName0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("password", password1))})
        }
      """
    )
  
    // @LINE:16
    def authenticateLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.authenticateLogin",
      """
        function(userName0,password1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "userAuth/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userName", userName0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("password", password1))})
        }
      """
    )
  
    // @LINE:24
    def getUserInformation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUserInformation",
      """
        function(userName0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "getUserInformation/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userName", userName0))})
        }
      """
    )
  
    // @LINE:20
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.deleteUser",
      """
        function(userName0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteUser/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("userName", userName0))})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseStreamController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def akkaStreamSocket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StreamController.akkaStreamSocket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kafka_events"})
        }
      """
    )
  
    // @LINE:30
    def akkaActorSocket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StreamController.akkaActorSocket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "kafka_Actor_stream"})
        }
      """
    )
  
  }


}
