module org.easysdi.extract.plugins.validation {
    provides org.easysdi.extract.plugins.common.ITaskProcessor
            with org.easysdi.extract.plugins.validation.ValidationPlugin;

    requires org.easysdi.extract.commonInterface;

    requires org.apache.commons.io;
    requires org.apache.commons.lang3;
    requires org.slf4j;
}