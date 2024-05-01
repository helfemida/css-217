package assignment7_proxy;

import java.util.List;

public interface DocumentStorage {
    Document uploadDocument(Document document);
    Document downloadDocument(String documentId);
    Document editDocument(String documentId, Document newDocument);
    List<Document> searchDocuments(String query);
}
