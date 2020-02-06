// @GENERATOR:play-routes-compiler
// @SOURCE:/home/swastik/workspace/gitRepo/wacc/2019_group_30_s4151968_s4056167_s3922782/back-end/conf/routes
// @DATE:Tue Oct 29 18:13:47 CET 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseEnergyController EnergyController = new controllers.ReverseEnergyController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseStreamController StreamController = new controllers.ReverseStreamController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseEnergyController EnergyController = new controllers.javascript.ReverseEnergyController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseStreamController StreamController = new controllers.javascript.ReverseStreamController(RoutesPrefix.byNamePrefix());
  }

}
