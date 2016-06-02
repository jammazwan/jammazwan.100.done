Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area or process, utilize the Dead Letter approach
    - in at least one area, use an integration test to confirm that actual message or recipients conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from file:JSON_BANK
    - your Message body should now consist of JSON file contents 
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - use the Routing Slip EIPattern to create dispatch(s) by some kind of reasonable logic
    - consume or modify headers of your message as part of this 'reasonable logic'
FOR EXTRA CREDIT:
    - modify to use spring for your camel context, if not already in spring
    - add a script, or manually if only option, deploying to a Docker engine
    - write your routes in java, unless you already did in your first pass



