FROM gradle:jdk-21-and-22 AS builder

WORKDIR /app
COPY --chown=gradle:gradle . .
RUN gradle build --no-daemon

FROM eclipse-temurin:21-jre AS runtime
ONBUILD CMD [ "echo", "Сборка и запуск произведены. Автор: Быков Владимир Николаевич ИКБО-10-21" ]
LABEL author='Vladimir Bykov IKBO-10-21'

ENV APP_JAR=/app/app.jar
ENV SPRING_DATASOURCE_URL=jdbc:postgresql://postgres:5432/tvksp
ENV SPRING_DATASOURCE_USERNAME=admin
ENV SPRING_DATASOURCE_PASSWORD=admin

RUN mkdir -p /root/static/mirea/
RUN wget -O root/static/mirea/logo.png https://www.mirea.ru/upload/medialibrary/80f/MIREA_Gerb_Colour.png

COPY --from=builder /app/build/libs/TVKSP4-0.0.1-SNAPSHOT.jar $APP_JAR
WORKDIR /app
EXPOSE 8080
CMD ["java", "-jar", "/app/app.jar"]