package com.mrmanolo.springactuatorhealthgui.ui;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ActuatorHealthGUITest {

    @Autowired
    ActuatorHealthGUI actuatorHealthGUI;

    @Test
    void check_default_values_url() {
        assertEquals("http://localhost:",actuatorHealthGUI.healthguiURL);
        assertEquals("8080",actuatorHealthGUI.port);
    }

}