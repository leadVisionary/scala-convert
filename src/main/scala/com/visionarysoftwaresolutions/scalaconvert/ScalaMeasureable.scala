package com.visionarysoftwaresolutions.scalaconvert

abstract class ScalaMeasureable
case class Pounds(value: BigDecimal) extends ScalaMeasureable
case class Kilograms(value:BigDecimal) extends ScalaMeasureable
