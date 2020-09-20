# spring-cloud-server-client

## Git repo link for server config in `bootstrap.properties` in Server Project
`spring.cloud.config.server.git.uri` = https://github.com/VinayParida/cloud-config-server


### You can do profiling from Client Project in its `bootstrap.propeties`
Here the default is `spring.application.name=config-server-client`
Which you can chnage according to othe properties file. On the above link other properties files are:
- config-server-client-dev.properties
- config-server-client-qa.properties
- config-server-client.properties(default)

You can easily change to other envirnoment like to `dev` easily by `bootstrap.properties` in Client side by simply doing
`spring.application.name=config-server-client-dev`

