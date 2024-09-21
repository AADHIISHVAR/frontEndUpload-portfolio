package com.portfolio.personal.service;

import com.portfolio.personal.model.ContactModel;
import com.portfolio.personal.repo.ContactRepo;
import com.portfolio.personal.request.ContactRequest;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    private final ContactRepo repo;

    public ContactService(ContactRepo repo) {
        this.repo = repo;
    }

    public boolean processForm(ContactRequest request) {
        if (request.getName() != null && request.getMailId() != null && request.getMessage() != null) {
            // Convert ContactRequest to ContactModel
            ContactModel contactModel = new ContactModel();
            contactModel.setName(request.getName());
            contactModel.setMailId(request.getMailId());
            contactModel.setMessage(request.getMessage());

            // Save the ContactModel to the repository
            repo.save(contactModel);
            System.out.println("Received contact form submission from: " + request.getName());
            return true;
        }
        return false; // Return false if validation fails
    }
}
