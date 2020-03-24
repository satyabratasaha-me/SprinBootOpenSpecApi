package com.example.restservice;

public class Persons {

	private final int id;
	private final String name;
	private  final String address;

	public Persons(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public long getAge() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
}
