package com.homefood.controller

class Vendor {
    static searchable = true

    long latitude
    long longitute
    long id
    String name
    Date dateOfReg
    static constraints = {
        id(nullable: false)
        name(nullable: false)
        dateOfReg(nullable: false)
        latitude(nullable: false)
        longitute(nullable: false)
    }
    static mapping = {
        cache true
        autoImport false
        batchSize 10
    }
}
