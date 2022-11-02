# eauction-service
Github Link -  https://github.com/AswiniVijay30/eauction-service

## Documents  
1. Swagger URLs:  
    a. Product Mgmt Service - http://localhost:8081/swagger-ui/index.html#/  
    b. Product Audit Service - http://localhost:8082/swagger-ui/index.html#/ 
2. Postman Collection - https://github.com/AswiniVijay30/eauction-service/tree/main/Project%20Documents/ProductManagement.postman_collection.json
3. Screenshots - https://github.com/AswiniVijay30/eauction-service/tree/main/Project%20Documents/  
  
## SECTION A - Setting up the service in local:  
1. Clone the project in local using the command : git clone https://github.com/AswiniVijay30/eauction-service.git   
2. Open STS IDE  
3. File -> Import -> Existing Maven Project -> Select Tweet Repository Folder -> Finish  
4. Clean and Build the project as shown in SECTION B  
  
## SECTION B - Maven Build:  
1. Go to: Run -> Run Configurations -> Maven Build  
2. Enter the properties as shown below for the respective services  
3. Product Mgmt Service:  
![image](https://user-images.githubusercontent.com/86978327/199277440-6910db59-0b10-4318-8829-d3d5d753f1b6.png)
 
  
4. Product Audit Service:  
![image](https://user-images.githubusercontent.com/86978327/199278112-db4122d9-bda2-422f-a838-5ec5a7d5bbbe.png)
  
  
5. Right click on the service in the Package Explorer and select: Maven -> Update Project -> Check Update project configuration from pom.xml, Refresh workspace   resources from  local filesystem, Clean projects -> Ok  
6. Right click on the service in the Package Explorer and select: Refresh  
7. Do 5. and 6. for all services  
  
## SECTION C - Running the services in STS without Docker:  
1. Update auth.client.url in the tweet service application.properties  
2. Perform Maven clean and build for all the services as shown in SECTION B  
3. Go to: Window -> Show View -> Boot Dashboard  
4. Start the services through Boot Dashboard in the following order:  
    Product mgmt service -> Product audit service   
  
## SECTION D - Running the services with Docker:  
1. Update auth.client.url in the Product mgmt service application.properties  
2. Perform Maven clean and build for all the services as shown in SECTION B   
3. Run the following commands in the outermost TweetRepository folder where docker-compose.yml is present:  
      a. docker-compose build  
      b. docker compose up  
      c. To Stop: Ctrl + C (and/or) docker compose down  
 [  
 Note: If you get this error: Elasticsearch: Max virtual memory areas vm.max_map_count [65530] is too low, increase to at least [262144]  
 Open Windows Powershell and enter the following commands:  
 a. wsl -d docker-desktop  
 b. sysctl -w vm.max_map_count=262144  
 ]  
  
## SECTION E - Checking Sonar Report:  
1. Go to StartSonar.bat location ( Eg. C:\Program Files\sonarqube-9.4.0.54424\bin\windows-x86-64)  
2. Run StartSonar.bat  
3. Go to tweet service folder and run the following command:  
   mvn clean verify sonar:sonar -Dsonar.projectKey=TweetAppLocal -Dsonar.host.url=http://localhost:9000 -Dsonar.login=4750b9fc8471246357269fb6aa81ed9e9f9c710d  
4. Open http://localhost:9000 and enter username = 'guest' and password = 'guest' to see the Sonar Report  
    
## SECTION F - Generating Maven surefire report:  
1. Go to tweet service folder and run the following commands:  
    a. mvn site  
    b. mvn surefire-report:report  
    c. mvn site -DgenerateReports=false  
2. Open /tweet-service/target/site/surefire-report.html in a browser  
  
  
## SECTION H - Setting up ELK:  
1. Start the Docker containers as given in SECTON D  
2. Open http://localhost:5601 to view the Kibana console in the browser  
3. Go to: Management -> Index Patterns -> Create Index Pattern  
4. Enter 'logstash-*' in the Index Pattern field and click Next step  
5. Select @timestamp in time filter field name and click Create Index Pattern  
6. Go to: Discover (to see the logs)  
7. On the left hand side under 'Available Fields' add 'message' field to get the logged messages as follows  
  ![image](https://user-images.githubusercontent.com/86978327/199468748-ad7a8506-7c38-458e-b310-c230f1b6086d.png)
 
    

