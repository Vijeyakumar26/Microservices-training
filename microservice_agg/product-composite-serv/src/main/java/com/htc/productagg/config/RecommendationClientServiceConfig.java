/*
 * package com.htc.productagg.config;
 * 
 * import org.springframework.beans.factory.ObjectFactory; import
 * org.springframework.boot.autoconfigure.http.HttpMessageConverters; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.http.converter.HttpMessageConverter; import
 * org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
 * 
 * import feign.codec.Decoder;
 * 
 * @Configuration public class RecommendationClientServiceConfig {
 * 
 * @Bean public Decoder feignDecoder() { HttpMessageConverter jacksonConverter =
 * new MappingJackson2HttpMessageConverter(customObjectMapper());
 * ObjectFactory<HttpMessageConverters> objectFactory = () -> new
 * HttpMessageConverters(jacksonConverter); return null;
 * 
 * }
 * 
 * 
 * }
 */
