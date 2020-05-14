package de.byebyeco2;


        import org.modelmapper.ModelMapper;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;

@Configuration
public class AdditionalConfigurations {
//This bean is necessary to use the ModelMapper, which makes it easier to map entities to dtos
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
