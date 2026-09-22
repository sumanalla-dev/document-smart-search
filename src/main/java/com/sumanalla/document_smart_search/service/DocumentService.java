package com.sumanalla.document_smart_search.service;

import com.sumanalla.document_smart_search.repository.DocumentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public List<String> getDocuments() {
        return documentRepository.findAllDocuments();
    }
}
