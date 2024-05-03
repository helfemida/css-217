package assignment7.proxy;

import java.util.ArrayList;
import java.util.List;

public class DocumentStorageProxy implements DocumentStorage {
    private static DocumentStorageProxy instance;
    private DocumentStorage documentStorage;

    public static DocumentStorageProxy getInstance() {
        if (instance == null) {
            instance = new DocumentStorageProxy();
        }
        return instance;
    }

    private DocumentStorageProxy() {
        this.documentStorage = new ConcreteDocumentStorage();
    }

    private boolean hasAccess(User user, String documentId) {
        return true;
    }

    private boolean isAuthenticated(User user) {
        return true;
    }

    @Override
    public Document uploadDocument(Document document) {
        if (isAuthenticated(new User()) && hasAccess(new User(), document.getTitle())) {
            return documentStorage.uploadDocument(document);
        } else {
            return null;
        }
    }

    @Override
    public Document downloadDocument(String documentId) {
        if (isAuthenticated(new User()) && hasAccess(new User(), documentId)) {
            return documentStorage.downloadDocument(documentId);
        } else {
            return null;
        }
    }

    @Override
    public Document editDocument(String documentId, Document newDocument) {
        if (isAuthenticated(new User()) && hasAccess(new User(), documentId)) {
            return documentStorage.editDocument(documentId, newDocument);
        } else {
            return null;
        }
    }

    @Override
    public List<Document> searchDocuments(String query) {
        if (isAuthenticated(new User())) {
            return documentStorage.searchDocuments(query);
        } else {
            return new ArrayList<>();
        }
    }
}
