# cd-quiz-assignment-01
**Running the Application**

* git clone https://github.com/nurzamat/cd-quiz-assignment-01.git
* **cd cd-quiz-assignment-01**
* **./mvnw spring-boot:run**. Alternatively, you can build the JAR file with **./mvnw clean package** and then run the JAR file, as follows:
**java -jar target/quiz-0.0.1-SNAPSHOT.jar**

You can see your quiz application running at http://localhost:8080/api/questions



**Testing the CRUD endpoints**

_Creating a new Question_       
Make a POST request with the JSON body as shown below to http://localhost:8080/api/questions.  
`{
"question":"When was the \"The Beatles\" music band formed? 1. In 1960's, 2. In 1970's.",
"answer":"1"
}`

_Getting the list of questions_  
Make a GET request to http://localhost:8080/api/questions to get all the questions.

_Getting a Question by ID_  
Make a GET request to http://localhost:8080/api/questions/1 specifying the ID of the Question at the end of the URL, in our case ID is 1.

_Updating a Question_  
Make a PUT request to http://localhost:8080/api/questions/1 adding the ID of the question to update in the URL, in our case the ID is 1 and a JSON body with the fields to update.  
`{
"question":"When was the \"The Beatles\" music band formed? 1. In 1960's, 2. In 1970's.",
"answer":"1"
}`

_Deleting a Question_  
Make a DELETE request to http://localhost:8080/api/questions/1 adding to the end of the URL the ID of the question to delete, in our case the ID is 1.

