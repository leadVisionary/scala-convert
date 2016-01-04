package com.visionarysoftwaresolutions.scalaconvert

import scala.math.BigDecimal

import java.math.MathContext

class ConversionSpecification extends spock.lang.Specification {
    def "can convert 218.6 lbs to kilograms"() {
        given: "a weight 218.6 lbs"
            def weight = new Pounds(new scala.math.BigDecimal(new java.math.BigDecimal("218.6")))
        when: "I convert the pounds to kilograms"
            def result = UnitConverter.convert(weight)
        and: "I want the answer rounded to 6 places"
            MathContext rounding = new MathContext(2)
        then: "I get 99.2 kg"
            result.value.round(rounding).equals(new BigDecimal(new java.math.BigDecimal("99.2")).round(rounding))
    }

    def "can convert 99.155292 kg to pounds"() {
        given: "a weight 99.155292 kg"
            def weight = new Kilograms(new scala.math.BigDecimal(new java.math.BigDecimal("99.155292")))
        when: "I convert the kilograms to pounds"
            def result = UnitConverter.convert(weight)
        and: "I want the answer rounded to 1 places"
            MathContext rounding = new MathContext(1)
        then: "I get 218.6 lbs"
            result.value.round(rounding).equals(new BigDecimal(new java.math.BigDecimal("218.6")).round(rounding))
    }
}
