import org.easysdi.extract.connectors.common.IConnector;
import org.easysdi.extract.plugins.common.ITaskProcessor;

module org.easysdi.extract.core {
    uses IConnector;
    uses ITaskProcessor;

    requires org.easysdi.extract.commonInterface;

    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires com.google.gson;
    requires commons.collections;
    requires commons.validator;
    requires jakarta.mail;
    requires java.persistence;
    requires java.scripting;
    requires java.transaction;
    requires java.validation;
    requires java.xml;
    requires nz.net.ultraq.thymeleaf.layoutdialect;
    requires org.apache.commons.lang3;
    requires org.apache.tomcat.embed.core;
    requires org.joda.time;
    requires org.locationtech.jts;
    requires org.slf4j;
    requires spring.batch.core;
    requires spring.batch.infrastructure;
    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.core;
    requires spring.data.commons;
    requires spring.data.jpa;
    requires spring.security.config;
    requires spring.security.core;
    requires spring.security.crypto;
    requires spring.security.web;
    requires spring.tx;
    requires spring.web;
    requires spring.webmvc;
    requires thymeleaf;
    requires thymeleaf.extras.springsecurity4;
    requires thymeleaf.spring.data.dialect;
    requires thymeleaf.spring5;
    requires java.xml.bind;
    requires org.hibernate.orm.core;
}