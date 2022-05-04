FROM tomcat:jre17-temurin
ENV LANG=fr_CH.UTF-8 LANGUAGE=fr_CH:fr LC_ALL=fr_CH.UTF-8
ENV JVM_OPTS="-Xms1024m -Xmx2048m"
RUN mv /usr/local/tomcat/webapps.dist/* /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]