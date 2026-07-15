Top 10 test scenarios, ranked from highest to lowest risk.


| Rank | Test Scenario | Risk Level | Ranking Rationale |
| -------- | -------- | -------- | -------- | 
|  1 | Verify successful form submission with a valid suggestion and ensure the response is persisted correctly. | Critical | This is the primary business functionality. If users cannot submit valid data, the feature completely fails. |
|  2 |Verify backend persists all required fields (account_id, account_email, start_date, end_date, locale, text, suggestion_list, completed) accurately after submission. | Critical | Incorrect or missing data can corrupt business records and break downstream systems. |
|  3 | Verify that selecting an invalid or unmatched input displays an error message and prevents submission. | High | Invalid data entering the system impacts data integrity and user experience. |
|  4 | Verify suggestion filtering using Prefix Match (default configuration). | High | Incorrect filtering prevents users from finding valid suggestions and impacts core usability. |
|  5 | Verify suggestion filtering using Match Anywhere when backend configuration is enabled. | High | This configurable behavior directly affects search functionality and must work correctly when enabled. |
|  6 | Verify clicking a suggestion correctly populates the input field and prepares it for submission. | Medium | Suggestion selection is the primary interaction method; incorrect population causes incorrect submissions. |
|  7 | Verify the REST API returns HTTP 200 and the success message is displayed after successful submission. | Medium | Users must receive confirmation that their response has been saved successfully. |
|  8 | Verify the suggestion_list stored in the backend contains only suggestions matching the entered value. | Medium | Storing unrelated suggestions violates the backend data contract and can affect reporting and analytics. |
|  9 | Verify keyboard accessibility (Tab navigation, Enter submission, Escape behavior). | Medium | Keyboard support improves accessibility and is essential for usability and compliance. |
|  10 | Verify browser compatibility and responsive behavior (Chrome on Windows 10 as specified, with potential cross-browser validation). | Low | While important for overall quality, browser compatibility is lower risk than core functional correctness because the assignment specifies Chrome as the primary environment. |
