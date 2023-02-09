package com.nttdata.bootcamp.webfluxdemo.controller;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RequestMapping("/")
@RestController
public class Controller {

	@GetMapping(path = "/numbers", produces = "text/event-stream")
	public Flux<Integer> numbers() {

		Flux<Integer> flux = Flux.range(1, 30).delayElements(Duration.ofSeconds(1));

		return flux;
	}

	@GetMapping(path = "/numbers-with-subscriber", produces = "text/event-stream")
	public Flux<Integer> numberswithSubscriber() {

		Flux<Integer> flux = Flux.range(1, 30).delayElements(Duration.ofSeconds(1));

		flux.subscribe(n -> Subscriber.print(n)); // Subscriptor1
		flux.subscribe(n -> System.out.println("Subscriber 2: " + n)); // Subscriptor2

		return flux;
	}

}
