package assignment7.proxy;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        DocumentStorageProxy documentStorageProxy = DocumentStorageProxy.getInstance();
        User user = new User();

        Document document = new Document("Document 1", "Something Important", new HashMap<>());
        Document uploadedDocument = documentStorageProxy.uploadDocument(document);

        if (uploadedDocument != null) {
            System.out.println("Document uploaded: " + uploadedDocument.getTitle());
        } else {
            System.out.println("Failed to upload document.");
        }

        List<Document> searchResults = documentStorageProxy.searchDocuments("Document");
        System.out.println("Search Results:");
        for (Document result : searchResults) {
            System.out.println(result.getTitle());
        }
    }
}
