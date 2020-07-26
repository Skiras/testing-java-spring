package org.springframework.samples.petclinic.sfg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.samples.petclinic.sfg.LaurelWordProducer;

/**
 * Created by jt on 2019-02-16.
 */
@Profile("base-test")
@Configuration
public class LaurelConfig {

    @Bean
    LaurelWordProducer laurelWordProducer() {
        return new LaurelWordProducer();
    }
}
