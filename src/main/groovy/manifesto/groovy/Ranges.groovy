package manifesto.groovy

import groovy.transform.CompileStatic

@CompileStatic
class Ranges {

    private Ranges() { }

    static boolean inRange(int min, int max, int number) {
        if (min > max) {
            throw new IllegalArgumentException(
                    "Min must be lower or equal to max! min=$min, max=$max"
            )
        }
        if (number < min || number > max) {
            return false
        }
        return true
    }

}
