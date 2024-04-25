class OpenWeatherMapAPI {
    constructor(apiKey) {
      this.apiKey = apiKey;
    }
  
    async fetchData(city) {
      try {
        const response = await fetch(`https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${this.apiKey}&units=metric`);
        if (!response.ok) {
          throw new Error('Failed to fetch weather data');
        }
        const data = await response.json();
        return this.mapToCommonDataModel(data);
      } catch (error) {
        console.error('Error fetching weather data from OpenWeatherMap:', error.message);
        throw error;
      }
    }
  
    mapToCommonDataModel(data) {
      // Map fields from OpenWeatherMap's data model to common data model
      const commonData = {
        temperature: data.main.temp,
        humidity: data.main.humidity,
        // Map other fields as needed
      };
      return commonData;
    }
  }
  
  class WeatherstackAPI {
    constructor(apiKey) {
      this.apiKey = apiKey;
    }
  
    async fetchData(city) {
      try {
        const response = await fetch(`http://api.weatherstack.com/current?access_key=${this.apiKey}&query=${city}`);
        if (!response.ok) {
          throw new Error('Failed to fetch weather data');
        }
        const data = await response.json();
        return this.mapToCommonDataModel(data);
      } catch (error) {
        console.error('Error fetching weather data from Weatherstack:', error.message);
        throw error;
      }
    }
  
    mapToCommonDataModel(data) {
      // Map fields from Weatherstack's data model to common data model
      const commonData = {
        temperature: data.current.temperature,
        humidity: data.current.humidity,
        // Map other fields as needed
      };
      return commonData;
    }
  }
  
  class AccuWeatherAPI {
    constructor(apiKey) {
      this.apiKey = apiKey;
    }
  
    async fetchData(city) {
      try {
        const response = await fetch(`http://dataservice.accuweather.com/currentconditions/v1/${city}?apikey=${this.apiKey}`);
        if (!response.ok) {
          throw new Error('Failed to fetch weather data');
        }
        const data = await response.json();
        return this.mapToCommonDataModel(data);
      } catch (error) {
        console.error('Error fetching weather data from AccuWeather:', error.message);
        throw error;
      }
    }
  
    mapToCommonDataModel(data) {
      // Map fields from AccuWeather's data model to common data model
      const commonData = {
        temperature: data[0].Temperature.Metric.Value,
        humidity: data[0].RelativeHumidity,
        // Map other fields as needed
      };
      return commonData;
    }
  }
  
  class WeatherAPI {
    constructor(openWeatherMapApiKey, weatherstackApiKey, accuWeatherApiKey) {
      this.openWeatherMapAPI = new OpenWeatherMapAPI(openWeatherMapApiKey);
      this.weatherstackAPI = new WeatherstackAPI(weatherstackApiKey);
      this.accuWeatherAPI = new AccuWeatherAPI(accuWeatherApiKey);
    }
  
    async fetchData(city) {
      try {
        // Fetch data from each weather API
        const openWeatherMapData = await this.openWeatherMapAPI.fetchData(city);
        const weatherstackData = await this.weatherstackAPI.fetchData(city);
        const accuWeatherData = await this.accuWeatherAPI.fetchData(city);
  
        // Merge data from all APIs or choose one based on preference
  
        // For simplicity, here we just return data from OpenWeatherMap
        return openWeatherMapData;
      } catch (error) {
        console.error('Error fetching weather data:', error.message);
        throw error;
      }
    }
  }
  
  // Example usage
  const openWeatherMapApiKey = 'your_openweathermap_api_key';
  const weatherstackApiKey = 'your_weatherstack_api_key';
  const accuWeatherApiKey = 'your_accuweather_api_key';
  
  const weatherAPI = new WeatherAPI(openWeatherMapApiKey, weatherstackApiKey, accuWeatherApiKey);
  
  weatherAPI.fetchData('New York')
    .then(commonData => {
      // Use commonData in your mobile application
      console.log('Weather data:', commonData);
    })
    .catch(error => {
      // Handle error
      console.error('Error fetching weather data:', error.message);
    });
  