package com.embarkx.firstjobapp.company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}
