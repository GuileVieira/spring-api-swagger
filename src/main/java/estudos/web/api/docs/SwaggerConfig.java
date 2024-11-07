package estudos.web.api.docs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI().info(new Info()
                .title("Swagger API Test")
                .version("1.0.0")
                .description("Rest API Test With docs")
                .license(new License().name("Apache 2.0").url("http://springdoc.org"))
                .contact(new Contact().url("http://springdoc.org")
                        .name("Guilherme Vieira")
                        .email("guilherme.vieira16@hotmail.com")));
    }
}
