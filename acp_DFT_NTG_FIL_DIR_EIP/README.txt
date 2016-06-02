Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - default to the normal exception handling provided
    - in at least one area, use an integration test to confirm that actual message or recipients conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from file:YOUR_OWN_FILE
    - your Message body should now consist of java object 
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - use the Recipient List EIPattern to create dispatch(s) by some kind of reasonable logic
    - consume or modify headers of your message as part of this 'reasonable logic'
FOR EXTRA CREDIT:
    - modify to create your camel contex in java, within your testt
    - add a script, or manually if only option, deploying to Fabric8
    - write your routes in xml, unless you already did in your first pass



