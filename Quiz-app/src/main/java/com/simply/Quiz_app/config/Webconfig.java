package com.simply.Quiz_app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Webconfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Apply to all endpoints
                .allowedOrigins(
                        "https://quiz-app-k1ge.onrender.com",  // ✅ Your frontend URL (calling API)
                        "http://127.0.0.1:5500",               // ✅ For local frontend dev
                        "http://localhost:3000"                // ✅ For React local dev
                )
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allow common HTTP methods
                .allowedHeaders("*")          // Allow all headers
                .allowCredentials(true);      // Allow cookies, auth headers, etc.
    }

}
