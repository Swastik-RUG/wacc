package com.wacc.utility.mongodb

import java.util.concurrent.TimeUnit

import scala.concurrent.Await
import scala.concurrent.duration.Duration
import org.mongodb.scala._
import play.api.libs.json.Json


object Helpers {

  implicit class DocumentObservable[C](val observable: Observable[Document]) extends ImplicitObservable[Document] {
    override val converter: (Document) => String = (doc) => doc.toJson
  }

  implicit class GenericObservable[C](val observable: Observable[C]) extends ImplicitObservable[C] {
    override val converter: (C) => String = (doc) => doc.toString
  }

  trait ImplicitObservable[C] {
    val observable: Observable[C]
    val converter: (C) => String

    def results(): Seq[C] = Await.result(observable.toFuture(), Duration(10, TimeUnit.SECONDS))

    def headResult() = Await.result(observable.head(), Duration(10, TimeUnit.SECONDS))

    def extractIds(initial: String = "") = {
      if (initial.length > 0) print(initial)
      results().map(res =>
        (Json.parse(converter(res)) \ "_id").get.toString().replaceAll("\"", "")
      )
    }

    def printHeadResult(initial: String = ""): Unit = println(s"${initial}${converter(headResult())}")
  }

}