package com.gsondemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.gsondemo.Entity.Details;
import com.gsondemo.Repository.DetailsRepository;

@RestController
public class DetailsController {
	
	@Autowired
	private DetailsRepository repo;

	
	@PostMapping("/addDetail")
	public Details addDetail() {
		String json = "{\"id\": 7,\"name\": \"James\",\"dept\": \"MECH\"}";
		Details details = new Gson().fromJson(json, Details.class);
		return repo.save(details);
	}
	
	
	@PostMapping("/normalAdd")
	public Details normalAdd(@RequestBody Details d) {
		return repo.save(d);
	}
	
	
	@GetMapping("/getDetails")
	public List<Details> getDetails() {
		return repo.findAll();
	}
	
	
	@DeleteMapping("/deleteDetail/{id}")
	public String deleteDetail(@PathVariable("id") Long id) {
		repo.deleteById(id);
		return "DELETE SUCCESSFUL!";
	}
	
}
