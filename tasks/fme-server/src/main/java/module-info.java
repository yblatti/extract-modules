module org.easysdi.extract.plugins.fmeserver {
    provides org.easysdi.extract.plugins.common.ITaskProcessor
            with org.easysdi.extract.plugins.fmeserver.FmeServerPlugin;

    requires org.easysdi.extract.commonInterface;

    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires org.apache.commons.io;
    requires org.apache.commons.lang3;
    requires org.apache.httpcomponents.httpclient;
    requires org.apache.httpcomponents.httpcore;
    requires org.json;
    requires org.slf4j;
}