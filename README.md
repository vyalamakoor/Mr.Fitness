# Mr.Fitness

This application is designed to help users track and manage their daily fitness goals effectively. It reminds users to maintain a balanced diet by ensuring that each meal contains the required nutritional value. The app monitors daily nutrient intake and alerts users if any essential nutrients are lacking.

In addition, it provides monthly reports with insights and personalized suggestions to improve overall health and fitness. The application also supports daily workout routines based on a customized schedule created according to the user's preferences and goals. Furthermore, it offers helpful diet tips and meal planning guidance tailored to individual fitness objectives.



**1. **users** Table
**Stores user profile information.


| Column     | Type      | Description                   |
| ---------- | --------- | ----------------------------- |
| id         | Long (PK) | User ID                       |
| name       | String    | User name                     |
| email      | String    | Login email                   |
| password   | String    | Password                      |
| age        | Integer   | Age                           |
| gender     | String    | Male/Female                   |
| height     | Double    | Height                        |
| weight     | Double    | Current weight                |
| goal       | String    | Weight loss / Gain / Maintain |
| created_at | Timestamp | Account creation date         |

2. **goals** Table

Stores fitness goals for the user.

| Column         | Type      | Description       |
| -------------- | --------- | ----------------- |
| id             | Long (PK) | Goal ID           |
| user_id        | FK        | Reference to user |
| target_weight  | Double    | Target weight     |
| daily_calories | Integer   | Required calories |
| daily_protein  | Integer   | Required protein  |
| daily_carbs    | Integer   | Required carbs    |
| daily_fat      | Integer   | Required fat      |
| start_date     | Date      | Goal start        |
| end_date       | Date      | Goal end          |

3. **Meals** Table

Stores meal information (Breakfast/Lunch/Dinner).

| Column    | Type      | Description                  |
| --------- | --------- | ---------------------------- |
| id        | Long (PK) | Meal ID                      |
| user_id   | FK        | User reference               |
| meal_type | String    | Breakfast/Lunch/Dinner/Snack |
| meal_date | Date      | Meal date                    |
| food_name | String    | Food item                    |
| quantity  | Double    | Quantity consumed            |

4. **Nutrients** Table

Stores nutritional values for each food.

| Column    | Type      | Description   |
| --------- | --------- | ------------- |
| id        | Long (PK) | Nutrient ID   |
| food_name | String    | Food name     |
| calories  | Double    | Calories      |
| protein   | Double    | Protein       |
| carbs     | Double    | Carbohydrates |
| fat       | Double    | Fat           |
| fiber     | Double    | Fiber         |


5. Daily Nutrient Tracker

Tracks daily nutrient intake.

| Column         | Type      | Description    |
| -------------- | --------- | -------------- |
| id             | Long (PK) | Tracker ID     |
| user_id        | FK        | User reference |
| date           | Date      | Tracking date  |
| total_calories | Double    | Total calories |
| total_protein  | Double    | Protein intake |
| total_carbs    | Double    | Carb intake    |
| total_fat      | Double    | Fat intake     |

6.  Monthly Reports Table

Stores monthly summary.

| Column             | Type      | Description   |
| ------------------ | --------- | ------------- |
| id                 | Long (PK) | Report ID     |
| user_id            | FK        | User          |
| month              | Integer   | Month         |
| year               | Integer   | Year          |
| avg_calories       | Double    | Avg calories  |
| workouts_completed | Integer   | Workouts      |
| weight_change      | Double    | Weight change |


**Tech Stack:**
Java
Spring
springboot
Hibernate
Spring security
Java script
CSS
HTML
MySQL
GraphQL(Migrate later)
Spring AI
Redis Cache
AWS
Jenkins
Docker
----------------------------------------------------------------------------------------------------------------------
Date : March 14
Karthik : Implement session login using spring security.
Vamsi : Implement User and goal registration.



