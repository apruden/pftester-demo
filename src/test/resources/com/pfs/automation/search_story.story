Scenario: trader is not alerted below threshold
 
Given user is at homepage
When user inserts <name>
Then result page contains results

Examples:
|name|
|toto|
|alex|