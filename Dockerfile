FROM adoptopenjdk:16-jre-hotspot
RUN mkdir /opt/app
COPY target/sv2021-jvjbf-kepesitovizsga-1.0-SNAPSHOT.jar /opt/app/sv2021-jvjbf-kepesitovizsga-1.0-SNAPSHOT.jar
CMD ["java", "-jar", "/opt/app/sv2021-jvjbf-kepesitovizsga-1.0-SNAPSHOT.jar"]