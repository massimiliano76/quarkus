package io.quarkus.qrs.runtime.handlers;

import io.quarkus.qrs.runtime.core.QrsRequestContext;
import io.quarkus.qrs.runtime.core.serialization.EntityWriter;

public class EntityWriterHandler implements RestHandler {

    private final EntityWriter entityWriter;

    public EntityWriterHandler(EntityWriter entityWriter) {
        this.entityWriter = entityWriter;
    }

    @Override
    public void handle(QrsRequestContext requestContext) throws Exception {
        requestContext.setEntityWriter(entityWriter);
    }
}
