PROJECT REQUIREMENTS
    - in at least one area, catch exceptions and deal with them with a handler
    - use mocks to confirm that recipients and/or messages conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from cxf.[code first cxf bean]
    - your Message body should now consist of java object 
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - use the Routing Slip EIPattern to create dispatch(s) by some kind of reasonable logic
    - consume or modify headers of your message as part of this 'reasonable logic'
FOR EXTRA CREDIT:
    - modify to create your camel contex in java
    - add a script, or manually if only option, deploying to Fabric8
    - write your routes in xml, unless you already did in your first pass