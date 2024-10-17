package com.onlineshopping.trial.service.impl;

import com.onlineshopping.trial.model.Attachment;
import com.onlineshopping.trial.service.IAttachmentService;
import lombok.SneakyThrows;
import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;

@Service
public class AttachmentService implements IAttachmentService {
    @Override
    @SneakyThrows
    public Attachment createAttachment(MultipartFile file) {
        Path path = Path.of(file.getOriginalFilename().formatted("%s/%s/%s"));
       Attachment attachment = new Attachment();

     attachment.setFileName(FilenameUtils.getName(file.getOriginalFilename()));
     attachment.setExtension(FilenameUtils.getExtension(file.getOriginalFilename()));
     attachment.setFileUrl(path.toString());
     return attachment;
    }
}
