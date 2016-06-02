Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area, catch exceptions and deal with them with a handler
    - use mocks to confirm that recipients and/or messages conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from file:JSON_STOCK
    - your Message body should now consist of JSON file contents 
    - to JMS endpoint
    [2nd route]
    - from JMS endpoint
    - FTP file to a specified folder
    - log as FTP'd to a folder and identify name of file in the log
FOR EXTRA CREDIT:
    - modify to create your camel contex in java, within your testt
    - add a script, or manually if only option, deploying to Fabric8
    - write your routes in xml, unless you already did in your first pass



