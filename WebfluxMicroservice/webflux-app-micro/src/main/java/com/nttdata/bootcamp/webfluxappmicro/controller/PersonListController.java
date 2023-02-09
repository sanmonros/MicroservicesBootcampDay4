package com.nttdata.bootcamp.webfluxappmicro.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nttdata.bootcamp.webfluxappmicro.services.PersonService;
import com.nttdata.bootcamp.webfluxservermicro.controller.Person;


import reactor.core.publisher.Flux;

@Controller
public class PersonListController {

	@Autowired
	PersonService personService;
	
	@GetMapping("/person-list")
	public String personList(final Model model) {
		final Flux<Person> personlist=personService.allPerson();
		model.addAttribute("personlist",personlist);
		return "personlist";
		
	}
	
	
}
