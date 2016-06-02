PROJECT REQUIREMENTS
    - in at least one area or process, utilize the Dead Letter approach
    - use mocks to confirm that recipients and/or messages conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from cxf.[code first cxf bean]
    - your Message body should now consist of java object 
    - transform body here with Processor bean, declared in Camel Context as a URI, not a ref 
    - exit transform with body as a string 
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - use the Routing Slip EIPattern to create dispatch(s) by some kind of reasonable logic
    - consume or modify headers of your message as part of this 'reasonable logic'
FOR EXTRA CREDIT:
    - modify to use spring for your camel context, if not already in spring
    - add a script, or manually if only option, deploying to a Karaf
    - write your routes in java, unless you already did in your first pass