package com.portfolio.personal.controller;


import com.portfolio.personal.request.ContactRequest;
import com.portfolio.personal.service.ContactService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("/submitContactForm")
    public ResponseEntity<String> submitForm(@RequestParam String name,
                                             @RequestParam String email,
                                             @RequestParam String message) {
        // Create a ContactRequest object and set the form data
        ContactRequest request = new ContactRequest();
        request.setName(name);
        request.setMailId(email);
        request.setMessage(message);

        // Pass the ContactRequest to the service method
        boolean isSuccess = contactService.processForm(request);

        // Return success or error message based on service method result
        if (isSuccess) {
            return ResponseEntity.ok("Form submitted successfully!");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Form submission failed. Please check the inputs.");
        }
    }
}
