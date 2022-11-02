package com.cts.prodmgmt.audit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cts.prodmgmt.audit.model.AuditDetail;

public interface MongoJobRepository extends MongoRepository<AuditDetail, String>{

}
