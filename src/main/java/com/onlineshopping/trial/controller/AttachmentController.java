package com.onlineshopping.trial.controller;

import com.onlineshopping.trial.model.Attachment;
import com.onlineshopping.trial.service.IAttachmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("attachment")
@RequiredArgsConstructor
public class AttachmentController {
    private final IAttachmentService attachmentService;
    @Operation(summary = "Create attachment")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Attachments Created", content = @Content(schema = @Schema(implementation = Attachment.class))),
            @ApiResponse(responseCode = "401", description = "Unauthenticated", content = @Content),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = @Content),
            @ApiResponse(responseCode = "500", description = "internal server error", content = @Content(schema = @Schema(implementation = ErrorResponse.class))) })
    @SecurityRequirement(name = "Bearer Authentication")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "save-attachment", consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
    public Attachment createAttachment (@RequestPart("file") MultipartFile file){
        return attachmentService.createAttachment(file);
    }

}
