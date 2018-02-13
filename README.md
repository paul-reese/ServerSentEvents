# ServerSentEvents

## check out code

## maven install
`$ mvn clean install`

## cf push
`cf push`


## test endpoint
from `cf push` the route to your application is echo'd to STDOUT. cut and paste that URL into this command, note the output.
`curl -v http://<endpoint>/stock/transaction`
