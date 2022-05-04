FROM tomcat:jre17-temurin

# Copy configuration
RUN mv /usr/local/tomcat/webapps.dist/* /usr/local/tomcat/webapps/
#COPY conf/tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml
COPY conf/context.xml /usr/local/tomcat/conf/context.xml
#COPY conf/manager-context.xml /usr/local/tomcat/webapps/manager/META-INF/context.xml
COPY conf/setenv.sh /usr/local/tomcat/bin/setenv.sh
RUN chmod +x /usr/local/tomcat/bin/setenv.sh
RUN mkdir -p /var/extract/orders
RUN mkdir -p /var/log/extract
EXPOSE 8080
#CMD ["catalina.sh", "start"]