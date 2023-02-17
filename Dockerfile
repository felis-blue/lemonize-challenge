FROM alpine:3.14
RUN apk add -U --no-cache bash openjdk11-jre

WORKDIR /opt/lemonize-challenge
ADD lemonize-challenge.tar.gz .
EXPOSE 9000

ENV APPLICATION_SECRET "[;3N9/JMA5T=[Y210aVU>l]bvak9tR0r@]iU0HC^;^U2GvxVmVtM70IdN@>B2YJ"

ENTRYPOINT ["bin/lemonize-challenge", "-J--add-opens", "-Jjava.base/java.lang=ALL-UNNAMED"]
