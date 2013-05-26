/**
 *
 */
package com.endava.andonescu.demos.springfreemarker.service;

import com.endava.andonescu.demos.springfreemarker.webforms.RegistrationForm;

import java.util.List;

/**
 * @author iandonescu
 */
public interface RegistrationService {

    void saveData(RegistrationForm registrationForm);

    List<RegistrationForm> getData();

}
