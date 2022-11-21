FROM jboss/wildfly:24.0.0.Final

# Create user jota with password jota1234
RUN /opt/jboss/wildfly/bin/add-user.sh admin admin --silent
 
# JBoss ports
EXPOSE 8080 9990 8009
 
# Run
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]