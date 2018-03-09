package com.homefood.controller

class BootStrap {

    def init = { servletContext ->
        environments {
            production {
                servletContext.setAttribute("env", "prod")
            }
            development {
                servletContext.setAttribute("env", "dev")
            }
        }
        servletContext.setAttribute("foo", "bar")
    }
    def destroy = {
    }
}
