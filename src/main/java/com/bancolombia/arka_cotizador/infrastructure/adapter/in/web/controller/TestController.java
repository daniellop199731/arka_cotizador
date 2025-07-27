package com.bancolombia.arka_cotizador.infrastructure.adapter.in.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("")
    public Mono<String> test() {
        return Mono.just("Hello, this is a test endpoint (Arka_cotizador !!)!");
    }

    @GetMapping("/{text}")
    public Mono<String> testPath(@PathVariable("text") String text) {
        return Mono.just("Hello, this is a test endpoint with path-parameter: " + text);
    }
    
    @GetMapping("/with-param")
    public Mono<String> testParam(@RequestParam("param") String param) {
        return Mono.just("Hello, this is a test endpoint with request-parameter: " + param);
    }

    @GetMapping("/with-body")
    public Mono<String> testBody(@RequestBody String param) {
        return Mono.just("Hello, this is a test endpoint with request-body: \n" + param);
    }

}
