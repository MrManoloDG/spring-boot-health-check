package com.mrmanolo.springactuatorhealthgui.healthchecks;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthContributor;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component("ActuatorServiceGUI")
public class ActuatorServiceGUI implements HealthIndicator, HealthContributor {
    @Override
    public Health health() {

        return Health.up().build();
    }
}
