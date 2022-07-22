package com.vaadin.flow.server.communication;

import com.vaadin.flow.server.VaadinRequest;
import org.jsoup.nodes.Document;

@FunctionalInterface
public interface DynamicMetadataListener {

  void updateDocument(Document document, VaadinRequest request);

}
