Feature: An organization recruits few more employees

"""
The organization got more projects from existing or new clients, so it has decided
to recruit more employees to provide services to its customers
"""

Scenario: An organization recruits employees based on designations
    Given an organization has employees
        |      PM     |     5     |
        |   Sr. Dev   |   200     |
        |   Jr. Dev   |  5000     |
    When it recruits 5 more Sr. Dev and 150 more Jr. Dev employees
    Then the organization will have 205 Sr. Dev and 5150 Jr. Dev