I used ChatGPT to assist with:

. Understanding and analyzing the functional requirements.

. Identifying and prioritizing risk-based test scenarios.

. Reviewing the API response against the backend data contract (FR-05).

. Drafting detailed UI and API test cases.

. Generating Playwright (Java) automation scripts using the Page Object Model (POM).

. Creating REST Assured API validation examples, including schema, data type, locale, and negative test validations.

. Reviewing the overall project structure and improving documentation.

Modifications Made

During the assignment, the AI-generated responses served as a useful starting point, but they required careful review and refinement to ensure technical accuracy and alignment with the project requirements. The following are two specific examples of modifications that were made:

1. Corrected the Analysis for Practical Exercise 2

The initial AI-generated response incorrectly identified the application's suggestion list as a functional discrepancy. Upon reviewing the application behavior against the stated requirements, it was evident that the suggestion list was functioning as intended and did not represent a defect. This incorrect observation was removed from the defect analysis, and the response was updated to include only genuine discrepancies supported by the application's behavior.

Reasoning:
Defect reports should be based solely on deviations from the specified requirements or expected functionality. Reporting correct behavior as a defect can mislead stakeholders, reduce confidence in the testing process, and result in unnecessary investigation by the development team. Verifying AI-generated observations against the application requirements ensured the final analysis remained accurate and reliable.

2. Refined the AI-Generated Playwright and API Automation Scripts

The AI initially generated generic Playwright and REST Assured code examples that demonstrated the overall approach but were not fully aligned with the application's implementation or the project's coding standards. The automation scripts were enhanced by incorporating application-specific locators, improving the Page Object Model (POM) structure, organizing reusable methods into appropriate classes, and updating assertions to validate the required functionality. Similarly, the REST Assured examples were refined to include appropriate request structure, response validations, and schema validation relevant to the assignment.

Reasoning:
While AI-generated code is valuable for creating an initial framework, production-quality automation requires customization to match the application's UI, API contracts, project architecture, and coding conventions. These modifications improved the maintainability, readability, and reliability of the automation framework while ensuring that the test scripts accurately validated the expected application behavior.
