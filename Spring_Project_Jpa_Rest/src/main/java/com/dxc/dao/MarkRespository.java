package com.dxc.dao;

import org.springframework.data.repository.CrudRepository;

import com.dxc.model.Mark;

public interface MarkRespository extends CrudRepository<Mark, String> {
	
	
}
