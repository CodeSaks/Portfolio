package com.saksham.portfolio.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)  // ✅ Auto-generates UUID
    private UUID id;

    Long createdDate;
    Long updateDate;
}
