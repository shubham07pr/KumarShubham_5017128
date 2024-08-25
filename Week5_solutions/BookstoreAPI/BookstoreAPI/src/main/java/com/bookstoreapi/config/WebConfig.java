package com.bookstoreapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		configurer.favorParameter(false) // Use the "accept" header for content negotiation
				.ignoreAcceptHeader(false) // Don't ignore the "accept" header
				.defaultContentType(MediaType.APPLICATION_JSON) // Default content type
				.mediaType("json", MediaType.APPLICATION_JSON) // Media type for "json"
				.mediaType("xml", MediaType.APPLICATION_XML); // Media type for "xml"
	}
}
