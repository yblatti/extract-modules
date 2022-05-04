module org.easysdi.extract.connectors.easysdiv4 {
    provides org.easysdi.extract.connectors.common.IConnector
            with  org.easysdi.extract.connectors.easysdiv4.Easysdiv4;

    requires org.easysdi.extract.commonInterface;

    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires commons.configuration;
    requires java.xml;
    requires org.apache.commons.io;
    requires org.apache.commons.lang3;
    requires org.apache.httpcomponents.httpclient;
    requires org.apache.httpcomponents.httpcore;
    requires org.apache.httpcomponents.httpmime;
    requires org.slf4j;
}