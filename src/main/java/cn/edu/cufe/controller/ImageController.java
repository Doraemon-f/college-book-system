package cn.edu.cufe.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/img")
public class ImageController {
    @RequestMapping(value = "/{file_name}.{type}", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<InputStreamResource> getJPG(
            @PathVariable(value = "file_name") String fileName, @PathVariable(value = "type") String type)
            throws IOException {
        ClassPathResource imgFile = new ClassPathResource(String.format("img/%1$s.%2$s", fileName, type));
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(new InputStreamResource(imgFile.getInputStream()));
    }

    @RequestMapping(value = "/{file_name}.{type}", method = RequestMethod.GET, produces = MediaType.IMAGE_PNG_VALUE)
    public ResponseEntity<InputStreamResource> getPNG(
            @PathVariable(value = "file_name") String fileName, @PathVariable(value = "type") String type)
            throws IOException {
        ClassPathResource imgFile = new ClassPathResource(String.format("img/%1$s.%2$s", fileName, type));
        return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(new InputStreamResource(imgFile.getInputStream()));
    }
}

