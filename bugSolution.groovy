```groovy
def myMethod(param) {
  if (param == null) {
    throw new IllegalArgumentException("Parameter cannot be null")
  }
  // ... rest of the method, ensuring param is not null
  return param * 2 //Example
}

assert myMethod(5) == 10

//handling the exception
try{
    assert myMethod(null) == 0
} catch (IllegalArgumentException e){
    println "Exception caught: "+ e.getMessage()
}
```