package com.cogent.practice;

final class Employee {
	private final String name;
	private final int id;
	
	//Use Getter Not Setter
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	//
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	/*
	@RequestMapping("/api/user")
	@GetMapping
	@PutMapping("/{id}")
	@PostMapping
	@DeleteMapping("/{id}")
	*/
}

public class InterviewPractice {

	public static void main(String[] args) {
		

	}

}
