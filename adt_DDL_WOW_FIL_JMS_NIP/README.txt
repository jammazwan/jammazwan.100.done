Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area or process, utilize the Dead Letter approach
    - use the "act surprised method" and do no testing of any sort
PSEUDOCODE FOR ROUTES
    [1st route]
    - from file:JSON_BANK
    - unmarshall to [java object model] with jackson 
    - your Message body should now consist of java object 
    - transform body here with Processor bean, declared in Camel Context as a ref, not a URI 
    - exit transform with body as a string 
    - to JMS endpoint
    [2nd route]
    - from JMS endpoint
    - send this message via JMS to something that sounds important
FOR EXTRA CREDIT:
    - modify to create your camel contex in java
    - write your routes in xml, unless you already did in your first pass



