package com.onlineshopping.trial.service;

import com.onlineshopping.trial.model.Attachment;
import org.springframework.web.multipart.MultipartFile;

public interface IAttachmentService {
    Attachment createAttachment(MultipartFile file);
}
