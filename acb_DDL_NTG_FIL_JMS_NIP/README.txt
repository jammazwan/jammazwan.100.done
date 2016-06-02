Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area or process, utilize the Dead Letter approach
    - in at least one area, use an integration test to confirm that actual message or recipients conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from file:YOUR_OWN_FILE
    - to JMS endpoint
    [2nd route]
    - from JMS endpoint
    - FTP file to a specified folder
    - log as FTP'd to a folder and identify name of file in the log
FOR EXTRA CREDIT:
    - modify to create your camel contex in java
    - add a script, or manually if only option, deploying to a Karaf
    - write your routes in xml, unless you already did in your first pass



