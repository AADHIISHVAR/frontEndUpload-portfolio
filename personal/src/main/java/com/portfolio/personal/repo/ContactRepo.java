package com.portfolio.personal.repo;

import com.portfolio.personal.model.ContactModel;
import com.portfolio.personal.request.ContactRequest;
import com.sun.jdi.InterfaceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepo extends JpaRepository<ContactModel, Long> {

}
