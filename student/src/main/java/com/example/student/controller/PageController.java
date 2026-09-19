package com.example.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Serves the HTML page (Phần B). The page itself calls the REST API
 * in StudentController via JavaScript (fetch) to hiển thị / thêm / xóa sinh viên.
 */
@Controller
public class PageController {

    @GetMapping({"/", "/students"})
    public String students() {
        return "students";
    }
}
