package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api/upload")
public class FileController {
    @RequestMapping("/file")
    String upload(@RequestParam("file") MultipartFile file) {
        try {
            byte[] bytes = file.getBytes();
            String content = new String(bytes);

            System.out.println(content);
            return "yes";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "fuck";
    }

    @RequestMapping("/test")
    String test() {
        return "Hello";
    }
}
