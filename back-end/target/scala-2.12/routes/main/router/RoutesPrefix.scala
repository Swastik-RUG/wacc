// @GENERATOR:play-routes-compiler
// @SOURCE:/home/swastik/workspace/gitRepo/wacc/2019_group_30_s4151968_s4056167_s3922782/back-end/conf/routes
// @DATE:Tue Oct 29 18:13:47 CET 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
