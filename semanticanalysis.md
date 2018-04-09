# SEMANTICS

These are the semantic actions we identified during class on Wednesday, March 28.

## program
- Class names must be unique, including from predefined class names.
- One of the classes must be called *Main* containing a method called *main*. [27]

## classDefn
- A class with superclassName exists
- The `className` must be unique
- Note: Use Object as the `superclassName` if no `extends` clause is provided

## type            
## member
- method and field names in a given class must be unique

## field
- If `type` is not `int`, `boolean`, or `void` then it must be a class name.
- If the `ASSIGN expr` clause is present, then the type of `expr` must conform to the type of `type`.
- The `fieldName` must be unique in this class (the class's scope)
- Note: If the `ASSIGN expr` clause is not present, then set `expr` to be a default value: `0` for `int`, `false` for `boolean`, and `null` for a class reference.

## stmt
- Rule `IF LPAREN expr RPAREN stmt (ELSE stmt)?`: expr must be of type `boolean`.
- Rule `WHILE LPAREN expr RPAREN stmt`: expr must be of type `boolean`.
- Rule `type localVar=ID ASSIGN expr SEMI`:
    - `expr` must be of type that conforms to `type`.
    - `localVar` must be unique in the local scope

