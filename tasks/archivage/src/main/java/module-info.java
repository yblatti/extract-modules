module org.easysdi.extract.plugins.archive {
    provides org.easysdi.extract.plugins.common.ITaskProcessor
            with org.easysdi.extract.plugins.archive.ArchivePlugin;

    requires org.easysdi.extract.commonInterface;

    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires org.apache.commons.lang3;
    requires org.apache.commons.io;
    requires org.slf4j;
}