package com.cts.prodmgmt.audit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.prodmgmt.audit.model.AuditDetail;
import com.cts.prodmgmt.audit.repository.MongoJobRepository;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/mongoDbJob")
public class MongoDbJobController {
		
	@Autowired
	MongoJobRepository mongoJobRepository;
	
	@RequestMapping(value="/auditDetails", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> create(@RequestBody AuditDetail auditDetail) {
		mongoJobRepository.save(auditDetail);
		return new ResponseEntity<>("Details got auditted Successfully", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/readAllAuditRecords") 
	public List<AuditDetail> readAllBookMark() {
		return mongoJobRepository.findAll();
	}

}
