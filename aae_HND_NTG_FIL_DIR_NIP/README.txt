Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area, catch exceptions and deal with them with a handler
    - in at least one area, use an integration test to confirm that actual message or recipients conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from file:CSV_SALE
    - split using camel-csv to List<String> 
    - your Message body should now consist of a list of delimited strings 
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - FTP this to a named folder, using the file name of 'Important', suffixed with a timestamp, and '.txt'
FOR EXTRA CREDIT:
    - modify to create your camel contex in blueprint.xml
    - add a script, or manually if only option, deploying to Fabric8
    - write your routes in java, unless you already did in your first pass



