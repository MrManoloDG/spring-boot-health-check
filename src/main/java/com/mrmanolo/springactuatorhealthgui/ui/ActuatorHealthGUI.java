package com.mrmanolo.springactuatorhealthgui.ui;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ActuatorHealthGUI {

    @Value("${healthgui.url:http://localhost:}")
    public String healthguiURL;

    @Value("${local.server.port:8080}")
    public String port;

    @RequestMapping("/healthui")
    public String healthGUI(Model model) {
        if(healthguiURL == null || healthguiURL.isEmpty() || healthguiURL.isBlank() || healthguiURL.equals("http://localhost:"))
            healthguiURL = "http://localhost:" + port;
        model.addAttribute("url", healthguiURL);
        return "healthGUI";
    }
}
