### 1、什么是spring boot ?

spring boot 是Spring 开源组织下的子项目，是 spring 组件一站式解决方案，主要简化了使用spring 的难度，简省了繁重的配置文件，提供了各种启动器，能让开发者快速上手。

### 2、为什么要用spring boot ？

因为springboot 的优点非常的多，比如 独立运行、简化配置、自动配置、无代码生成和XML 配置 、应用监控、上手简单。

### 3、spring boot 的 核心配置文件有哪几个？ 他们的区别是什么？

spring boot 的核心配置文件是 application 和 bootstrap 配置文件，application 文件比较常用和理解，就是用于 spring boot 项目的自动化配置。

Bootstrap 配置文件用于以下几个场景：

1. 使用 spring cloud config 配置中心时，这时需要在 Bootstrap 配置文件中添加链接到配置中心的配置属性来加载外部配置中心的配置信息。
2. 一些固定的不能被覆盖的属性。
3. 一些加密、解密的场景。

### 4、spring boot 的配置文件有哪几种格式？它们有什么区别?

有 properties 和 yml 两种格式，它们的主要区别在于书写格式不同， properties 是赋值 类的， yml 则是层级很严格

### 5、spring boot  的核心注解是那个？ 它主要有哪几个注解组成？

启动类上面的注解是 “@SpringBootApplication” ,它也是Spring Boot 的核心注解，主要组合包含了以下三个注解：

1. "@SpringBootCnfiguration": 组合了 @Configuration 注解，实现配置文件的功能。
2. "@EnableAutoConfiguration": 打开自动配置的功能，也可以关闭某个自动配置的选项。
3. "@ComponentScan":Spring组件扫描

### 6、开启SpringBoot 特性有哪几种方式？

有两种方式：

1. 继承spring-boot-parent 项目
2. 导入 spring-boot-dependencies 项目依赖

具体详解:https://blog.csdn.net/zl1zl2zl3/article/details/83715712

### 7、spring boot 需要 独立的容器运行吗？

不需要的，因为它内置了 Tomcat 、Jetty 容器

### 8、运行 spring boot 有那种方式？

1. 打包之后用 命令， 或者放入到容器中运行
2. 用 Maven、Gradle 插件运行
3. 直接执行 main 方法运行

### 9、spring boot 自动配置原理是什么？

注解 “@EnableAutoConfiguration”、“@Configuration”、“@ConditionOnClass” 这些就是自动配置的核心，首先它得是一个配置文件，其次根据类路径下是否有这个类去自动配置。

具体详解

### 10、spring boot 的目录结构是怎样的？