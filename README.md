# wsimport-gradle-demo
POC of generating java sources from wsdl with gradle.  
  
type and run following lines step by step in console to make the code alive:   
  
gradle clean  
gradle build  
java -cp "wsimportproject/build/libs/wsimportproject.jar:wscallproject/build/libs/wscallproject.jar" ge.lanmaster.wscallproject.Main
