# Groovy Null Handling Bug

This repository demonstrates a potential issue with null handling in a Groovy method.  The `myMethod` function returns 0 when given a null parameter. While this might seem harmless, it can mask underlying problems or lead to unexpected behavior in certain scenarios.

The `bug.groovy` file contains the buggy code, while `bugSolution.groovy` provides a more robust approach to handling nulls.

## Bug Description

The primary issue lies in the implicit handling of a null parameter. A more explicit approach is preferred for better clarity and error handling.