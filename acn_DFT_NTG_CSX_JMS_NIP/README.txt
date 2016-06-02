PROJECT REQUIREMENTS
    - default to the normal exception handling provided
    - in at least one area, use an integration test to confirm that actual message or recipients conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from cxf.[code first cxf bean]
    - your Message body should now consist of java object 
    - to JMS endpoint
    [2nd route]
    - from JMS endpoint
    - unmarshal object(s) into XML format
    - file into named folder
FOR EXTRA CREDIT:
    - modify to create your camel contex in blueprint.xml
    - write your routes in xml, unless you already did in your first pass