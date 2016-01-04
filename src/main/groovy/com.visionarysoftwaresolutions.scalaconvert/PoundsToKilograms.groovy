package com.visionarysoftwaresolutions.scalaconvert

import java.math.RoundingMode

class PoundsToKilograms implements Visitor<Pounds> {
    Kilograms calculated;

    @Override
    void visit(final Pounds toVisit) {
        calculated = new Kilograms(value : toVisit.value.divide(new BigDecimal(2.2046), RoundingMode.HALF_UP))
    }
}
