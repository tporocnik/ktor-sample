# Simple Ktor app

Simple Http-service implemented with Kotlin and Ktor. 

The app  just implements a small Hello-World-service.


### Setup

The skeleton of the app was generated wit the Ktor project generator. You just need to select a name (which then reflects in the package names) and select which engine to use and how configuration should be done. In addition the build system must be specified (Maven or Gradle) No additional plugins needed so far.

I choose Maven and the project can be imported the usual way into an IDE.

### Configuration 

I chose application.conf as place for the settings. (First tries with application.yml didn't work, so I switched). Here you have to set port and the Main class.

	application.conf
	

### Start local

After building with Maven the server can be started wit

     java -jar target\ktor-sample-0.0.1-jar-with-dependencies.jar


### See also 

 * [Project Generator](https://start.ktor.io)