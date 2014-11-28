/**
 *
 */
package com.endava.andonescu.demos.springfreemarker.service.impl

import com.endava.andonescu.demos.springfreemarker.service.RegistrationService
import org.springframework.stereotype.Service
import com.endava.andonescu.demos.springfreemarker.webforms.RegistrationForm
import java.util.{List => JList}
import scala.collection.{JavaConverters, JavaConversions}

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
    JavaConverters.seqAsJavaListConverter(data.sortBy(f => f.getFirstName).toList).asJava

}
