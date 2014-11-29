package ro.andonescu.demos.springfreemarker.service.impl

import java.util.{List => JList}
import org.springframework.stereotype.Service
import ro.andonescu.demos.springfreemarker.service.RegistrationService
import ro.andonescu.demos.springfreemarker.webforms.RegistrationForm

import scala.collection.JavaConverters

/**
 * @author iandonescu
 *
 */
@Service
class RegistrationServiceImpl extends RegistrationService {

  var data: List[RegistrationForm] = List.empty

  def saveData(registrationForm: RegistrationForm) = {
    data ::= registrationForm
  }

  def getData() =
    JavaConverters.seqAsJavaListConverter(data.sortBy(_.getFirstName).toList).asJava

}
