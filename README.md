# Web Engineering 2021-2022 / Lab2 RPC over HTTP

Please, go to the [Wiki](https://github.com/UNIZAR-30246-WebEngineering/lab2-rpc-over-http/wiki) in order to get the instructions for this assignment.

## Primary goal

Discover how to run the `server` and the `client`. 
Note that the `server` requires code derived from `translator.xsd`, 
and the `client` requires code derived from a `wsdl` file published by the `server`. 

Next you must ensure that the client show something similar to:
```
Result of translating [hello] is [hola].
```

## Secondary goal (:gift:)

Some ideas for obtaining a :gift: if you are the first that:

- **The server side**: Test the server side [properly](https://docs.spring.io/spring-ws/docs/3.1.1/reference/html/#_server_side_testing)
- **Back to the future**: Upgrade to WSDL 2.0 and SOAP 1.2
- **Armored SOAP**: Secure the endpoint [WS-Security](https://docs.spring.io/spring-ws/docs/3.1.1/reference/html/#security)
- **Let's contract**: Re-implement the project following [Writing Contract-First Web Services tutorial](https://docs.spring.io/spring-ws/docs/3.1.1/reference/html/#tutorial)
- **Do the Google way**: Re-implement the project with [gRPC](https://yidongnan.github.io/grpc-spring-boot-starter/en/)

User name | NIA | CI | Solution |Score
----------|-----|----------|-----|----
[UNIZAR-30246-WebEngineering](https://github.com/UNIZAR-30246-WebEngineering/lab2-rpc-over-http) |30246 | [![Build Status](https://github.com/UNIZAR-30246-WebEngineering/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/UNIZAR-30246-WebEngineering/lab2-rpc-over-http/actions/workflows/ci.yml) | [instructions](https://github.com/UNIZAR-30246-WebEngineering/lab2-rpc-over-http/wiki)
[Diego Marco](https://github.com/dmarcob/lab2-rpc-over-http/tree/work) | 755232 | [![Build Status](https://github.com/dmarcob/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/dmarcob/lab2-rpc-over-http/actions/workflows/ci.yml) | [my solution](https://github.com/dmarcob/lab2-rpc-over-http/blob/work/SOLUTION.md)
[Alejandro Magallón](https://github.com/alecron/lab2-rpc-over-http/tree/work) | 779354 | [![Build Status](https://github.com/alecron/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/alecron/lab2-rpc-over-http/actions/workflows/ci.yml) | [Solution](https://github.com/alecron/lab2-rpc-over-http/blob/work/solucion.md)
[AndoniSalcedo](https://github.com/AndoniSalcedo/lab2-rpc-over-http/tree/work) | 785649 |  [![Build Status](https://github.com/AndoniSalcedo/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/AndoniSalcedo/lab2-rpc-over-http/actions/workflows/ci.yml) | [description](https://github.com/AndoniSalcedo/lab2-rpc-over-http/blob/work/documentacion.md)
[German Garces](https://github.com/fntkg/lab2-rpc-over-http/tree/work) | 757024 | [![Build Status](https://github.com/fntkg/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg?branch=work)](https://github.com/fntkg/lab2-rpc-over-http/actions/workflows/ci.yml) | [solution](https://github.com/fntkg/lab2-rpc-over-http/blob/work/solution.md)
[José Marín](https://github.com/jmarindiez/lab2-rpc-over-http/tree/work) |778148 | [![Build Status](https://github.com/jmarindiez/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/jmarindiez/lab2-rpc-over-http/actions/workflows/ci.yml) | [instructions](https://github.com/jmarindiez/lab2-rpc-over-http/blob/work/instructions.md)
[Jorge Laguna](https://github.com/topopelon/lab2-rpc-over-http/tree/work) | 735550 | [![Build Status](https://github.com/topopelon/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/topopelon/lab2-rpc-over-http/actions/workflows/ci.yml) | [description](https://github.com/topopelon/lab2-rpc-over-http/blob/main/description.md)
[Pablo Jordán](https://github.com/pabloJordan24/lab2-rpc-over-http/tree/work) | 757166 | [![Build Status](https://github.com/pabloJordan24/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/pabloJordan24/lab2-rpc-over-http/actions/workflows/ci.yml) | [Solution](https://github.com/pabloJordan24/lab2-rpc-over-http/blob/work/solution.md)
[Óscar Pueyo](https://github.com/iksopo/lab2-rpc-over-http/tree/work) | 780378 | [![Build Status](https://github.com/iksopo/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/iksopo/lab2-rpc-over-http/actions/workflows/ci.yml) | [solution](https://github.com/iksopo/lab2-rpc-over-http/blob/work/solution.md)
[Jaime Conchello](https://github.com/jaimecb/lab2-rpc-over-http/tree/work) | 776012 | [![Build Status](https://github.com/jaimecb/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/jaimecb/lab2-rpc-over-http/actions/workflows/ci.yml) | [Solution](https://github.com/jaimecb/lab2-rpc-over-http/tree/work/solution.md)
[Tomás Pelayo](https://github.com/Tomenos18/lab2-rpc-over-http/tree/work) | 779691 | [![Build Status](https://github.com/Tomenos18/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/Tomenos18/lab2-rpc-over-http/actions/workflows/ci.yml) | [solution](https://github.com/Tomenos18/lab2-rpc-over-http/blob/work/solucion.md)
[Isaac Velasco Calvo](https://github.com/pkmniako/lab2-rpc-over-http/tree/work) | 758986 | [![Build Status](https://github.com/pkmniako/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/pkmniako/lab2-rpc-over-http/actions/workflows/ci.yml) | [Solution](https://github.com/pkmniako/lab2-rpc-over-http/blob/work/SOLUTION.md)
[Íñigo Aréjula](https://github.com/arejula27/lab2-rpc-over-http)|785370|![Build Status](https://github.com/arejula27/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)|[Solution](https://github.com/arejula27/lab2-rpc-over-http/blob/work/Description.md)
[Fernando Serrano](https://github.com/Feer93/lab2-rpc-over-http/tree/work) | 774840 | [![Build Status](https://github.com/Feer93/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/Feer93/lab2-rpc-over-http/actions/workflows/ci.yml) | [Solution](https://github.com/Feer93/lab2-rpc-over-http/blob/work/Solucion.md) | [**Do the Facebook way**](https://github.com/Feer93/lab2-rpc-over-http/tree/gift) :gift:
[Alejandro Artal](https://github.com/Alejandro-Artal/lab2-rpc-over-http/tree/work) |775929 | [![Build Status](https://github.com/Alejandro-Artal/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/Alejandro-Artal/lab2-rpc-over-http/actions/workflows/ci.yml) | [solution](https://github.com/Alejandro-Artal/lab2-rpc-over-http/blob/work/solution.md)
[Carlos Navarro](https://github.com/Lulay7/lab2-rpc-over-http/tree/work) | 780180 | [![Build Status](https://github.com/Lulay7/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/Lulay7/lab2-rpc-over-http/actions/workflows/ci.yml) | [Solution](https://github.com/Lulay7/lab2-rpc-over-http/blob/work/Solucion.md)
[Fede Barcelona](https://github.com/tembleking/lab2-rpc-over-http/tree/work) | 666151 | [![Build Status](https://github.com/tembleking/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/tembleking/lab2-rpc-over-http/actions/workflows/ci.yml) | [CONTRIBUTION](https://github.com/tembleking/lab2-rpc-over-http/blob/work/CONTRIBUTION.md)
[María Peña](https://github.com/Keyleth8/lab2-rpc-over-http/tree/work) | 780448 | [![Build Status](https://github.com/Keyleth8/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/Keyleth8/lab2-rpc-over-http/actions/workflows/ci.yml) | [solution](https://github.com/Keyleth8/lab2-rpc-over-http/blob/work/solution.md)
[Diego García Muro](https://github.com/thdgm/lab2-rpc-over-http/tree/work) | 767870 | [![Build Status](https://github.com/thdgm/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/thdgm/lab2-rpc-over-http/actions/workflows/ci.yml) | [Primary goal](https://github.com/thdgm/lab2-rpc-over-http/blob/work/primaryGoal.md)
[Jorge Serrano](https://github.com/zgzserrano/lab2-rpc-over-http/tree/work) | 776453 | [![Build Status](https://github.com/zgzserrano/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/zgzserrano/lab2-rpc-over-http/actions/workflows/ci.yml) | [solution](https://github.com/zgzserrano/lab2-rpc-over-http/blob/work/solution.md)
[Sergio Benítez Mombiela](https://github.com/SergioBenitez755787/lab2-rpc-over-http/tree/work) | 755787 | [![Build Status](https://github.com/SergioBenitez755787/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/SergioBenitez755787/lab2-rpc-over-http/actions/workflows/ci.yml) | [solution](https://github.com/SergioBenitez755787/lab2-rpc-over-http/blob/work/solution.md)
[Alvaro Echavarri](https://github.com/aechavarris/lab2-rpc-over-http) |737400 | [![Build Status](https://github.com/aechavarris/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/aechavarris/lab2-rpc-over-http/actions/workflows/ci.yml) | [explanation](https://github.com/aechavarris/lab2-rpc-over-http/blob/work/explanation.md)
[Felipe Nonay](https://github.com/Keyleth8/lab2-rpc-over-http/tree/work) | 734941 | [![Build Status](https://github.com/Keyleth8/lab2-rpc-over-http/actions/workflows/ci.yml/badge.svg)](https://github.com/fnonay/lab2-rpc-over-http/actions/workflows/ci.yml) | [solution](https://github.com/fnonay/lab2-rpc-over-http/blob/work/solution.md)
