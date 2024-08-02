
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;
import java.util.Scanner;


public class WeatherApp {
    
    private static final String api_url="http://api.openweathermap.org/data/2.5/weather?q=%s&units=metric&appid=e6beff5f66280464c841a51398ccba31";
    
  

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Location:");
        String location=sc.nextLine();
        String api=String.format(api_url,location);
        String weatherData =getWeatherData(api);
        if(weatherData !=null)
        {
              displayWeatherData(weatherData);           
        }
        else
        {
           System.out.println("Could not retrieve Weather Data!Sorry..😔");     
        }
        
}
    private static String getWeatherData(String api)
    {
        try
        {
            URL url=new URL(api);
            HttpURLConnection con=(HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int responseCode=con.getResponseCode();
            if(responseCode==HttpURLConnection.HTTP_OK)
            {
                
            BufferedReader in =new BufferedReader(new InputStreamReader(con.getInputStream()));
            String input;
            StringBuilder content=new StringBuilder();
            while((input=in.readLine())!=null)
            {
                content.append(input);
            }
            return content.toString();
            }
            else
            {
                System.out.println("GET Request not Worked!!OOPPSS..😢");
            }
        }
        catch(Exception e)
        {
           e.printStackTrace();
          
        }
        return null;
}
    private static void displayWeatherData(String weatherData)
    {
        JSONObject jsonObject = new JSONObject(weatherData);
        String locationName = jsonObject.getString("name");
        JSONObject main = jsonObject.getJSONObject("main");
        double temperature = main.getDouble("temp");
        int humidity = main.getInt("humidity");
        JSONObject weather = jsonObject.getJSONArray("weather").getJSONObject(0);
        String description = weather.getString("description");

        System.out.printf("Location: %s\n", locationName);
        System.out.printf("Temperature: %.2f°C\n", temperature);
        System.out.printf("Humidity: %d%%\n", humidity);
        System.out.printf("Weather: %s\n", description);
    }
    
}