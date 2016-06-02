Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area, catch exceptions and deal with them with a handler
    - use the "act surprised method" and do no testing of any sort
PSEUDOCODE FOR ROUTES
    [1st route]
    - from cxf.[contract first cxf bean]
    - your Message body should now consist of java object 
    - transform body here with anonymous inner class Processor 
    - exit transform with body as JSON 
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - FTP file to a specified folder
    - log as FTP'd to a folder and identify name of file in the log
FOR EXTRA CREDIT:
    - modify to create your camel contex in java
    - write your routes in xml, unless you already did in your first pass



