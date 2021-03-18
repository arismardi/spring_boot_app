# spring_boot_app
spring boot using stategy pattern

use url below to access the site on a browser: 
1.http://localhost:8080/api/getinterest
2.http://localhost:8080/api/getinterest/<amount>
  ex: http://localhost:8080/api/getinterest/100


Build docker image:
docker build -f Dockerfile -t arismardiyanto/myapp:1.0 .

Run docker image:
docker run -it -p 8080:8080 arismardiyanto/myapp:1.0
