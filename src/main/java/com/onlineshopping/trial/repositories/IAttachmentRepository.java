package com.onlineshopping.trial.repositories;

import com.onlineshopping.trial.model.Attachment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface IAttachmentRepository extends MongoRepository <Attachment, UUID>{
}
