package com.visionarysoftwaresolutions.groovyconvert

import java.math.MathContext

class ConversionSpecification extends spock.lang.Specification {
    def "can convert 218.6 lbs to kilograms"() {
        given: "a weight 218.6 lbs"
            Pounds weight = new Pounds(value:218.6)
        and: "a calculator"
            PoundsToKilograms visitor = new PoundsToKilograms()
        when: "I convert the pounds to kilograms"
            weight.accept(visitor)
        and: "I want the answer rounded to 6 places"
            MathContext rounding = new MathContext(2)
        then: "I get 99.2 kg"
            visitor.calculated.value.round(rounding).equals(new BigDecimal(99.2).round(rounding))
    }

    def "can convert 99.155292 kg to pounds"() {
        given: "a weight 99.155292 kg"
            Kilograms weight = new Kilograms(value:99.155292)
        and: "a calculator"
            KilogramsToPounds visitor = new KilogramsToPounds()
        when: "I convert the kilograms to pounds"
            weight.accept(visitor)
        and: "I want the answer rounded to 1 places"
            MathContext rounding = new MathContext(1)
        then: "I get 218.6 lbs"
            visitor.calculated.value.round(rounding).equals(new BigDecimal(218.6).round(rounding))
    }
}
