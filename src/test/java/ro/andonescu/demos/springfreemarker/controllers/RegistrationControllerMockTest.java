package ro.andonescu.demos.springfreemarker.controllers;

import ro.andonescu.demos.springfreemarker.config.AbstractTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class RegistrationControllerMockTest extends AbstractTest {

    MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new RegistrationController(null, null)).build();
    }

    @Test
    public void testGetAddRegistrationWithMock() throws Exception {
        ResultActions resultActions = mockMvc.perform(get("/registration/add"));

        resultActions.andExpect(status().isOk());
    }
}
