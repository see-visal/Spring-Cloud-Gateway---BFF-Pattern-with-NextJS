 
# repos-config
 
# itp-config-repos
 



## Getting started

To make it easy for you to get started with GitLab, here's a list of recommended next steps.

Already a pro? Just edit this README.md and make it your own. Want to make it easy? [Use the template at the bottom](#editing-this-readme)!

## Add your files

* [Create](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#create-a-file) or [upload](https://docs.gitlab.com/ee/user/project/repository/web_editor.html#upload-a-file) files
* [Add files using the command line](https://docs.gitlab.com/topics/git/add_files/#add-files-to-a-git-repository) or push an existing Git repository with the following command:

```
cd existing_repo

git remote add origin https://gitlab.com/see-visal/repos-config.git

git remote add origin https://gitlab.com/see-visal/itp-config-repos.git

git branch -M main
git push -uf origin main
```

## Integrate with your tools


* [Set up project integrations](https://gitlab.com/see-visal/repos-config/-/settings/integrations)
* [Set up project integrations](https://gitlab.com/see-visal/itp-config-repos/-/settings/integrations)


## Collaborate with your team

* [Invite team members and collaborators](https://docs.gitlab.com/ee/user/project/members/)
* [Create a new merge request](https://docs.gitlab.com/ee/user/project/merge_requests/creating_merge_requests.html)
* [Automatically close issues from merge requests](https://docs.gitlab.com/ee/user/project/issues/managing_issues.html#closing-issues-automatically)
* [Enable merge request approvals](https://docs.gitlab.com/ee/user/project/merge_requests/approvals/)
* [Set auto-merge](https://docs.gitlab.com/user/project/merge_requests/auto_merge/)

## Test and Deploy

Use the built-in continuous integration in GitLab.

* [Get started with GitLab CI/CD](https://docs.gitlab.com/ee/ci/quick_start/)
* [Analyze your code for known vulnerabilities with Static Application Security Testing (SAST)](https://docs.gitlab.com/ee/user/application_security/sast/)
* [Deploy to Kubernetes, Amazon EC2, or Amazon ECS using Auto Deploy](https://docs.gitlab.com/ee/topics/autodevops/requirements.html)
* [Use pull-based deployments for improved Kubernetes management](https://docs.gitlab.com/ee/user/clusters/agent/)
* [Set up protected environments](https://docs.gitlab.com/ee/ci/environments/protected_environments.html)

***

# Editing this README

When you're ready to make this README your own, just edit this file and use the handy template below (or feel free to structure it however you want - this is just a starting point!). Thanks to [makeareadme.com](https://www.makeareadme.com/) for this template.

## Suggestions for a good README

Every project is different, so consider which of these sections apply to yours. The sections used in the template are suggestions for most open source projects. Also keep in mind that while a README can be too long and detailed, too long is better than too short. If you think your README is too long, consider utilizing another form of documentation rather than cutting out information.

## Name
Choose a self-explaining name for your project.

## Description
Let people know what your project can do specifically. Provide context and add a link to any reference visitors might be unfamiliar with. A list of Features or a Background subsection can also be added here. If there are alternatives to your project, this is a good place to list differentiating factors.

## Badges
On some READMEs, you may see small images that convey metadata, such as whether or not all the tests are passing for the project. You can use Shields to add some to your README. Many services also have instructions for adding a badge.

## Visuals
Depending on what you are making, it can be a good idea to include screenshots or even a video (you'll frequently see GIFs rather than actual videos). Tools like ttygif can help, but check out Asciinema for a more sophisticated method.

## Installation
Within a particular ecosystem, there may be a common way of installing things, such as using Yarn, NuGet, or Homebrew. However, consider the possibility that whoever is reading your README is a novice and would like more guidance. Listing specific steps helps remove ambiguity and gets people to using your project as quickly as possible. If it only runs in a specific context like a particular programming language version or operating system or has dependencies that have to be installed manually, also add a Requirements subsection.

## Usage
Use examples liberally, and show the expected output if you can. It's helpful to have inline the smallest example of usage that you can demonstrate, while providing links to more sophisticated examples if they are too long to reasonably include in the README.

## Support
Tell people where they can go to for help. It can be any combination of an issue tracker, a chat room, an email address, etc.

## Roadmap
If you have ideas for releases in the future, it is a good idea to list them in the README.

## Contributing
State if you are open to contributions and what your requirements are for accepting them.

For people who want to make changes to your project, it's helpful to have some documentation on how to get started. Perhaps there is a script that they should run or some environment variables that they need to set. Make these steps explicit. These instructions could also be useful to your future self.

You can also document commands to lint the code or run tests. These steps help to ensure high code quality and reduce the likelihood that the changes inadvertently break something. Having instructions for running tests is especially helpful if it requires external setup, such as starting a Selenium server for testing in a browser.

## Authors and acknowledgment
Show your appreciation to those who have contributed to the project.

## License
For open source projects, say how it is licensed.

## Project status
If you have run out of energy or time for your project, put a note at the top of the README saying that development has slowed down or stopped completely. Someone may choose to fork your project or volunteer to step in as a maintainer or owner, allowing your project to keep going. You can also make an explicit request for maintainers.
<<<<<<< HEAD
=======
=======
# 🔧 ITP Config Repository - Complete Configuration

This is a **Git repository** for storing centralized configuration files for all microservices.

## 📁 Complete Structure

```
itp-config-repository/
├── README.md                           # This file
├── application.yaml                    # Common configuration for all services
│
├── account/                            # Account Service configurations
│   ├── account-dev.yml                 # Development environment
│   ├── account-qa.yml                  # QA environment
│   └── account-prod.yml                # Production environment
│
├── customer/                           # Customer Service configurations
│   ├── customer-dev.yml                # Development environment
│   ├── customer-qa.yml                 # QA environment
│   └── customer-prod.yml               # Production environment
│
├── order/                              # Order Service configurations
│   ├── order-dev.yml                   # Development environment
│   ├── order-qa.yml                    # QA environment
│   └── order-prod.yml                  # Production environment
│
├── gateway/                            # Gateway Server configurations
│   ├── gateway-dev.yml                 # Development environment
│   ├── gateway-qa.yml                  # QA environment
│   └── gateway-prod.yml                # Production environment
│
├── identity/                           # Identity Service configurations
│   ├── identity-dev.yml                # Development environment
│   ├── identity-qa.yml                 # QA environment
│   └── identity-prod.yml               # Production environment
│
├── account-service.yaml                # Legacy: Account Service (default profile)
├── customer-service.yaml               # Legacy: Customer Service (default profile)
├── order-service.yaml                  # Legacy: Order Service (default profile)
└── gatewayserver.yaml                  # Legacy: Gateway Server (default profile)
```

---

## 🎯 Purpose

The **Config Server** (port 8888) reads configuration from this repository and serves it to all microservices. This enables:

- ✅ **Centralized Configuration** - All configs in one place
- ✅ **Environment-Specific Settings** - dev, qa, prod
- ✅ **Dynamic Updates** - Change configs without rebuilding
- ✅ **Version Control** - Track configuration changes with Git
- ✅ **Security** - Sensitive data as environment variables

---

## 🚀 How It Works

### **1. Config Server Setup**

The Config Server is configured to read from this repository:

```yaml
# itp-configserver/src/main/resources/application.yaml
spring:
  cloud:
    config:
      server:
        git:
          uri: file://${user.home}/itp-config-repository
          # OR
          uri: https://github.com/your-org/itp-config-repository
```

### **2. Services Fetch Configuration**

Each microservice connects to Config Server on startup:

```yaml
# Service application.yaml
spring:
  application:
    name: account  # Must match config file name
  config:
    import: optional:configserver:http://localhost:8888
  profiles:
    active: dev  # Loads account/account-dev.yml
```

### **3. Configuration Priority**

Config Server loads configurations in this order:
1. `application.yaml` (common to all)
2. `{service-name}/{service-name}-{profile}.yml` (environment-specific)
3. `{service-name}.yaml` (service default)

Example for Account Service with profile `dev`:
- Loads: `application.yaml`
- Loads: `account/account-dev.yml`
- Merges: Properties from both (specific overrides common)

---

## 📋 Environment Profiles

### **Development (dev)**
- Port: Service-specific (20260-20262, 8070, 9999)
- Database: `localhost:5432`
- Logging: `DEBUG` level
- JPA: `ddl-auto: update` (auto-create tables)
- SQL: `show-sql: true` (log SQL queries)

**Use for:** Local development

### **QA (qa)**
- Port: Same as dev
- Database: `localhost:5432` (QA database)
- Logging: `INFO` level
- JPA: `ddl-auto: update`
- SQL: `show-sql: false`

**Use for:** Quality assurance testing

### **Production (prod)**
- Port: Same as dev
- Database: `prod-db-server:5432` (production database)
- Logging: `WARN` level
- JPA: `ddl-auto: validate` (no auto-create)
- SQL: `show-sql: false`
- Passwords: Environment variables (e.g., `${ACCOUNT_DB_PASSWORD}`)
- Eureka: `prefer-ip-address: true`

**Use for:** Production deployment

---

## 🔐 Security Best Practices

### **Sensitive Data**

Production configurations use **environment variables** for sensitive data:

```yaml
# Production config
datasource:
  password: ${ACCOUNT_DB_PASSWORD}  # From environment

jwt:
  secret: ${JWT_SECRET}  # From environment
```

Set environment variables:
```bash
export ACCOUNT_DB_PASSWORD=your-secure-password
export JWT_SECRET=your-256-bit-secret-key
```

### **Git Repository Security**

⚠️ **Never commit:**
- Actual passwords
- API keys
- JWT secrets
- Production credentials

✅ **Always use:**
- Environment variables
- Vault integration
- Encrypted properties

---

## 📊 Configuration Files Overview

### **Account Service** (Port 20260)

| File | Environment | Database | Logging | DDL Auto |
|------|-------------|----------|---------|----------|
| account-dev.yml | Development | localhost | DEBUG | update |
| account-qa.yml | QA | localhost | INFO | update |
| account-prod.yml | Production | prod-db-server | WARN | validate |

### **Customer Service** (Port 20261)

| File | Environment | Database | Logging | DDL Auto |
|------|-------------|----------|---------|----------|
| customer-dev.yml | Development | localhost | DEBUG | update |
| customer-qa.yml | QA | localhost | INFO | update |
| customer-prod.yml | Production | prod-db-server | WARN | validate |

### **Order Service** (Port 20262)

| File | Environment | Database | Logging | DDL Auto |
|------|-------------|----------|---------|----------|
| order-dev.yml | Development | localhost | DEBUG | update |
| order-qa.yml | QA | localhost | INFO | update |
| order-prod.yml | Production | prod-db-server | WARN | validate |

### **Gateway Server** (Port 8070)

| File | Environment | Routes | Logging |
|------|-------------|--------|---------|
| gateway-dev.yml | Development | All services | DEBUG |
| gateway-qa.yml | QA | All services | INFO |
| gateway-prod.yml | Production | All services | WARN |

### **Identity Service** (Port 9999)

| File | Environment | Database | JWT Secret | Logging |
|------|-------------|----------|------------|---------|
| identity-dev.yml | Development | localhost | Hardcoded | DEBUG |
| identity-qa.yml | QA | localhost | Hardcoded | INFO |
| identity-prod.yml | Production | prod-db-server | Env Var | WARN |

---

## 🔧 Common Configuration (application.yaml)

Shared by all services:

```yaml
spring:
  application:
    name: default

management:
  endpoints:
    web:
      exposure:
        include: "*"  # Enable all actuator endpoints

eureka:
  client:
    enabled: true
    service-url:
      defaultZone: http://localhost:8761/eureka/
```

---

## 🚀 Usage Examples

### **1. Start Service with Dev Profile**

```powershell
# Account Service - Development
cd Account-Service
.\gradlew bootRun -Dspring.profiles.active=dev

# Loads: application.yaml + account/account-dev.yml
```

### **2. Start Service with QA Profile**

```powershell
# Customer Service - QA
cd Customer-Service
.\gradlew bootRun -Dspring.profiles.active=qa

# Loads: application.yaml + customer/customer-qa.yml
```

### **3. Start Service with Prod Profile**

```powershell
# Set environment variables first
$env:ACCOUNT_DB_PASSWORD="secure-password"

# Order Service - Production
cd order
.\gradlew bootRun -Dspring.profiles.active=prod

# Loads: application.yaml + order/order-prod.yml
```

### **4. Verify Configuration**

```powershell
# Check what config service loaded
Invoke-WebRequest http://localhost:8888/account/dev

# Response shows merged configuration from:
# - application.yaml
# - account/account-dev.yml
```

---

## 🎯 Configuration Properties by Service

### **Database Configuration**

All services use PostgreSQL with environment-specific settings:

**Development:**
```yaml
datasource:
  url: jdbc:postgresql://localhost:5432/{service}_service
  username: {service}
  password: qwerqwer
```

**Production:**
```yaml
datasource:
  url: jdbc:postgresql://prod-db-server:5432/{service}_service
  username: {service}_prod
  password: ${SERVICE_DB_PASSWORD}  # From environment
```

### **Eureka Registration**

All services register with Eureka:

```yaml
eureka:
  instance:
    instance-id: ${spring.application.name}:${server.port}
    # Production also has:
    prefer-ip-address: true
```

### **JPA/Hibernate Settings**

**Development/QA:**
```yaml
jpa:
  hibernate:
    ddl-auto: update  # Auto-create/update tables
  show-sql: true      # Log SQL queries
```

**Production:**
```yaml
jpa:
  hibernate:
    ddl-auto: validate  # Only validate schema
  show-sql: false       # Don't log SQL
```

---

## 📝 Adding New Service Configuration

### **Step 1: Create Directory**

```bash
mkdir itp-config-repository/newservice
```

### **Step 2: Create Environment Files**

```bash
# newservice-dev.yml
touch itp-config-repository/newservice/newservice-dev.yml

# newservice-qa.yml
touch itp-config-repository/newservice/newservice-qa.yml

# newservice-prod.yml
touch itp-config-repository/newservice/newservice-prod.yml
```

### **Step 3: Add Configuration**

```yaml
# newservice/newservice-dev.yml
server:
  port: 20263

spring:
  application:
    name: newservice

  datasource:
    url: jdbc:postgresql://localhost:5432/newservice_db
    username: newservice
    password: qwerqwer

eureka:
  instance:
    instance-id: ${spring.application.name}:${server.port}
```

### **Step 4: Configure Service**

```yaml
# newservice/src/main/resources/application.yaml
spring:
  application:
    name: newservice
  config:
    import: optional:configserver:http://localhost:8888
  profiles:
    active: dev
```

---

## 🔄 Refreshing Configuration

### **Manual Refresh**

```powershell
# Trigger refresh endpoint
Invoke-WebRequest -Uri http://localhost:20260/actuator/refresh -Method POST
```

### **Automatic Refresh with Spring Cloud Bus**

Add to all services:
```yaml
management:
  endpoints:
    web:
      exposure:
        include: refresh
```

---

## ✅ Verification

### **1. Check Config Server**

```powershell
# Get Account Service dev config
Invoke-WebRequest http://localhost:8888/account/dev

# Get Customer Service qa config
Invoke-WebRequest http://localhost:8888/customer/qa

# Get Gateway prod config
Invoke-WebRequest http://localhost:8888/gatewayserver/prod
```

### **2. Check Service Configuration**

```powershell
# Check service environment
Invoke-WebRequest http://localhost:20260/actuator/env
```

---

## 🎉 Configuration Complete!

Your config repository now has:

✅ **15 environment-specific configurations** (5 services × 3 environments)  
✅ **1 common configuration** (application.yaml)  
✅ **4 legacy configurations** (backward compatibility)  
✅ **Complete documentation**  

**Total: 20 configuration files ready for all environments!**

---

## 📚 Additional Resources

- **Spring Cloud Config Documentation**: https://spring.io/projects/spring-cloud-config
- **Environment Variables Best Practices**: Use Vault or K8s Secrets
- **Git Repository**: Initialize with `git init` for version control

---

**Configuration Status:** ✅ COMPLETE

**All environments configured:** dev, qa, prod

**Ready for:** Development, Testing, Production Deployment

**Security:** Environment variables for sensitive data ✅

>>>>>>> 1d687f7 (test)
>>>>>>> 54db8e0ffc0be44207f1b6b7959cba3b36c1fac1
