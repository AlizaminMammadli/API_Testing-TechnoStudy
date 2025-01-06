# TMDB API Testing Project

This repository contains a comprehensive testing project for The Movie Database (TMDB) API, utilizing both Postman and Rest Assured. The goal is to ensure that all API endpoints are functioning correctly and meet the specified requirements.

## Table of Contents
- [Getting Started](#getting-started)
- [Test Cases](#test-cases)
- [Postman Testing](#postman-testing)
- [Rest Assured Testing](#rest-assured-testing)
- [Conclusion](#conclusion)

## Getting Started

To get started with this project, ensure you have the following prerequisites:
- **Postman:** For manual API testing.
- **Java Development Kit (JDK):** Required for running Rest Assured tests.
- **Maven:** For managing dependencies and running tests in Rest Assured.
- **TMDB API Access:** You may need an API key for authentication.

## Test Cases

The project includes a wide range of test cases covering various functionalities of the TMDB API. Below is a summary of the key test cases:

1. **User Authentication**
   - **Valid Login:** Ensures that users can log in with valid credentials.
   - **Invalid Login:** Verifies that the API returns an appropriate error message for invalid credentials.

2. **Account Management**
   - **Get Account Details:** Retrieves user account information using a valid authentication token.
   - **Add to Favorites:** Tests adding a movie to the user's favorites list.
   - **Add to Watchlist:** Checks the ability to add a movie to the user's watchlist.

3. **Movie Information Retrieval**
   - **Get Favorite Movies:** Retrieves a list of the user's favorite movies.
   - **Get Rated Movies:** Obtains a list of movies rated by the user.
   - **Get Watchlist Movies:** Accesses the user's current watchlist.
   - **Get Movie Genres:** Fetches a list of official movie genres.
   - **Get Now Playing Movies:** Lists movies currently in theaters.
   - **Get Popular Movies:** Retrieves a list of popular movies.
   - **Get Top Rated Movies:** Obtains a list of the highest-rated movies.
   - **Get Upcoming Movies:** Lists movies scheduled for future release.
   - **Search for Movies:** Allows searching for movies based on a query.

4. **User Interaction with Movies**
   - **Get Movie Details:** Retrieves detailed information about a specific movie using its ID.
   - **Add Movie Rating:** Tests adding a user rating to a movie.
   - **Delete Movie Rating:** Verifies the functionality of removing a rating for a movie.

5. **Error Handling**
   - **Unauthorized Access:** Tests the API's response when attempting to access resources without proper authentication.

## Postman Testing

Postman was used for manual API testing, allowing for exploratory testing and quick validation of endpoints. The project includes a Postman collection with all the defined test cases, which can be easily imported into Postman.

### Features of Postman Testing:
- **Organized Collections:** Grouping related requests for better management.
- **Environment Variables:** Simplifying the management of different API keys and endpoints.
- **Automated Tests:** Utilizing Postman's testing features to validate response codes, headers, and body content.

## Rest Assured Testing

Rest Assured was employed for automated testing of the TMDB API. This allows for regression testing and continuous integration, ensuring that the API consistently meets the specified requirements.

### Features of Rest Assured Testing:
- **Fluent Interface:** Makes it easy to write clear and readable tests in Java.
- **Comprehensive Assertions:** Allows validation of response data, status codes, and headers.
- **Integration with CI/CD:** Supports integration with build tools like Maven, enabling automated test execution in continuous integration environments.
