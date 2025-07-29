# Base image with Tomcat and JDK 11
FROM tomcat:9.0-jdk11

# Clean default apps (optional but cleaner)
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy your WAR file to ROOT.war so it auto-deploys
COPY target/HostelManagementSystem.war /usr/local/tomcat/webapps/ROOT.war

# Expose port 8080
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]
