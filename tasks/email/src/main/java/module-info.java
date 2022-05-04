module org.easysdi.extract.plugins.email {
    provides org.easysdi.extract.plugins.common.ITaskProcessor
            with org.easysdi.extract.plugins.email.EmailPlugin;

    requires org.easysdi.extract.commonInterface;

    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires commons.validator;
    requires java.mail;
    requires org.apache.commons.io;
    requires org.apache.commons.lang3;
    requires org.slf4j;
}