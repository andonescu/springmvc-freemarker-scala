/**
 *
 */
package com.endava.andonescu.demos.springfreemarker.service.impl

import java.util.{List => JList}

import com.endava.andonescu.demos.springfreemarker.service.RegistrationService
import com.endava.andonescu.demos.springfreemarker.webforms.RegistrationForm
import org.springframework.stereotype.Service

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
    JavaConverters.seqAsJavaListConverter(data.sortBy(f => f.getFirstName).toList).asJava

}
