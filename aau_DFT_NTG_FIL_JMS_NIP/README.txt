Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - default to the normal exception handling provided
    - in at least one area, use an integration test to confirm that actual message or recipients conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from file:CSV_SALE
    - your Message body should now consist of CSV file contents 
    - transform body here with Processor bean, declared in Camel Context as a URI, not a ref 
    - exit transform with body as a string 
    - to JMS endpoint
    [2nd route]
    - from JMS endpoint
    - send this message via JMS to something that sounds important
FOR EXTRA CREDIT:
    - modify to create your camel contex in java, within your testt
    - add a script, or manually if only option, deploying to a EAP
    - write your routes in java, unless you already did in your first pass



