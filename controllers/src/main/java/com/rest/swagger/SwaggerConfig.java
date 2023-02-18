package com.rest.swagger;

public class SwaggerConfig {}

//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@EnableSwagger2
//@PropertySource("classpath:application.properties")
//@Configuration
//public class SwaggerConfig {
//
//    @Value("${swagger.baseurl:localhost:8080}")
//    private String baseUrl;
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Students")
//                .description("Restful API to get student data")
//                .termsOfServiceUrl("http://h_megali_ton_mpatson_sxoli.edu")
//                .contact("im@yourmoms.com")
//                .license("NASA")
//                .build();
//    }
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .host(baseUrl)
//                .pathMapping("/")
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .paths(Predicates.not(PathSelectors.regex("/error.*")))
//                .paths(Predicates.not(PathSelectors.regex("/actuator.*")))
//                .build()
//                .useDefaultResponseMessages(false);
//    }
//}