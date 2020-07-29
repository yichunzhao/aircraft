package com.ynz.democonfigproperties.aircraft;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("f15")
    @ConfigurationProperties(prefix = "aircraft.f15")
    public JetFighter jetFighterF15() {
        return new JetFighter();
    }

    @Bean("f16")
    @ConfigurationProperties(prefix = "aircraft.f16")
    public JetFighter jetFighterF16() {
        return new JetFighter();
    }

}
