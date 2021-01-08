Singleton with Prototype Dependencies
When a Prototype scoped bean is autowired into a Singleton scoped bean, it doesn’t behave like we would expect a prototype to behave. We end up getting the same instance everytime due to being enclosed in a larger (Singleton) enclosing scope and caching behaviour which is inbuilt into Spring.
In this video, we explore this behaviour in a bit more details, and look at different approaches we can take to work around this problem.

The github repo for this video is located at:
https://github.com/sriyer-dev/spring-singleton-proto

Blog articles documenting what we discuss in this video are present at:
https://cybergurucool.wordpress.com/2021/01/07/singleton-beans-with-prototype-dependencies-1-of-2/
https://cybergurucool.wordpress.com/2021/01/08/singleton-beans-with-prototype-dependencies-2-of-2/

The youtube video link is:
https://youtu.be/wrHCqzwuROc

