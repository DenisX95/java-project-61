.DEFAULT_GOAL := build-run

setup:
	./gradlew wrapper --gradle-version 8.8

clean:
	./gradlew clean

build:
	./gradlew clean build

install:
	./gradlew clean install

run-dist:
	./build/install/app/bin/app

run:
	./gradlew run

build-run: build run