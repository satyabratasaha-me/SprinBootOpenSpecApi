package com.example.restservice;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.extensions.Extension;
import io.swagger.v3.oas.annotations.extensions.ExtensionProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/persons")
public class PersonsController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/add")
	@Operation(extensions = {
			@Extension( name="examples" ,  properties = {
					@ExtensionProperty(name = "x", value = "{\"id\":\"456\"}", parseValue = true),
					@ExtensionProperty(name = "y", value = "{\"id\":\"789\"}", parseValue = true),
					@ExtensionProperty(name = "y", value = "{\"id\":\"123\"}", parseValue = true)})
	})
	public ResponseEntity greeting(@RequestBody Persons person) {
		return ResponseEntity.ok(HttpStatus.OK);
	}
}
