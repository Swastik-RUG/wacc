// @GENERATOR:play-routes-compiler
// @SOURCE:/home/swastik/workspace/gitRepo/wacc/2019_group_30_s4151968_s4056167_s3922782/back-end/conf/routes
// @DATE:Tue Oct 29 18:13:47 CET 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.modules.reactivemongo.PathBindables._

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseEnergyController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def energyConsumptionRT(userName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "energyConsumptionRT/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userName", userName)))
    }
  
    // @LINE:12
    def energyConsumptionHistoryWS(userName:String, lookbackPeriod:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "EnergyConsumptionHistoryWS/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userName", userName)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("lookbackPeriod", lookbackPeriod)))
    }
  
    // @LINE:6
    def getEnergyConsumptionStream(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "EnergyConsumptionStream")
    }
  
    // @LINE:10
    def energyConsumptionWS(userName:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "EnergyConsumptionWS/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userName", userName)))
    }
  
  }

  // @LINE:16
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def setEnergyToTrade(userName:String, password:String, energyToTrade:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "setEnergyToTrade/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userName", userName)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("password", password)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("energyToTrade", energyToTrade)))
    }
  
    // @LINE:18
    def createNewUser(userName:String, password:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "addUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userName", userName)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("password", password)))
    }
  
    // @LINE:16
    def authenticateLogin(userName:String, password:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "userAuth/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userName", userName)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("password", password)))
    }
  
    // @LINE:24
    def getUserInformation(userName:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "getUserInformation/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userName", userName)))
    }
  
    // @LINE:20
    def deleteUser(userName:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "deleteUser/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("userName", userName)))
    }
  
  }

  // @LINE:28
  class ReverseStreamController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def akkaStreamSocket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kafka_events")
    }
  
    // @LINE:30
    def akkaActorSocket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "kafka_Actor_stream")
    }
  
  }


}
