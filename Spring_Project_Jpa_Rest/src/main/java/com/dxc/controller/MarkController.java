package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.dao.MarkRespository;
import com.dxc.model.Mark;

@RestController
public class MarkController {

	@Autowired
	MarkRespository markRespository;

	@GetMapping("marks")
	public List<Mark> getMarks()
	{
		List<Mark> marks = (List<Mark>) markRespository.findAll();
		return marks;
	}
	
	@GetMapping(path="mark/{examid}")
	public List<Mark> getMark(@PathVariable("examid") Iterable<String> id) 
	{
		List<Mark> mark = (List<Mark>) markRespository.findAllById(id);
		return mark;
	}
	
	@PostMapping("mark")
	public Mark save(@RequestBody Mark mark)
	{
		return markRespository.save(mark);
	}
	
	@PutMapping("mark")
	public Mark update(Mark mark)
	{
		return ((MarkController) markRespository).update(mark);
	}


}
