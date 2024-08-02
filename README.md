# CodeClauseInternship_WeatherApi

Overview
WeatherApp is a simple console-based Java application that retrieves and displays current weather information for a given location using the OpenWeatherMap API. This application is developed in NetBeans IDE.

Features:
Retrieves weather data including temperature, humidity, and weather description.
Displays weather information for a user-specified location.

Prerequisites:
1.Java Development Kit (JDK) 8 or higher.
2.NetBeans IDE (optional but recommended).
3.Internet connection to access the OpenWeatherMap API.

Setup Instructions
Step 1: Clone the Repository
Clone the repository to your local machine using the following command:
git clone <repository-url>
Step 2: Open the Project in NetBeans
Launch NetBeans IDE.
Select File > Open Project.
Navigate to the cloned repository directory and open the WeatherApp project.
Step 3: Configure the OpenWeatherMap API Key
Sign up on OpenWeatherMap to get your API key.
Step 4: Build and Run the Project
In NetBeans, right-click on the project in the Projects window.
Select Build.
After building, right-click on the project again and select Run.
Usage
When prompted, enter the name of the location for which you want to retrieve weather data.
The application will display the following weather information:
Location Name
Temperature in Celsius
Humidity in percentage
Weather description

Code Explanation
Main Class: WeatherApp
The WeatherApp class contains the main method and the logic to fetch and display weather data.

Constants
api_url: The URL template for the OpenWeatherMap API with placeholders for the location and the API key.
Methods
main(String[] args): The entry point of the application. It reads the location from the user, fetches weather data, and displays it.
getWeatherData(String api): Makes an HTTP GET request to the specified API URL and retrieves the weather data as a JSON string.
displayWeatherData(String weatherData): Parses the JSON weather data and prints the weather information to the console.
Example:

Enter Location:
London
Location: London
Temperature: 15.00°C
Humidity: 72%
Weather: light rain

Troubleshooting:
1.Ensure you have an active internet connection.
2.Verify that the API key is correctly set in the api_url constant.
3.Check if the location name is spelled correctly.
