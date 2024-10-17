package com.onlineshopping.trial.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "attachments")
public class Attachment extends BaseEntity{
    private String fileName;
    private String extension;
    private String fileUrl;
    private String fileContent;
}
