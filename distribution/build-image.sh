 #!/bin/sh

set -o
set -u

mvn -f pom.xml clean package
docker build --platform linux/amd64 -t wisemapping/wisemapping:latest -f distribution/Dockerfile wise-webapp/target/
