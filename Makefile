gradle-build:
	./gradlew clean build

proto-gen:
	protoc -I ipay-api/src/main/proto/ --go_out=plugins=grpc:. ipay-api/src/main/proto/*.proto

build: gradle-build proto-gen

run-server:
	bash -c "set -a && source ./environtment.server.sample && set +a && java -jar ./ipay-server/build/libs/ipay-server-0.0.1-all.jar"

run-client:
	bash -c "set -a && source ./environtment.client.sample && set +a && java -jar ./ipay-sample-client/build/libs/ipay-sample-client-0.0.1-all.jar"
