## equals与 == 的区别

== 与 equals 其实是相同的，

== 对于基本数据类型就是值比较，对于引用类型就是  引用比较。

有的类重写了 equals方法，把引用对比改为了 值对比，例如 String 类，以及一些包装类

在常规java编程中，如果是判断数值类型 就用 ==，

如果是 字符串类型的，就用 equals

![img](https://uploader.shimo.im/f/vjjlCZ9K8iEMWDS7.png!thumbnail)

## final, finally, finalize 的区别

final 是一个修饰符，final 修饰的类是最终类，是不能被更改的，

final 修饰的方法是 无法被 override 重写的，

final 修改的 变量会变成常量，需要赋值初始值，并且不能修改其值。

finally 是 捕获异常块中的



## String 属于基础的数据类型吗

java 中有八种基础数据类型， byte, char , short ,int float ,double lang boolean 

string 并不在其中，string 是一个对象，



## java 中操作字符串都有哪些类？它们之间有什么区别

操作字符串的对象有三个，String , StringBuffer , StringBuilder

String 是 final 修饰的，是不可变的，对String 对象做的每次操作都会生成一个新的对象，然后将指针，也就是引用地址引向新的对象。

StringBuilder 和 StringBuffer  可以在原有的对象基础进行操作，所以经常改变一个字符串的话，最好不要使用String，

StringBuilder 和 StringBuffer 几乎是一样的，但是 String Buffer 是线程安全的，所以 效率没有 String Builder高。

单线程环境下推荐使用 StringBuilder，多线程环境下推荐使用 StringBuffer。



## 如何将字符串反转

使用 StringBuilder 和 StringBuffer 中的 reverse() 方法

![img](https://uploader.shimo.im/f/GmkL8rNkatsCmy8U.png!original)

##  String 类的常用方法都有那些

- indexOf()：返回指定字符的索引。

- charAt()：返回指定索引处的字符。

- replace()：字符串替换。

- trim()：去除字符串两端空白。

- split()：分割字符串，返回一个分割后的字符串数组。

- getBytes()：返回字符串的 byte 类型数组。

- length()：返回字符串长度。

- toLowerCase()：将字符串转成小写字母。

- toUpperCase()：将字符串转成大写字符。

- substring()：截取字符串。

- equals()：字符串比较。

## 抽象类必须要有抽象方法吗

不是必须的，但是有抽象方法的一定是抽象类



## String str="i"与 String str=new String("i")一样吗

是不一样的，因为内存的分配方式一样。

String 是 final 修饰的，直接赋值，会把内存地址分配到 常量池中，

而 new  一个 String 则是 分配到 堆内存中



## java 中的 Math.round(-1.5) 等于多少



### 重载和重写的区别

重载 是 方法名相同，但是参数列表或者返回值不同

重写 是 子类实现父类的方法



## 两个对象的hashCode()相同，则 equals()是否也一定为 true？



1. 抽象类和接口有什么区别
2. BIO、NIO、AIO 有什么区别？



## JAVA中的几种基本数据类型是什么，各自占用多少字节呢

byte, char , short ,int float ,double lang boolean 



Comparator与Comparable有什么区别？



## String类能被继承吗，为什么

String 是 final 修饰的类，是无法被继承的。



## 说说Java中多态的实现原理



## Java泛型和类型擦除



## int和Integer 有什么区别，还有Integer缓存的实现

Integer 是 int 的包装类， 



## 说说反射的用途及实现原理，Java获取反射的三种方法

反射主要是指程序可以访问，检测和修改它本身状态或行为的一种能力。





1. 面向对象的特征

2. &和&&的区别

3. Java中IO流分为几种?

4. 讲讲类的实例化顺序，比如父类静态数据，构造函数，子类静态数据，构造函数。

5. Java创建对象有几种方式

6. 如何将GB2312编码的字符串转换为ISO-8859-1编码的字符串呢？

7. 守护线程是什么？用什么方法实现守护线程

8. notify()和 notifyAll()有什么区别？

9. Java语言是如何处理异常的，关键字throws、throw、try、catch、finally怎么使用？

10. 谈谈Java的异常层次结构

11. 静态内部类与非静态内部类有什么区别区别

12. String s与new String与有什么区别

13. 反射中，Class.forName和ClassLoader的区别

14. JDK动态代理与cglib实现的区别

15. error和exception的区别，CheckedException，RuntimeException的区别。

16. 深拷贝和浅拷贝区别

17. ## JDK 和 JRE 有什么区别？

    JDK：java开发工具包，里面包含了 jre, 以及开发时所需要的基础 开发环境

    JRE :  java runtime environment  是 java 程序的运行环境，jvm 就是在  jre 里面，

    如果只需要 运行java 程序而不进行开发的话，可以只下载 jre

    

1. 谈谈自定义注解的场景及实现
2. 说说你熟悉的设计模式有哪些？
3. 抽象工厂和工厂方法模式的区别？
4. 什么是值传递和引用传递？
5. 可以在static环境中访问非static变量吗？
6. Java支持多继承么,为什么？
7. 用最有效率的方法计算2乘以8？
8. 构造器是否可被重写？
9. char型变量中能不能存贮一个中文汉字，为什么？
10. 如何实现对象克隆？
11. object中定义了哪些方法？
12. hashCode的作用是什么？
13. for-each与常规for循环的效率对比
14. 写出几种单例模式实现，懒汉模式和饿汉模式区别
15. 请列出 5 个运行时异常。
16. 2个不相等的对象有可能具有相同的 hashcode吗？
17. 访问修饰符public,private,protected,以及default的区别？
18. 谈谈final在java中的作用？
19. java中的Math.round(-1.5) 等于多少呢？
20. String属于基础的数据类型吗？
21. 如何将字符串反转呢？
22. 描述动态代理的几种实现方式，它们分别有什么优缺点
23. 在自己的代码中，如果创建一个java.lang.String类，这个类是否可以被类加载器加载？为什么。
24. 谈谈你对java.lang.Object对象中hashCode和equals方法的理解。在什么场景下需要重新实现这两个方法。
25. 在jdk1.5中，引入了泛型，泛型的存在是用来解决什么问题。
26. 什么是序列化，怎么序列化，反序列呢？
27. java8的新特性。
28. 匿名内部类是什么？如何访问在其外面定义的变量呢？
29. break和continue有什么区别？
30. String s = "Hello";s = s + " world!";这两行代码执行后，原始的 String 对象中的内容是否会改变？
31. 怎样将GB2312编码的字符串转换为ISO-8859-1编码的字符串？
32. try-catch-finally-return执行顺序
33. Java 7新的 try-with-resources语句，平时有使用吗
34. 简述一下面向对象的”六原则一法则”。
35. switch是否能作用在byte 上，是否能作用在long 上，是否能作用在String上？
36. 数组有没有length()方法？String有没有length()方法？
37. 是否可以从一个静态（static）方法内部发出对非静态（non-static）方法的调用？
38. String s = new String("jay");创建了几个字符串对象？
39. 匿名内部类是否可以继承其它类？是否可以实现接口？
40. 我们能将int强制转换为 byte类型的变量吗？如果该值大于byte 类型的范围，将会出现什么现象？
41. float f=3.4;正确吗？
42. 你能写出一个正则表达式来判断一个字符串是否是一个数字吗？
43. Reader和InputStream区别？
44. 列举出JAVA中6个比较常用的包
45. JDK 7有哪些新特性
46. 同步和异步有什么区别？
47. 实际开发中，Java一般使用什么数据类型来代表价格？
48. 64 位 JVM 中，int 的长度是多数？
49. java8的新特性
50. 字节流与字符流的区别
51. Java 事件机制包括哪三个部分？分别介绍下。
52. 为什么等待和通知是在 Object 类而不是 Thread 中声明的？
53. 每个对象都可上锁，这是在 Object类而不是 Thread 类中声明，为什么呢？
54. 为什么char 数组比Java中的 String 更适合存储密码？
55. 如何使用双重检查锁定在 Java 中创建线程安全的单例？
56. 如果你的Serializable类包含一个不可序列化的成员，会发生什么？你是如何解决的？
57. 什么是serialVersionUID ？如果你不定义这个, 会发生什么？
58. Java 中，Maven 和 ant，gradle 有什么区别？
59. 常见的序列化协议有哪些
60. @transactional注解在什么情况下会失效，为什么。
61. Java 中，DOM 和SAX 解析器有什么不同？
62. 数组在内存中如何分配；
63. 什么是 Busy spin？我们为什么要使用它？
64. Java 中怎么获取一份线程 dump 文件？
65. 父类的静态方法能否被子类重写
66. 什么是不可变对象
67. 如何正确的退出多层嵌套循环？
68. SimpleDateFormat是线程安全的吗?你一般怎么格式化
69. 抽象类必须要有抽象方法吗？
70. 怎么实现动态代理？有哪些应用
71. 什么是内部类？内部类的作用
72. 泛型中extends和super的区别
73. 内部类有几种，在项目中的有哪些应用
74. utf-8编码中的中文占几个字节；int型几个字节？
75. 说说你对Java注解的理解
76. Java 中 java.util.Date 与 java.sql.Date 有什么区别？
77. 说一下隐式类型转换
78. 抽象类能使用final修饰吗
79. 给我一个符合开闭原则的设计模式的例子
80. Files的常用方法都有哪些
81. Java 中，Serializable与Externalizable 的区别？
82. Java锁有哪些种类，它们都有哪些区别
83. 抽象的方法是否可同时是静态的）,是否可同时是本地方法），是否可同时被 synchronized 修饰？
84. 一个”.java”源文件中是否可以包含多个类（不是内部类）？有什么限制？
85. 说说代理的实现原理
86. 了解哪设计模式，举例说说在jdk源码哪些用到了你说的设计模式
87. 什么是B/S架构？什么是C/S架构
88. Java有那些开发平台呢？
89. Java内部类为什么可以访问到外部类呢？
90. Java支持的数据类型有哪些？什么是自动拆装箱呢？
91. 创建线程有几种不同的方式
92. hashCode()和equals()方法的重要性体现在什么地方？
93. 如何通过反射获取和设置对象私有字段的值？
94. 如何通过反射调用对象的方法？
95. 简述一下面向对象的"六原则一法则"
96. Java 对象不使用时为什么要赋值为 null？
97. 什么时候用断言（assert）？
98. AJAX请求为什么不安全？
99. 一个Java字符串中到底能有多少个字符?
100. StringBuilder为什么线程不安全？
101. 深克隆和浅克隆
102. 聊一聊设计模式的基本原则
103. Java 能否自定义一个类叫 java.lang.System？
104. Java中的两种异常类型是什么？他们有什么区别？
105. Java中Exception和Error有什么区别？
106. throw和throws有什么区别？
107. 异常处理完成以后，Exception对象会发生什么变化？
108. 什么是RMI？
109. 解释下Serialization和Deserialization。
110. 环境变量Path和ClassPath的作用是什么？如何设置这两个环境变量？
111. 字符型常量和字符串常量的区别
112. 构造器Constructor是否可被override
113. 什么是方法的返回值？返回值在类的方法里的作用是什么？
114. 一个类的构造方法的作用是什么？若一个类没有声明构造方法，改程序能正确执行吗？为什么？
115. 静态方法和实例方法有何不同？
116. 对象的相等与指向他们的引用相等，两者有什么不同？
117. 用 Java 写一个线程安全的单例模式
118. 我能在不进行强制转换的情况下将一个 double值赋值给 long类型的变量吗？
119. java 枚举类型是否可以继承 (final)？
120. Cloneable 接口实现原理？
121. 继承和聚合的区别？
122. 能用Java覆盖静态方法吗？如果我在子类中创建相同的方法是编译时错误？
123. 什么是Java程序的主类？应用程序和小程序的主类有何不同？
124. instanceof 工作中使用过吗？
125. Java自带线程池判断线程池是否已经结束运行的方法叫什么
126. 成员变量与局部变量的区别有那些？
127. 创建一个对象用什么运算符? 对象实体与对象引用有何不同?
128. 一行Java代码是如何执行的？