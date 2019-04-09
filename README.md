# DCP-Test-Generator
The dcp-test-generator generates from a dcp slave description a graph containing test cases which tests a dcp slave implmementation. The generated file can then be used by the DCP-Tester to execute the tests. 

Take a look at [test-coverage](https://github.com/ChKater/dcp-test-generator/wiki/Test-Coverage) to see which parts of the dcp protocol will be tested. 

### Usage of the DCP-Test-Generator
```
usage: dcp-test-generator
 -dcpx <arg>              Path to dcpx file of the DCP slave which shall
                          be tested.
 -extension <arg>         Path to extension file, with which the template
                          will be extended. If not set the template will
                          be determined by the other arguments
                          automatically.
 --host <arg>             Host of the DCP slave. Needs to be set if
                          UDP/TCP  is selected and the slave description
                          does not specify a IP address for UDP/TCP .
 -out <arg>               File where the generated test procedure will be
                          saved. Default value: File name based on slave
                          name and choosed options.
 --port <arg>            UDP/TCP port of the DCP slave. Needs to be set
                          if UDP/TCP is selected and the slave description
                          does not specify a port for UDP/TCP .
 -TCP                     Generate test procedure for TCP/IPv4 as
                          transport protocol
 -template <arg>          Basic Template which will be extended. If not
                          set the template will be determined by the other
                          arguments automatically.
 --Tester.host <arg>      Host of the DCP tester. Default value: 127.0.0.1
 --Tester.port <arg>      UDP/TCP port of the DCP tester. Default value:
                          32000
 -UDP                     Generate test procedure for UDP/IPv4 as
                          transport protocol
```
## Acknowledgement ##
- 2018 - 2019: The work on this tool was done by the Simulation & Modelling Group of the Leibniz Universität Hannover.
- 2015 - 2018: The work on this tool was done in the contex of the ITEA3 Project ACOSAR (N◦14004) by the Simulation & Modelling Group of the Leibniz Universität Hannover. The ACOSAR project was partially funded by the Austrian Competence Centers for Excellent Technologies (COMET) program, the Austrian Research Promotion Agency (FFG), and by the German Federal Ministry of Education and Research (BMBF) under the support code 01lS15033A.
