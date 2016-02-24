version=7fb41048dd
rm -f swagger.jar
wget https://jitpack.io/com/github/swagger-api/swagger-codegen/swagger-codegen-cli/${version}/swagger-codegen-cli-${version}.jar -O swagger.jar
java -jar swagger.jar generate -i https://api.insight.ly/v2.2/swagger/docs/v2.2 -l java -o .
