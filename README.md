# DebugServer 

### A debugging web server
This is a mini “Web server” that is useful when you are trying to understand the behavior of HTML forms. The server simply reads all the HTTP data sent to it by the
browser, then returns a Web page with those lines embedded within a PRE element.


### How to run
You typically run DebugServer from the command line, specifying a port to listen on, or accepting the default port of
8088. DebugServer then accepts repeated HTTP requests from clients, packaging all HTTP data sent to it inside a Web page that is returned to the client. In most
cases, the server reads until a blank line is received, indicating the end of GET, HEAD, or most other types of HTTP requests. In the case of POST, however, the server
checks the Content-Length request header and reads that many bytes beyond the blank line.

