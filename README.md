Simple Java spring boot project with hibernate and 1 unit test, which checks data exchange capability with DB

Mission is train CI/CD flow by different ways.

**CI: Travis**
- Environment: PostgreSQL 9.x
- Executing deployed sql for test DB pre Init
- Unit test execution
- Docker image building and uploading

**Docker:**
- Dockerfile tool building image with: PostgreSQL 10, JRE
- Executes deployed sql for test DB pre Init
- Starts after run DB host and my application automatically
- New image uploaded to hub.docker.com and when copied to Heroku

Flow sequence:
1. Commit to dev branch and create the pull request
2. Travis do:
	- Download all dependencies
	- Pre init SQL file execution for PostgreSQL 
	- Execution of "mvn package" command: compile, test execution, jar building
	- Building Docker image:
		- Download image postgres from Docker Hub
		- JRE install
		- Coping JAR assembly for created directory
		- Coping pre init SQL file to specific directory, where postgres executes all files during host starting procedure
		- Entry point modification: DB host should be started automatically with all necessary settings, and JAR also should be run
	- Pushing complete image to Docker Hub and to Heroku repository
	- Deploying image on Heroku cloud
3. New changes now are accessible by link in internet