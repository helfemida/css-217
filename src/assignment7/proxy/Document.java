package assignment7.proxy;

import java.util.Map;

public class Document {
    private String title;
    private String content;
    private Map<String, String> metadata;

    public Document(String title, String content, Map<String, String> metadata) {
        this.title = title;
        this.content = content;
        this.metadata = metadata;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }
}
