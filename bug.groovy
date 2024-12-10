```groovy
def myMethod(param) {
  if (param == null) {
    return 0 // This line might cause unexpected behavior
  }
  // ... rest of the method
}

assert myMethod(null) == 0
assert myMethod(5) == 10 // Example assertion, adjust as needed
```