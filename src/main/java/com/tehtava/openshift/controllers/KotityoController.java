package com.tehtava.openshift.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tehtava.openshift.models.Kotityo;
import com.tehtava.openshift.repositories.KotityoRepository;

@CrossOrigin(origins="*")
@RestController
public class KotityoController {

	@Autowired
	private KotityoRepository kotityoRepository;
	
	@GetMapping("/all")
	public List<Kotityo> getAll() {
		return (List<Kotityo>) this.kotityoRepository.findAll();
	}
	
	@PostMapping("/add")
	public Kotityo addKotityo(@RequestBody Kotityo kotityo) {
		return this.kotityoRepository.save(kotityo);
	}
	
	@DeleteMapping("/all/{id}")
	public Optional<Kotityo> deleteKotityo(@PathVariable Long id) {
		Optional<Kotityo> kt = this.kotityoRepository.findById(id);
		this.kotityoRepository.deleteById(id);
		return kt;
	}
}
