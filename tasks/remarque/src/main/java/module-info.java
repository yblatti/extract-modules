module org.easysdi.extract.plugins.remark {
    provides org.easysdi.extract.plugins.common.ITaskProcessor
            with org.easysdi.extract.plugins.remark.RemarkPlugin;

    requires org.easysdi.extract.commonInterface;

    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires org.apache.commons.io;
    requires org.apache.commons.lang3;
    requires org.slf4j;
}