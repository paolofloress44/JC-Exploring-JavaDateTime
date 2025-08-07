# Paolo Miguel D. Flores
## Hands-on Lab: Working with Java's Date and Time API

### Exercise 1: LocalDate and DateTimeFormatter
![sc](sc.png)

---

### Exercise 2: LocalTime and DateTimeFormatter

**Prediction**:</br>
Default format: 16:45:30</br>
24-hour format: 16:45:30</br>
12-hour format with AM/PM: 4:45:30 PM

**Observation**:</br>
Default format: 16:45:30</br>
24-hour format: 16:45:30</br>
12-hour format with AM/PM: 04:45:30 PM

---

### Exercise 3: LocalDateTime and DateTimeFormatter

**Prediction**:</br>
Default format: 2025-11-27 19:00:00</br>
Custom format: November 27, 2025 at 07:00PM

**Observation**:</br>
Default format: 2025-11-27T19:00</br>
Custom format: November 27, 2025 at 07:00 PM

---

### Exercise 4: The Immutability of Date-Time Objects

**Prediction**:</br>
Start date after trying to modify it: 2025-09-01</br>
The original start data is still: 2025-09-01</br>
The new end date is: 2025-09-11

**Observation**:</br>
Start date after trying to modify it: 2025-09-01</br>
The original start data is still: 2025-09-01</br>
The new end date is: 2025-09-11

---

### Exercise 5: Adding and Subtracting Time (plus and minus)

**Prediction**:</br>
Base time: 2025-10-15 10:30</br>
Future time: 2026-12-15 15:30</br>
Past time: 2025-09-16 10:30

**Observation**:</br>
Base time:   2025-10-15 10:30</br>
Future time: 2026-12-15 15:30</br>
Past time:   2025-09-21 10:30

---

### Exercise 6: Period - Measuring a Span of Time

**Prediction**:</br>
The period between the two dates is: 2 years, 4 months, and 5 days.

**Observation**:</br>
The period between the two dates is: 2 years, 4 months, and 5 days.

