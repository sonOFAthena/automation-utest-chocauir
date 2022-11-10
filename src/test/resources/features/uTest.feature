#Autor: Bob
@stories
Feature: Utest Website
  As a user, I want to sign up on utest website to use its services
  @scenario1
  Scenario: User Fill out the registration form
    Given Bob wants to register to the website
    When he does the registration
      | strName | strLastName | strEmail              | strBirthDate     | strLanguage | strCountry | strCity  | strCityDetail                 | strZipCode | strCellphone | strModelPhone | strSystem  | strPassword                                                      |
      | Bob     | Collen      | bobcollen55@gmail.com | December/31/1990 | Spanish     | Colombia   | Medellin | Medellin, Antioquia, Colombia | 050000     | Huawei       | Y9s           | Android 10 | nqE24aqsow!UfS&N!ZZ2GU*R*Ju!!@^%Upadqp7!QhUGF3R^^cvSQsMib8vY2Z5u |
    Then he gets the registration confirmation message
      | strRegister                                                             |
      | Welcome to the world's largest community of freelance software testers! |