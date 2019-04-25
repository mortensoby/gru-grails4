package whatever

import com.agorapulse.gru.Gru
import com.agorapulse.gru.grails.Grails
import grails.testing.web.controllers.ControllerUnitTest
import org.junit.Rule
import spock.lang.Specification

class HelloConstollerSpec extends Specification implements ControllerUnitTest<HelloController> {

    @Rule Gru<Grails<HelloConstollerSpec>> gru = Gru.equip(Grails.steal(this)).prepare {
        include UrlMappings
    }

    void 'basic test'() {
        expect:
            gru.test {
                get '/hello'
            }
    }
}