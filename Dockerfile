FROM websphere-liberty

ENTRYPOINT ["/opt/ibm/wlp/bin/server", "run", "defaultServer"]
RUN installUtility install --acceptLicense defaultServer
ADD server.xml /opt/ibm/wlp/usr/servers/defaultServer/
ADD PropertiesByRest.war /opt/ibm/wlp/usr/servers/defaultServer/apps
RUN chmod 766 -R  /opt/ibm/wlp/
RUN chgrp -R 0 /opt/ibm/wlp && \
    chmod -R g=u /opt/ibm/wlp 
