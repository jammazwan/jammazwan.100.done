Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area or process, utilize the Dead Letter approach
    - use mocks to confirm that recipients and/or messages conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from timer... with appropriate attributes
    - begin route with Processor bean, declared in Camel Context as a ref, not a URI 
    - your Message body should now consist of java object 
    - to JMS endpoint
    [2nd route]
    - from JMS endpoint
    - use the Wire-Tap EIPattern to log a relevant comment about this message
FOR EXTRA CREDIT:
    - modify to create your camel contex in java, within your testt
    - write your routes in java, unless you already did in your first pass



