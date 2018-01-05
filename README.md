Short Notes: Lamdas and Streams
--------------------------------------------------------------------

A lambda expression can be understood as a concise representation of an anonymous function
that can be passed around: it doesn’t have a name, but it has a list of parameters, a body, a
return type, and also possibly a list of exceptions that can be thrown. That’s one big definition;
let’s break it down:

 Anonymous— We say anonymous because it doesn’t have an explicit name like a method would
normally have: less to write and think about!
 Function— We say function because a lambda isn’t associated with a particular class like a method is.
But like a method, a lambda has a list of parameters, a body, a return type, and a possible list of
exceptions that can be thrown.
 Passed around— A lambda expression can be passed as argument to a method or stored in a
variable.
 Concise— You don’t need to write a lot of boilerplate like you do for anonymous classes.


-----------------------------------------------------------------------

@FunctionalInterface?
The compiler will return a meaningful error if you define an interface using
the @FunctionalInterface annotation and it isn’t a functional interface.

Note that the @FunctionalInterface annotation
isn’t mandatory, but it’s good practice to use it when an interface is designed for that purpose.
You can think of it like the @Override notation to indicate that a method is overridden.

----------------------------------------------------------------------------

The execute around pattern:
A recurrent pattern in resource
processing (for example, dealing with files or databases) is to open a resource, do some
processing on it, and then close the resource. The setup and cleanup phases are always similar
and surround the important code doing the processing. This is called the execute around pattern.



