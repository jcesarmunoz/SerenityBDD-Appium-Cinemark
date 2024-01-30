@RegisterAndPurchase
Feature: create account cinemark

  @Register
  Scenario Outline: As user I want to create my account in cinemark
    Given John can open the app cinemark colombia
    When John complete section personal information with "<TypePerson>", "<TypeDocument>", "<Names>", "<LastName>", "<Email>", "<MobileNumber>", "<Address>", "<Gender>", "<BirthDate>", "<DocumentNumber>", "<Theater>", "<Password>"
    Then John sees the avatar in the home

    Examples:
      | TypePerson | TypeDocument         | Names | LastName | Gender    | DocumentNumber | BirthDate  | MobileNumber | Address        | Email                          | Password | Theater           |
      | Natural    | Cédula de ciudadanía | John  | Granados | Masculino | 1042658001     | 12/12/1998 | 3213859159   | calle 2#16B-42 | test.Automation.05@yopmail.com | Test123+ | Lab v5 Multiplaza |

  @Login
  Scenario Outline: As user I want to realize login in cinemark
    Given John has an account in cinemark
    When John enters the "<Email>" and "<Password>"
    Then John sees the avatar in the home

    Examples:
      | Email                          | Password |
      | test.Automation.05@yopmail.com | Test123+ |

  @Purchase
  Scenario Outline: As user I want to realize a purchase in cinemark
    Given John has an account in cinemark
    And John enters the "<Email>" and "<Password>"
    When John and Ana want to see the movie in the day "<Day>" at "<Shedule>"
    And They select seats, snacks and city "<City>"
    Then They can make a payment with credit Card "<NumberCard>", "<NameCard>", "<SecurityCode>", "<ExpirationDate>"
    And They can see the code Qr and complete the purchase

    Examples:
      | Email                          | Password | City   | Day | Shedule  | NumberCard       | NameCard   | SecurityCode | ExpirationDate |
      | test.Automation.05@yopmail.com | Test123+ | BOGOTA | Mar | 17:35 PM | 5247081012761500 | DAVIVIENDA | 777          | 1224           |
