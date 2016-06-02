Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area, catch exceptions and deal with them with a handler
    - in at least one area, use an integration test to confirm that actual message or recipients conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from file:XML_MENU
    - unmarshall to [java object model] with [jaxb or xstream] 
    - your Message body should now consist of java object 
    - transform body here with Processor bean, declared in Camel Context as a ref, not a URI 
    - exit transform with body as a delimited CSV string 
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - FTP file to a specified folder
    - log as FTP'd to a folder and identify name of file in the log
FOR EXTRA CREDIT:
    - modify to create your camel contex in java
    - add a script, or manually if only option, deploying to Fabric8
    - write your routes in java, unless you already did in your first pass



