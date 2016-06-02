Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area or process, utilize the Dead Letter approach
    - use mocks to confirm that recipients and/or messages conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from file:XML_CD
    - your Message body should now consist of XML file contents 
    - to JMS endpoint
    [2nd route]
    - from JMS endpoint
    - FTP file to a specified folder
    - log as FTP'd to a folder and identify name of file in the log
FOR EXTRA CREDIT:
    - modify to use spring for your camel context, if not already in spring
    - write your routes in xml, unless you already did in your first pass



