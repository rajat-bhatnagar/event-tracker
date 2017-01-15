# event-tracker
===================
An Application to track our events built using Spring MVC 4/ JSP/ Bare Bones Angular REST Client

> **URI's for event-tracker application #**
> - http://localhost:8080/event-tracker/event.html (Main Page)
> - http://localhost:8080/event-tracker/index.html ( Other pages(Add Attendee, Add Event) redirect to this page on happy path)
> - http://localhost:8080/event-tracker/attendee.html ( Intent is to demonstrate Internationalization (English/Spanish) and validation via a custom Constraint Validator(See code for specifics)
> - http://localhost:8080/event-tracker/pdfs/creative-commons.pdf 
> - http://localhost:8080/event-tracker/events.json (Shows Events in JSON on the browser)
> - http://localhost:8080/event-tracker/eventReports.jsp ( Bare Bones Angular Client that shows a list of events)

Project Structure
===================

├── README.md
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── coding
│   │   │           └── thoughtworks
│   │   │               ├── Annotation
│   │   │               │   └── Phone.java
│   │   │               ├── Validator
│   │   │               │   └── PhoneConstraintValidator.java
│   │   │               ├── WebAppInitializer.java
│   │   │               ├── WebConfig.java
│   │   │               ├── controller
│   │   │               │   ├── AttendeeController.java
│   │   │               │   ├── EventController.java
│   │   │               │   ├── EventsRestController.java
│   │   │               │   └── HelloController.java
│   │   │               └── model
│   │   │                   ├── Attendee.java
│   │   │                   └── Event.java
│   │   ├── resources
│   │   │   ├── application.properties
│   │   │   ├── messages_en.properties
│   │   │   └── messages_es.properties
│   │   └── webapp
│   │       ├── WEB-INF
│   │       │   ├── jsp
│   │       │   │   ├── attendee.jsp
│   │       │   │   ├── event.jsp
│   │       │   │   └── hello.jsp
│   │       │   └── pdf
│   │       │       └── creative-commons.pdf
│   │       ├── eventReports.jsp
│   │       ├── events.js
│   │       └── index.jsp