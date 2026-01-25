# 06 – Classes & Objects

This module builds the core mental model of Java's object-oriented runtime:
- How classes become objects in memory
- What happens during object construction
- How `this`, constructors, and initialization truly work
- The difference between instance state and class state (`static`)
- How Java prevents certain categories of bugs through these rules

Why this matters for seniors:
- Frameworks like Spring and Hibernate depend heavily on object lifecycle rules
- Many production bugs come from incorrect assumptions about initialization order
- Interviewers use this topic to evaluate whether you understand the runtime model, not just syntax

Primary outcomes:
- You can explain object creation step-by-step (including memory + initialization)
- You can predict initialization order reliably
- You can explain static vs instance clearly with real-world examples
- You can spot traps (shadowing, constructor chaining rules, static method hiding)