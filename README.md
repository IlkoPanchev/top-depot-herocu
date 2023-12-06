# Top Depot
Java Spring Thymeleaf MVC Web App. Deployed and available for test in Heroku.   
After accessing the login link the page will be accessible in about 30-60 sec. This time is needed to "wake up" application(a feature of the subscription plan in Heroku). 
Link to the login page: https://top-depot-09e0c0c3e37a.herokuapp.com/login  

Top Depot is a small warehouse application created as a coursework at the end of Spring Advanced module in SoftUni.  
The main idea is that managers can create orders and these orders can be processed and completed by ordinary employees. Newly created order will be automatically deleted by scheduled CRON job if its status has not been changed within a week.
All actions user-order are recorded in a log file(implemented with AOP).
Sorting, pagination and different types of reports based on Google charts are available for managers and employees.  

Credentials:  
- &emsp;admin:  
&emsp;user: admin &emsp; pass: aaa  

- &emsp;manager:  
&emsp;user: manager_1 &emsp; pass: mmm  

- &emsp;employee:  
&emsp;user: user_1 &emsp; pass: uuu


Roles:
- admin
- manager
- employee
  
Actions:  

&emsp;Admin:  
- register new user
- edit info;  add/remove role; block user
- view statistic of the incoming http requests
- view statistic of the unauthorized requests  
- all available actions for managers and employees
  
&emsp;Manager:  
- add/edit/block category
- add/edit/block supplier
- add/edit/block item
- add/edit/block customer
- create/edit/complete/incomplete/archive order
- create reports
  
&emsp;User:
- complete order
- view archived orders

&emsp;Reports:
- orders status
- best supplier by turnover
- best item by turnover
- last week turnover
- supplier turnover for a given period
- customer turnover for a given period
