<h1>Issue</h1>
When the Output of Lambda function is from package:

```java
package com.amazonaws.services.lambda.runtime.events;
```

<h1>Error</h1>

```json
{
  "errorMessage": "Cannot invoke \"org.springframework.messaging.Message.getPayload()\" because \"msg\" is null",
  "errorType": "java.lang.NullPointerException",
  "stackTrace": [
    "org.springframework.cloud.function.adapter.aws.AWSLambdaUtils.extractPayload(AWSLambdaUtils.java:152)",
    "org.springframework.cloud.function.adapter.aws.AWSLambdaUtils.generateOutput(AWSLambdaUtils.java:216)",
    "org.springframework.cloud.function.adapter.aws.AWSLambdaUtils.generateOutputFromObject(AWSLambdaUtils.java:208)",
    "org.springframework.cloud.function.adapter.aws.FunctionInvoker.handleRequest(FunctionInvoker.java:92)"
  ]
}
```
<h1>Logs</h1>

```
14:24:48.536 [main] INFO org.springframework.cloud.function.utils.FunctionClassUtils -- Main class: class com.example.SpringCloudAdapterAWS.SpringCloudAdapterAWSApplication
.   ____          _            __ _ _
/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
'  |____| .__|_| |_|_| |_\__, | / / / /
=========|_|==============|___/=/_/_/_/
:: Spring Boot ::                (v3.4.0)
2024-11-28T14:24:49.364Z  INFO 2 --- [SpringCloudAdapterAWS] [           main] o.s.c.f.a.aws.CustomRuntimeInitializer   : AWS Handler: org.springframework.cloud.function.adapter.aws.FunctionInvoker
2024-11-28T14:24:49.397Z  INFO 2 --- [SpringCloudAdapterAWS] [           main] c.e.S.SpringCloudAdapterAWSApplication   : Starting SpringCloudAdapterAWSApplication using Java 17.0.13 with PID 2 (/var/task/lib/SpringCloudAdapterAWS-0.0.1-SNAPSHOT-plain.jar started by sbx_user1051 in /var/task)
2024-11-28T14:24:49.398Z  INFO 2 --- [SpringCloudAdapterAWS] [           main] c.e.S.SpringCloudAdapterAWSApplication   : No active profile set, falling back to 1 default profile: "default"
2024-11-28T14:24:50.364Z  INFO 2 --- [SpringCloudAdapterAWS] [           main] c.e.S.SpringCloudAdapterAWSApplication   : Started SpringCloudAdapterAWSApplication in 1.678 seconds (process running for 2.216)
2024-11-28T14:24:50.373Z  INFO 2 --- [SpringCloudAdapterAWS] [           main] o.s.c.f.adapter.aws.FunctionInvoker      : Locating function: 'sampleFunction'
2024-11-28T14:24:50.383Z  INFO 2 --- [SpringCloudAdapterAWS] [           main] o.s.c.f.adapter.aws.FunctionInvoker      : Located function: 'sampleFunction'
START RequestId: 563ce6f4-60aa-41bb-82a4-1bb31a77d6c4 Version: $LATEST
2024-11-28T14:24:50.514Z  INFO 2 --- [SpringCloudAdapterAWS] [           main] o.s.c.f.adapter.aws.AWSLambdaUtils       : Received: {"id":"cdc73f9d-aea9-11e3-9d5a-835b769c0d9c","detail-type":"Scheduled Event","source":"aws.events","account":"123456789012","time":"1970-01-01T00:00:00Z","region":"us-east-1","resources":["arn:aws:events:us-east-1:123456789012:rule/ExampleRule"],"detail":{}}
Received event: {account: 123456789012,region: us-east-1,detail: {},detailType: Scheduled Event,source: aws.events,id: cdc73f9d-aea9-11e3-9d5a-835b769c0d9c,time: 1970-01-01T00:00:00.000Z,resources: [arn:aws:events:us-east-1:123456789012:rule/ExampleRule]}
Cannot invoke "org.springframework.messaging.Message.getPayload()" because "msg" is null: java.lang.NullPointerException
java.lang.NullPointerException: Cannot invoke "org.springframework.messaging.Message.getPayload()" because "msg" is null
	at org.springframework.cloud.function.adapter.aws.AWSLambdaUtils.extractPayload(AWSLambdaUtils.java:152)
	at org.springframework.cloud.function.adapter.aws.AWSLambdaUtils.generateOutput(AWSLambdaUtils.java:216)
	at org.springframework.cloud.function.adapter.aws.AWSLambdaUtils.generateOutputFromObject(AWSLambdaUtils.java:208)
	at org.springframework.cloud.function.adapter.aws.FunctionInvoker.handleRequest(FunctionInvoker.java:92)

END RequestId: 563ce6f4-60aa-41bb-82a4-1bb31a77d6c4
REPORT RequestId: 563ce6f4-60aa-41bb-82a4-1bb31a77d6c4	Duration: 1165.43 ms	Billed Duration: 1166 ms	Memory Size: 512 MB	Max Memory Used: 162 MB	Init Duration: 2252.24 ms	

```