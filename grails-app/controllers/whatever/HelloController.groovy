package whatever


import grails.rest.*
import grails.converters.*

class HelloController {
	static responseFormats = ['json', 'xml']
	
    def index() {
        render ([a: 'b'] as JSON)
    }
}
