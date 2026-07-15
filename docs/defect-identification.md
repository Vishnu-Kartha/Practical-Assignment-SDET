The API response contains four discrepancies against the FR-05 backend data contract:


1. start_date is returned in UTC instead of the user's local timezone (IST).
   
   . Expected: start_date and should be returned in the user's local timezone (IST).

     "start_date": "2024-03-15T16:00:00+05:30"

   
   . Actual: Both timestamps are returned in UTC (Z suffix).

     "start_date": "2024-03-15T10:30:00Z"

2. end_date is returned in UTC instead of the user's local timezone (IST).

    . Expected: end_date and should be returned in the user's local timezone (IST).

     "end_date": "2024-03-15T16:02:00+05:30"

   
   . Actual: Both timestamps are returned in UTC (Z suffix).

     "end_date": "2024-03-15T10:32:00Z"

   
 3. locale returns en instead of the expected user locale en-IN.

    . Expected: locale should represent the user's locale in IETF BCP 47 format, e.g., en-IN.

      "locale": "en"

    . Actual: Only "en" is returned.

      "locale": "en-IN"
   
   
 4. completed is returned as a string ("true") instead of a Boolean (true).

    . Expected : "completed": true

    . Actual : "completed": "true"
