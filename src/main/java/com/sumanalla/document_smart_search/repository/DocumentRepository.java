package com.sumanalla.document_smart_search.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DocumentRepository {

    public List<String> findAllDocuments() {
        return List.of("Document 1", "Document 2", "Document 3");
    }
}
