package com.endava.andonescu.demos.springfreemarker.controllers;

import com.endava.andonescu.demos.springfreemarker.config.AbstractTest;
import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.ui.ExtendedModelMap;

import static org.junit.Assert.assertEquals;

public class RegistrationControllerTest extends AbstractTest {

    @Autowired
    private RegistrationController registrationController;


    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testShowRegistration() throws Exception {
        MockHttpServletRequest request = new MockHttpServletRequest("GET", "/registration/view");
        String view = registrationController.showRegistration(new ExtendedModelMap());

        assertEquals("views/registration", view);
    }
}
