//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@Configuration
//@EnableSwagger2
//public class configSwagger {
//   @Bean
//   public Docket api() {
//      return new Docket(DocumentationType.SWAGGER_2)
//         .select()
//         .apis(RequestHandlerSelectors.basePackage("com.example.test.Controller"))
//         .paths(PathSelectors.any())
//         .build();
//         
//   }
//
//   private ApiInfo apiInfo() {
//      return new ApiInfoBuilder()
//         .title("REST API Documentation")
//         .description("Documentation for the REST API")
//         .contact(new Contact("Your Name", "", "your.email@example.com"))
//         .version("1.0")
//         .build();
//   }
//}
