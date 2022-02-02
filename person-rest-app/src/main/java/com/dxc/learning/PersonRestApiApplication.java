public class PersonRestApiApplication {
    package com.dxc.personrestapi;

    import org.modelmapper.ModelMapper;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.context.annotation.Bean;
    
    @SpringBootApplication
    public class PersonRestApiApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(PersonRestApiApplication.class, args);
        }
        @Bean
        public ModelMapper modelMapper() {
            return new ModelMapper();
        }
    
    }  
}
