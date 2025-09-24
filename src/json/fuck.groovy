package json

import groovy.json.JsonSlurper

static void main(String[] args) {
    def jsonslurper = new JsonSlurper()
    def lst = jsonslurper.parseText('{"list": [1, 2, 3, 4]}')
    println lst
}