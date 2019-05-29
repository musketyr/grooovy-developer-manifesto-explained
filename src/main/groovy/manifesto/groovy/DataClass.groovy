package manifesto.groovy

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString

@ToString
@EqualsAndHashCode
class DataClass {

    final String value
    final String description

    DataClass(String value, String description) {
        this.value = value
        this.description = description
    }

}
