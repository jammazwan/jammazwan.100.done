PROJECT REQUIREMENTS
    - default to the normal exception handling provided
    - use the "act surprised method" and do no testing of any sort
PSEUDOCODE FOR ROUTES
    [1st route]
    - from cxf.[code first cxf bean]
    - your Message body should now consist of java object 
    - to JMS endpoint
    [2nd route]
    - from JMS endpoint
    - use the Aggregator EIPattern to create dispatch(s) by some kind of reasonable logic
    - AND use body of your message as part of this 'reasonable logic
FOR EXTRA CREDIT:
    - modify to create your camel contex in java
    - write your routes in java, unless you already did in your first pass