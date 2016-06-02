Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area or process, utilize the Dead Letter approach
    - use the "act surprised method" and do no testing of any sort
PSEUDOCODE FOR ROUTES
    [1st route]
    - from timer... with appropriate attributes
    - begin route with Processor bean, declared in Camel Context as a URI, not a ref 
    - your Message body should now consist of java object 
    - transform body here with Processor bean, declared in Camel Context as a URI, not a ref 
    - exit transform with body as XML 
    - to JMS endpoint
    [2nd route]
    - from JMS endpoint
    - use the Aggregator EIPattern to create dispatch(s) by some kind of reasonable logic
    - AND use body of your message as part of this 'reasonable logic
FOR EXTRA CREDIT:
    - modify to create your camel contex in blueprint.xml
    - add a script, or manually if only option, deploying to a Karaf
    - write your routes in java, unless you already did in your first pass



