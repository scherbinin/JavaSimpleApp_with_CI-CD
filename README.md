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