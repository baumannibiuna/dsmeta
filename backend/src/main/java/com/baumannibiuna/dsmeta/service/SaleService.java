package com.baumannibiuna.dsmeta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baumannibiuna.dsmeta.entities.Sale;
import com.baumannibiuna.dsmeta.repository.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales() {
		return repository.findAll();
	}

}
