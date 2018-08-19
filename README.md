# line-bot-spring-boot-medium

[![Build Status](https://travis-ci.org/iphayao/line-bot-spring-boot-medium.svg?branch=master)](https://travis-ci.org/iphayao/line-bot-spring-boot-medium)

Code example in [medium](https://medium.com/@phayao/%E0%B8%AA%E0%B8%A3%E0%B9%89%E0%B8%B2%E0%B8%87-line-bot-%E0%B8%94%E0%B9%89%E0%B8%A7%E0%B8%A2-spring-boot-step-by-step-607d501cb3a6)'s story **[LINE Bot with Spring Boot Step-by-Step]**


# How to run
After cloned this repo into your local machine, if you want to run locally, follow this step.

## Configuration .yml file
Open application.yml file `src/main/resources/application.yml` replace `channel-token` and `channel-secret` value with your particular values from LINE developer console.

```yml:application.yml
line.bot:
  channel-token: 'Put Your Channel Token Here.'
  channel-secret: 'Put Your Channel Secret Here.'
  handler.path: /callback
```

## Run Spring Boot
To run application in your local machine use this command:

```
$ mvn spring-boot:run

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.4.RELEASE)

........

INFO 35569 --- [main] com.iphayao.linebot.Application   : Started Application in 4.393 seconds (JVM running for 9.056)
```

# Done! 完了
