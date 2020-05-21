package com.mbsystems.demohhhhh.comfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@Slf4j
public class DemohhhhhConfig {

    @Bean
    public ApplicationRunner applicationRunner( Environment environment ) {
        System.out.println(environment.getProperty( "message-from-application-yml" ));
        return args -> {
            log.info( "message-from-application-yml: " + environment.getProperty( "message-from-application-yml" ) );
        };

    }
}
