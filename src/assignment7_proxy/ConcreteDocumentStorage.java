package assignment7_proxy;

import java.util.ArrayList;
import java.util.List;

public class ConcreteDocumentStorage implements DocumentStorage {
    private List<Document> documentList;

    public ConcreteDocumentStorage() {
        this.documentList = new ArrayList<>();
    }

    @Override
    public Document uploadDocument(Document document) {
        documentList.add(document);
        return document;
    }

    @Override
    public Document downloadDocument(String documentId) {
        for (Document document : documentList) {
            if (document.getTitle().equals(documentId)) {
                return document;
            }
        }
        return null;
    }

    @Override
    public Document editDocument(String documentId, Document newDocument) {
        for (Document document : documentList) {
            if (document.getTitle().equals(documentId)) {
                document.setContent(newDocument.getContent());
                document.setMetadata(newDocument.getMetadata());
                return document;
            }
        }
        return null;
    }

    @Override
    public List<Document> searchDocuments(String query) {
        List<Document> results = new ArrayList<>();
        for (Document document : documentList) {
            if (document.getTitle().contains(query) || document.getContent().contains(query)) {
                results.add(document);
            }
        }
        return results;
    }
}