Feature: An organization pays bonus to its employees due to outstanding profit

"""
The organization also calculates how much extra money it has to pay
to its employees in the financial year
"""

Scenario: An organization pays bonus based on designations
    Given an organization has 100000 employees
    When it pays bonus according to the designation
        | designation | bonus |  noOfEmployees  |
        |      HR     |  1000 |       100       |
        |      PM     | 50000 |      5000       |
        |   Sr. Dev   | 25000 |     15000       |
        |   Jr. Dev   | 15000 |     79900       |
    Then the organization has to pay total extra Rs. 1823600000 to 100000 employees