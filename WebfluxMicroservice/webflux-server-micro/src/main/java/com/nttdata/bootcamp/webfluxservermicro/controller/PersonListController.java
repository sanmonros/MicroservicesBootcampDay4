package com.nttdata.bootcamp.webfluxservermicro.controller;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
public class PersonListController {

	@GetMapping(path="/person-list-1", produces="text/event-stream")
	public Flux<Person> personList1() {
		
		Person p1= new Person("Santiago", "Montaño", 30);
		Person p2= new Person("Elena", "López", 20);
		return Flux.just(p1,p2).delayElements(Duration.ofSeconds(3));
	
		
	}

	@GetMapping(path="/person-list-2", produces="text/event-stream")
	public Flux<Person> personList2() {
		Person p3= new Person("Sergio", "Lago", 20);
		Person p4= new Person("Elena", "López", 10);
		return Flux.just(p3,p4).delayElements(Duration.ofSeconds(5));
		
	}

	@GetMapping(path="/person-list-3", produces="text/event-stream")
	public Flux<Person> personList3() {
		Person p5= new Person("Ana", "Clara", 12);
		Person p6= new Person("Elena", "López", 20);
		return Flux.just(p5,p6).delayElements(Duration.ofSeconds(7));
	}

	@GetMapping(path="/person-list-4", produces="text/event-stream")
	public Flux<Person> personList4() {
		Person p6= new Person("Juan", "Serrano", 60);
		Person p7= new Person("Ernesto", "Luengo", 50);
		return Flux.just(p6,p7).delayElements(Duration.ofSeconds(10));
	}
}
