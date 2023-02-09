package com.nttdata.reactive;


import reactor.core.publisher.Flux;

public class App {

	public static void main(String[] args) {
		
		//Primera parte
		Flux<String> textMessageFlux = Flux.just("Example1.", "Example2.", "Example3.");
        textMessageFlux.subscribe(message -> System.out.println("Subscriber 1: " + message));
       

        
	}

}
