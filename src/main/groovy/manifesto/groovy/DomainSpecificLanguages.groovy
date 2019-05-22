package manifesto.groovy

import builders.dsl.spreadsheet.builder.api.SpreadsheetBuilder
import groovy.transform.CompileStatic

@CompileStatic
class DomainSpecificLanguages {

    void buildSpreadsheet(SpreadsheetBuilder builder) {
        builder.build {
            sheet('Sample') {
                row {
                    cell 'A'
                }
                row {
                    cell 1
                }
            }
        }
    }

}
