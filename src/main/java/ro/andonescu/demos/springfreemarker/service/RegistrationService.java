/**
 *
 */
package ro.andonescu.demos.springfreemarker.service;

import ro.andonescu.demos.springfreemarker.webforms.RegistrationForm;

import java.util.List;

/**
 * @author iandonescu
 */
public interface RegistrationService {

    void saveData(RegistrationForm registrationForm);

    List<RegistrationForm> getData();

}
