#!/bin/sh

PROTOC_HOME=/media/admax/T-SSD/TTL/protoc-3.7.0

compile() {
	CMD="$PROTOC_HOME/bin/protoc -I=. --java_out=./src/main/java $1"
	$CMD
}

compile "./protobuf/bean/*"
compile "./protobuf/request/*"
compile "./protobuf/response/*"