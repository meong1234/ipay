gradle-build:
	./gradlew clean build

proto-gen:
	protoc -I ipay-api/src/main/proto/ --go_out=plugins=grpc:. ipay-api/src/main/proto/*.proto

build: gradle-build proto-gen