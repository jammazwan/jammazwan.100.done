Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - default to the normal exception handling provided
    - use mocks to confirm that recipients and/or messages conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from file:CSV_TRANS
    - unmarshall to [java object model] with bindy 
    - your Message body should now consist of java object 
    - transform body here with anonymous inner class Processor 
    - exit transform with body as a string 
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - FTP this to a named folder, using the file name of 'Important', suffixed with a timestamp, and '.txt'
FOR EXTRA CREDIT:
    - modify to create your camel contex in blueprint.xml
    - write your routes in xml, unless you already did in your first pass



