Feature: Verify parallel execution is working 

Scenario: Verify logo is visible and redirects to homepage
Given the user is on the Edureka homepage
When the user clicks on the Edureka logo
Then the page should go to "https://www.edureka.co"

Scenario Outline: Verify all links in "Resouces" link navigates correctly
Given the user is on the homepage
When the user clicks on "<icon>" in the navigation under resources from home page
Then the user should be redirected to the "<url>" page
Then goto home page

Examples:
| icon | url | 
| blogs | blog |
| webinars | webinars |

Scenario Outline: Verify all the links works at navbar
Given the user is on the Edureka homepage
When the user clicks on "<button>" in the navigation
Then the user should be redirected to the "<link>" page

Examples:
| button | link |
| All Courses | all-course |
| Corporate Training | corporate-training |