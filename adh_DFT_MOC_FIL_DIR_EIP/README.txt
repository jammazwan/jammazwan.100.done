Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - default to the normal exception handling provided
    - use mocks to confirm that recipients and/or messages conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from file:XML_MENU
    - your Message body should now consist of XML file contents 
    - transform body here with Processor bean, declared in Camel Context as a ref, not a URI 
    - exit transform with body as XML 
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - use the Recipient List EIPattern to create dispatch(s) by some kind of reasonable logic
    - AND use body of your message as part of this 'reasonable logic
FOR EXTRA CREDIT:
    - modify to create your camel contex in java
    - add a script, or manually if only option, deploying to a EAP
    - write your routes in xml, unless you already did in your first pass



