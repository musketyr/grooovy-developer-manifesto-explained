package manifesto.groovy

import spock.lang.Specification
import spock.lang.Unroll

class RangesSpec extends Specification {

@Unroll
void '#number #expected in range (#min, #max)'() {
    expect:
        Ranges.inRange(min, max, number) == result
    where:
        min | max  | number | result
        0   | 0    | 0      | true
        1   | 2    | 0      | false
        -2  | -2   | 0      | false

        expected = result ? 'is' : 'is not'
}

}
