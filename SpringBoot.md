### 什么是spring boot ?

- 开箱即用，约定大于配置
- spring boot 是Spring 开源组织下的子项目，是 spring 组件一站式解决方案，
- 主要简化了使用spring 的难度，简省了繁重的配置文件，提供了各种启动器，能让开发者快速上手。



### 为什么要用spring boot ？

- 因为springboot 的优点非常的多，
- 比如 独立运行、简化配置、自动配置、无代码生成和XML 配置 、应用监控、上手简单。



### spring boot 的 核心配置文件有哪几个？ 他们的区别是什么？

- spring boot 的核心配置文件是 application 和 bootstrap 配置文件，
- application 文件比较常用和理解，就是用于 spring boot 项目的自动化配置。
- Bootstrap 配置文件用于以下几个场景：
  - 使用 spring cloud config 配置中心时，这时需要在 Bootstrap 配置文件中添加链接到配置中心的配置属性来加载外部配置中心的配置信息。
  - 一些固定的不能被覆盖的属性。
  - 一些加密、解密的场景。



### spring boot  的核心注解是那个？ 它主要有哪几个注解组成？

- 启动类上面的注解是 “@SpringBootApplication” ,它也是Spring Boot 的核心注解，主要组合包含了以下三个注解：
  - "@SpringBootCnfiguration": 组合了 @Configuration 注解，实现配置文件的功能。
  - "@EnableAutoConfiguration": 打开自动配置的功能，也可以关闭某个自动配置的选项。
  - "@ComponentScan":Spring组件扫描

  

### 开启SpringBoot 特性有哪几种方式？

- 有两种方式：

  - 继承spring-boot-parent 项目

  - 导入 spring-boot-dependencies 项目依赖


具体详解:https://blog.csdn.net/zl1zl2zl3/article/details/83715712





### 运行 spring boot 有那几种方式？

- 打包之后用 命令， 或者放入到容器中运行

- 用 Maven、Gradle 插件运行

- 直接执行 main 方法运行

  

### spring boot 自动配置原理是什么？

- 注解 “@EnableAutoConfiguration”、“@Configuration”、“@ConditionOnClass” 这些就是自动配置的核心，
- 首先它得是一个配置文件，其次根据类路径下是否有这个类去自动配置。
- 具体详解



### spring boot 的目录结构是怎样的？

- src/main/java
- src/main/resources
  - resources：（Spring Boot 默认的）存放资源文件
  - static：（Spring Boot 默认的）存放静态文件，比如 css、js、image, （访问方式 http://localhost:8080/js/main.js）
  - public：（Spring Boot 默认的）存放公共文件
  - templates：（用户自己定义的，可以随便取名，但这里使用公认的文件名）存放静态页面，比如 jsp、html、tpl
  - config：（用户自己定义的，可以随便取名，但这里使用公认的文件名）存放配置文件，比如 application.properties



##  如何使用Spring Boot实现异常处理？

**自定义错误页面**

- 只需要在resources/templates/目录下新建一个名为error的视图页面即可，当出现异常时，SpringBoot 会像/error 的 url 发送请求。

- 在 springBoot 中提供了一个叫 BasicExceptionController 来处理/error 请求，然后跳转到默认显示异常的页面来展示异常信息。
- 缺点：拦截所有错误，不灵活



**使用注解@ExceptionHandler处理**

- 在controller类中添加错误类，返回ModelandView，并使用@ExceptionHandler(value={})注解，value中标注错误类型，
- 当发生错误时会自动跳转到你设置的错误页面中
- 缺点：只能在一个controller中使用，不能跨controller使用
- 

**使用注解@controllerAdvice处理**

- 定义一个类用来装所有的错误类型，并且使用@controllerAdvice注解
- 缺点：如果有多个错误还是要写多个方法，代码重复严重



**使用@Configuration注解处理**

- 新建类，在类中使用@Configuration注解，在类中定义方法，方法使用@Bean注解，并且返回值为：SimpleMappingExceptionResolver
- 缺点：不能将错误信息传递到页面中



**自定义 HandlerExceptionResolver 类处理异常**

- 新建类，使用Configuration注解并且实现HandlerExceptionResolver接口，实现方法
- 推荐使用第五种方法，既可以将错误定义到一个方法中，又可以传递错误信息到错误页面中



##  Spring Boot 中如何解决跨域问题 

- 很多人对跨域有一种误解，以为这是前端的事，和后端没关系，其实不是这样的，说到跨域，就不得不说说浏览器的同源策略。
- 同源策略是由Netscape提出的一个著名的安全策略，它是浏览器最核心也最基本的安全功能，
- 现在所有支持JavaScript的浏览器都会使用这个策略。
- 所谓同源是指协议、域名以及端口要相同。
- 同源策略是基于安全方面的考虑提出来的，这个策略本身没问题，但是我们在实际开发中，由于各种原因又经常有跨域的需求，
- 传统的跨域方案是JSONP，JSONP虽然能解决跨域但是有一个很大的局限性，那就是只支持GET请求，不支持其他类型的请求。
- CORS（跨域源资源共享）（CORS，Cross-origin resource sharing）是一个W3C标准，它是一份浏览器技术的规范，
- 提供了Web服务从不同网域传来沙盒脚本的方法，以避开浏览器的同源策略，这是JSONP模式的现代版

首先可以通过@CrossOrigin注解配置某一个方法接受某一个域的请求

```java
@RestController
public class HelloController {
    @CrossOrigin(value = "http://localhost:8081")
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @CrossOrigin(value = "http://localhost:8081")
    @PostMapping("/hello")
    public String hello2() {
        return "post hello";
    }
}
```

在Spring Boot中，还可以通过全局配置一次性解决这个问题，全局配置只需要在配置类中重写addCorsMappings方法即可

```java
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        .allowedOrigins("http://localhost:8081")
        .allowedMethods("*")
        .allowedHeaders("*");
    }
}
```

`/**`表示本应用的所有方法都会去处理跨域请求，allowedMethods表示允许通过的请求数，allowedHeaders则表示允许的请求头。经过这样的配置之后，就不必在每个方法上单独配置跨域了。



**存在的问题**

了解了整个CORS的工作过程之后，我们通过Ajax发送跨域请求，虽然用户体验提高了，但是也有潜在的威胁存在，常见的就是CSRF（Cross-site request forgery）跨站请求伪造。跨站请求伪造也被称为one-click attack 或者 session riding，通常缩写为CSRF或者XSRF，是一种挟制用户在当前已登录的Web应用程序上执行非本意的操作的攻击方法



基于此，浏览器在实际操作中，会对请求进行分类，分为简单请求，预先请求，带凭证的请求等，预先请求会首先发送一个options探测请求，和浏览器进行协商是否接受请求。默认情况下跨域请求是不需要凭证的，但是服务端可以配置要求客户端提供凭证，这样就可以有效避免csrf攻击





## Spring Boot 如何实现热部署 ?

- 在开发中我们经常因为修改一个Java文件后想看到修改后的效果而不得不重启应用，这导致大量时间花费在项目的重启和部署上。
- 因此我们希望程序不需要重启并可以自动进行部署，也就是我们说的热部署

- **SpringBoot Devtools**（推荐）



##  Spring Boot打成的 jar 和普通的jar有什么区别呢?

- Spring Boot的项目终止以jar包的形式进行打包，这种jar包可以通过可以通过命令（java -jar xxx.jar）来运行的，
- 这种jar包不能被其他项目所依赖，即使被依赖了也不能直接使用其中的类。
- 普通的jar包，解压后直接就是包名，包里就是我们的代码，
- 而 Spring Boot 打包成的可执行 jar 解压后，在 \BOOT-INF\classes 目录下才是我们的代码，因此无法被直接引用。
- 如果非要引用，可以在 pom.xml 文件中增加配置，将 Spring Boot 项目打包成两个 jar ，一个可执行，一个可引用



## Spring Boot 的配置文件有哪几种格式？它们有什么区别？

- properties

- yml

- 有 properties 和 yml 两种格式，它们的主要区别在于书写格式不同， properties 是赋值 类的， yml 则是层级很严格

  

## Spring Boot 需要独立的容器运行吗？

- 不需要，已经内嵌了 tomcat、Jetty 、Undertow
- tomcat 是默认容器



## Spring Boot 自动配置原理是什么？





## springboot启动机制