package com.pluralsight.web.reactive.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pluralsight.web.reactive.model.Person;
import com.pluralsight.web.reactive.repository.PersonRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonRepository repository;
	
	@GetMapping
	Flux<Person> list() {
		List<Person> people = repository.findAll();
		
		Flux<Person> fluxPeople = Flux.fromIterable(people);
		
		return fluxPeople;
	}
	
	@GetMapping("{id}")
	public @ResponseBody Mono<Person> findById(@PathVariable Long id) {
		Optional<Person> person = repository.findById(id);
		
		return Mono.just(person.orElse(Person.empty()));
	}
	
}
