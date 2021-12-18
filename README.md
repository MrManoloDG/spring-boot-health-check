# Spring Actuator Health GUI

This repo contains all the opensource code to maven extension *springactuatorhealthgui*. This is an extension to see, in a more user friendly way, the content of actuator health params in a spring project.

## Usage
Add package generated to the project. Later, it only has to be defined the custom properties to works fine.
You could copy the next ones and adapt it to your project.

```
# Show details of health endpoint
management.endpoint.health.show-details=always

# Use "*" to expose all endpoints, or a comma-separated list to expose selected ones
management.endpoints.web.exposure.include=health,info

management.endpoints.jmx.exposure.include=*
management.health.probes.enabled=true
management.endpoints.web.cors.allowed-origins=*
management.endpoints.web.cors.allowed-methods=OPTIONS, GET, POST
management.endpoints.web.cors.allowed-headers=*

healthgui.url=<your-root-url> # For local for example: http://localhost:8080
```
To testing in local it's not needed to defined `healthgui.url` attribute.

## License
The repository utilizes code licensed under the terms of the Apache Software
License and therefore is licensed under ASL v2 or later.

This source code in this repository is free: you can redistribute it and/or modify it under
the terms of the Apache Software License version 2, or (at your option) any
later version.

This source code in this repository is distributed in the hope that it will be useful, but WITHOUT ANY
WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
PARTICULAR PURPOSE. See the Apache Software License for more details.

You should have received a copy of the Apache Software License along with this
program. If not, see http://www.apache.org/licenses/LICENSE-2.0.html

The source code forked from other open source projects will inherit its license.


