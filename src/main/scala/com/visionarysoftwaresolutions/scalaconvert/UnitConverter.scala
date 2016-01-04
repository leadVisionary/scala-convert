package com.visionarysoftwaresolutions.scalaconvert

object UnitConverter {
  def convert(measurable: ScalaMeasureable): ScalaMeasureable = measurable match {
    case Pounds(v) => Kilograms(v./(2.2046))
    case Kilograms(v) => Pounds(v.*(2.2046))
  }
}
