## equals与 == 的区别

1.功能不同
"=="    是判断两个变量或实例是不是指向同一个内存空间
"equals" 是判断两个变量或实例所指向的内存空间的值是不是相同
 == 对于基本数据类型就是值比较，对于引用类型就是  引用比较。

2.定义不同
"equals" 在java中是 超类 Object的一个方法
"==" 是一个运算符号，操作符
"==" 比 "equals" 要快，因为它只是比较的引用

3.通俗意义
== 比较的是数值的大小
equals 比较的 字符串类型是否相等

- 有的类重写了 equals方法，把引用对比改为了 值对比，例如 String 类，以及一些包装类

- 在常规java编程中，如果是判断数值类型 就用 ==，

- 如果是 字符串类型的，就用 equals


![img](https://uploader.shimo.im/f/vjjlCZ9K8iEMWDS7.png!thumbnail)

## final, finally, finalize 的区别

- final 是一个修饰符，final 修饰的类是最终类，是不能被更改的，

- final 修饰的方法是 无法被 override 重写的，

- final 修改的 变量会变成常量，需要赋值初始值，并且不能修改其值。

- finally 是 捕获异常块中的




## String 属于基础的数据类型吗

- java 中有八种基础数据类型， byte, char , short ,int float ,double lang boolean 

- string 并不在其中，string 是一个对象，




## java 中操作字符串都有哪些类？它们之间有什么区别

- 操作字符串的对象有三个，String , StringBuffer , StringBuilder

- String 是 final 修饰的，是不可变的，对String 对象做的每次操作都会生成一个新的对象，然后将指针，也就是引用地址引向新的对象。

- StringBuilder 和 StringBuffer  可以在原有的对象基础进行操作，所以经常改变一个字符串的话，最好不要使用String，

- StringBuilder 和 StringBuffer 几乎是一样的，但是 String Buffer 是线程安全的，所以 效率没有 String Builder高。

- 单线程环境下推荐使用 StringBuilder，多线程环境下推荐使用 StringBuffer。




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

- 不是必须的，但是有抽象方法的一定是抽象类




## String str="i"与 String str=new String("i")一样吗

- 是不一样的，因为内存的分配方式一样。

- String 是 final 修饰的，直接赋值，会把内存地址分配到 常量池中，

- 而 new  一个 String 则是 分配到 堆内存中




## java 中的 Math.round(-1.5) 等于多少



### 重载和重写的区别

- 重载 是 方法名相同，但是参数列表或者返回值不同

- 重写 是 子类实现父类的方法




## 两个对象的hashCode()相同，则 equals()是否也一定为 true？



抽象类和接口有什么区别

BIO、NIO、AIO 有什么区别？



## JAVA中的几种基本数据类型是什么，各自占用多少字节呢

byte, char , short ,int float ,double lang boolean 



## Comparator与Comparable有什么区别？

- Comparable接口用来定义对象的自然顺序，而Comparator接口通常用于定义用户自定义的顺序。
- Comparable接口总是只有一个，是由java.lang提供的定义好的接口，即不可修改。
- 而Comparator是由java.util提供的，集合外部实现的排序，可以通过实现他的方法进行修改，可以有多个Comparator来定制对象的顺序。
- 如果不需要自定义排序的话，简单排序实现Comparable即可。使用Comparator可以实现不同的排序，而Comparable不可以实现。





## String类能被继承吗，为什么

String 是 final 修饰的类，是无法被继承的。



## 说说Java中多态的实现原理



## Java泛型和类型擦除



## int和Integer 有什么区别，还有Integer缓存的实现

Integer 是 int 的包装类， 



## 说说反射的用途及实现原理，Java获取反射的三种方法

反射主要是指程序可以访问，检测和修改它本身状态或行为的一种能力。





面向对象的特征

&和&&的区别

Java中IO流分为几种?

讲讲类的实例化顺序，比如父类静态数据，构造函数，子类静态数据，构造函数。

Java创建对象有几种方式

如何将GB2312编码的字符串转换为ISO-8859-1编码的字符串呢？

守护线程是什么？用什么方法实现守护线程

notify()和 notifyAll()有什么区别？

Java语言是如何处理异常的，关键字throws、throw、try、catch、finally怎么使用？

谈谈Java的异常层次结构

静态内部类与非静态内部类有什么区别区别

String s与new String与有什么区别

反射中，Class.forName和ClassLoader的区别

JDK动态代理与cglib实现的区别

error和exception的区别，CheckedException，RuntimeException的区别。

深拷贝和浅拷贝区别

## JDK 和 JRE 有什么区别？

- JDK：java开发工具包，里面包含了 jre, 以及开发时所需要的基础 开发环境

- JRE :  java runtime environment  是 java 程序的运行环境，jvm 就是在  jre 里面，

- 如果只需要 运行java 程序而不进行开发的话，可以只下载 jre




谈谈自定义注解的场景及实现

说说你熟悉的设计模式有哪些？

抽象工厂和工厂方法模式的区别？

## 什么是值传递和引用传递？



## 可以在static环境中访问非static变量吗？
不可以，因为静态是属于类的，而非static基本属于对象，
访问时，对象可能还没有创建。

## Java支持多继承么,为什么？

java是单继承的，但是可以多实现的，

只能 extends 一个，可以 implements 多个



## 用最有效率的方法计算2乘以8？

2<<2 



构造器是否可被重写？





char型变量中能不能存贮一个中文汉字，为什么？

如何实现对象克隆？

## object中定义了哪些方法？

Object是java所有类的基类，是整个类继承结构的顶端，也是最抽象的一个类.

registerNatives()、getClass()、hashCode()、equals()、clone()、toString()、notify()、notifyAll()、wait(long)、wait(long,int)、wait()、finalize()



## 对象在内存中的状态

1. **可达状态** ：有引用指向，这种对象为可达状态；
2. **可恢复状态** ：失去引用，这种对象称为可恢复状态；垃圾回收机制开始回收时，回调用可恢复状态对象的finalize()方法（如果此方法让此对象重新获得引用，就会变为可达状态，否则，会变为不可大状态）。
3. **不可达状态** ：彻底失去引用，这种状态称为不可达状态，如果垃圾回收机制这时开始回收，就会将这种状态的对象回收掉。



## hashCode的作用是什么？

- HashCode的存在主要是为了查找的快捷性，HashCode是用来在散列存储结构中确定对象的存储地址的
- 如果两个对象equals相等，那么这两个对象的HashCode一定也相同
- 如果对象的equals方法被重写，那么对象的HashCode方法也尽量重写
- 如果两个对象的HashCode相同，不代表两个对象就相同，只能说明这两个对象在散列存储结构中，存放于同一个位置





## 为什么重写Object的equals(Object obj)方法尽量要重写Object的hashCode()方法







## for-each与常规for循环的效率对比

- for需要获取容器大小，如果计算大小比较耗时，那么for循环效率会很低。
- for循环是根据容器大小防止越界，因此每次循环需要进行一次比较。
- ForEach 编译成字节码之后，使用的是迭代器实现的，所以本质上是通过迭代器遍历的





写出几种单例模式实现，懒汉模式和饿汉模式区别

## 请列出 5 个运行时异常

java提供了两种异常的机制：

一种是运行时异常，Runtime Exception，我们可以不处理。当出现这样的异常时，总是由虚拟机接管。 

一种是检查异常， Checked Exception，我们经常遇到的IO异常及sql异常就属于检查式异常。

对于这种异常，java编译器要求我们必须对出现的这些异常进行catch，面对这种异常要么throws，要么catch 。

```java
NullPoniterException		 		 
IndexOutOfBoundsException    
ArrayStoreException
ClassCastException
IOException
IndexOfException
```



## 2个不相等的对象有可能具有相同的 hashcode吗

可以有，

hashcode的值是代表 其存在的内存地址，



## 访问修饰符public,private,protected,以及default的区别



## 谈谈final在java中的作用



## java中的Math.round(-1.5) 等于多少呢



描述动态代理的几种实现方式，它们分别有什么优缺点

在自己的代码中，如果创建一个java.lang.String类，这个类是否可以被类加载器加载？为什么。

谈谈你对java.lang.Object对象中hashCode和equals方法的理解。在什么场景下需要重新实现这两个方法。



## 什么是向下转型和向上转型

- 面向对象的转型只会发生在具有继承关系的父子类中（接口也是继承的一种）
- 向上转型：其核心目的在于参数的统一上，根本不需要强制类型转换。
- 向下转型：是为了操作子类定义的特殊功能，需要强制类型转换，可是现在存在的问题是：向下转型其实是一种非常不安全的操作，以为编译的时候，程序不会报错，而在运行的时候会报错，这就是传说中的—迷之报错
- 在JDK1.5之后，新增加了泛型的技术，这就将上述向下转型的问题消灭在了萌芽之中



## 在jdk1.5中，引入了泛型，泛型的存在是用来解决什么问题

- 泛型的核心意义在于：类在进行定义的时候可以使用一个标记，此标记就表示类中属性或者方法以及参数的类型，标记在使用的时候，才会去动态的设置类型。

- 泛型主要针对向下转型时所带来的安全隐患，其核心组成是在声明类或接口时，不设置参数或属性的类型。




## 什么是序列化，怎么序列化，反序列呢

- 实现Serializable接口即可进行序列化，

- transient 修饰的属性，是不会被序列化的

- 静态变量是 不 序列化的

- 实现这个Serializable 接口的时候，一定要给这个 serialVersionUID 赋值。

- 当一个父类实现序列化，子类就会自动实现序列化，不需要显式实现Serializable接口

  

-  当两个Java进程进行通信时，能否实现进程间的对象传送呢？当然是可以的！如何做到呢？

- 这就需要使用Java序列化与反序列化了。发送方需要把这个Java对象转换为字节序列，然后在网络上传输，接收方则需要将字节序列中恢复出Java对象。

  

- 序列化：把对象转换为字节序列的过程称为对象的序列化。
  反序列化：把字节序列恢复为对象的过程称为对象的反序列化。




## 什么情况下需要序列化 

- 当你想把的内存中的对象状态保存到一个文件中或者数据库中时候。
- 当你想用套接字在网络上传送对象的时候。
- 当你想通过RMI传输对象的时候。
- 

## 什么是serialVersionUID ？如果你不定义这个, 会发生什么？



## java8的新特性

- 接口新增默认方法与静态方法
- 新增Lambda表达式
-  新增方法引用
-  重复注解
- 扩展注解的支持
-  java.util.Optional 类新特性
- stream API
- java.util.Base64 类新特性
- HashMap类性能提升
- 新时间日期API
- 函数式接口



## 匿名内部类是什么？如何访问在其外面定义的变量呢？

- 匿名内部类是没有名字的内部类。
- 因为没有名字，所以匿名内部类只能只能使用一次，通常用来简化代码编写。
- 使用匿名内部类有个前提条件：必须继承一个父类或者实现一个接口。

匿名内部类不能访问外部类方法中的局部变量

除非该变量被声明为final类型





## break和continue有什么区别？

- 如果是在循环结构中，break 是结束这个循环体，continue 则是结束本次循环，进行下一次循环。
- 用break语句可以使流程bai跳出switch语句体



## String s = "Hello";s = s + " world!";这两行代码执行后，原始的 String 对象中的内容是否会改变？

- String 是 final的，对他的每次修改都会生成一个新的对象。
- 原始的 对象是不会变得，但是会被 jvm 回收掉。



怎样将GB2312编码的字符串转换为ISO-8859-1编码的字符串？



try-catch-finally-return执行顺序



Java 7新的 try-with-resources语句，平时有使用吗



简述一下面向对象的”六原则一法则”。



switch是否能作用在byte 上，是否能作用在long 上，是否能作用在String上？



数组有没有length()方法？String有没有length()方法？



是否可以从一个静态（static）方法内部发出对非静态（non-static）方法的调用？



String s = new String("jay");创建了几个字符串对象？



匿名内部类是否可以继承其它类？是否可以实现接口？



我们能将int强制转换为 byte类型的变量吗？如果该值大于byte 类型的范围，将会出现什么现象？



float f=3.4;正确吗？

你能写出一个正则表达式来判断一个字符串是否是一个数字吗？

Reader和InputStream区别？



## 列举出JAVA中6个比较常用的包

- util
- io
- lang 
- sql
- net
- math



## JDK 7有哪些新特性

switch可以使用string了

try-with-resources 资源的自动管理



## 同步和异步有什么区别？

实际开发中，Java一般使用什么数据类型来代表价格？

64 位 JVM 中，int 的长度是多数？

字节流与字符流的区别

Java 事件机制包括哪三个部分？分别介绍下。

为什么等待和通知是在 Object 类而不是 Thread 中声明的？

每个对象都可上锁，这是在 Object类而不是 Thread 类中声明，为什么呢？

为什么char 数组比Java中的 String 更适合存储密码？

如何使用双重检查锁定在 Java 中创建线程安全的单例？

如果你的Serializable类包含一个不可序列化的成员，会发生什么？你是如何解决的？



## Java 中，Maven 和 ant，gradle 有什么区别？

- **ANT**是最早的构建工具，基于idea,好象是2000年有的，当时是最流行java构建工具，不过它的XML脚本编写格式让XML文件特别大。
- **Maven**它是用来给Ant补坑的，Maven第一次支持了从网络上下载的功能，仍然采用xml作为配置文件格式，它的问题是不能很好的相同库文件的版本冲突。Maven专注的是依赖管理，构建神马的并不擅长
- **Gradle**是一个自动化的构建工具，**Gradle**属于结合以上两个的优点，它继承了Ant的灵活和Maven的生命周期管理，它最后被google作为了Android御用管理工具。它最大的*区别是不用XML作为配置文件格式，采用了DSL格式，使得脚本更加简洁。



## Java默认提供的序列化有那些问题

- 无法跨语言：我认为这对于Java序列化的发展是致命的“失误”，因为Java序列化后的字节数组，其它语言无法进行反序列化。；
- 序列化后的码流太大:：相对于目前主流的序列化协议，Java序列化后的码流太大；
- 序列化的性能差：由于Java序列化采用同步阻塞IO，相对于目前主流的序列化协议，它的效率非常差。



## 常见的序列化协议有哪些

**XML（Extensible Markup Language）是一种常用的序列化和反序列化协议， 它历史悠久，从1998年的1.0版本被广泛使用至今**

优点

- 人机可读性好
- 可指定元素或特性的名称

缺点

- 序列化数据只包含数据本身以及类的结构，不包括类型标识和程序集信息。
- 类必须有一个将由 XmlSerializer 序列化的默认构造函数。
- 只能序列化公共属性和字段
- 不能序列化方法
- 文件庞大，文件格式复杂，传输占带宽

使用场景

- 当做配置文件存储数据
- 实时数据转换

**JSON(JavaScript Object Notation, JS 对象标记) 是一种轻量级的数据交换格式。它基于 ECMAScript (w3c制定的js规范)的一个子集， JSON采用与编程语言无关的文本格式，但是也使用了类C语言（包括C， C++， C#， Java， JavaScript， Perl， Python等）的习惯，简洁和清晰的层次结构使得 JSON 成为理想的数据交换语言**

优点

- 前后兼容性高
- 数据格式比较简单，易于读写
- 序列化后数据较小，可扩展性好，兼容性好
- 与XML相比，其协议比较简单，解析速度比较快

缺点

- 数据的描述性比XML差
- 不适合性能要求为ms级别的情况
- 额外空间开销比较大

适用场景（可替代ＸＭＬ）

- 跨防火墙访问
- 可调式性要求高的情况
- 基于Web browser的Ajax请求
- 传输数据量相对小，实时性要求相对低（例如秒级别）的服务

**Fastjson是一个Java语言编写的高性能功能完善的JSON库。它采用一种“假定有序快速匹配”的算法，把JSON Parse的性能提升到极致。**

优点

- 接口简单易用
- 目前java语言中最快的json库

缺点

- 过于注重快，而偏离了“标准”及功能性
- 代码质量不高，文档不全

适用场景

- 协议交互
- Web输出
- Android客户端

**Thrift并不仅仅是序列化协议，而是一个RPC框架。它可以让你选择客户端与服务端之间传输通信协议的类别，即文本(text)和二进制(binary)传输协议, 为节约带宽，提供传输效率，一般情况下使用二进制类型的传输协议。**

优点

- 序列化后的体积小, 速度快
- 支持多种语言和丰富的数据类型
- 对于数据字段的增删具有较强的兼容性
- 支持二进制压缩编码

缺点

- 使用者较少
- 跨防火墙访问时，不安全
- 不具有可读性，调试代码时相对困难
- 不能与其他传输层协议共同使用（例如HTTP）
- 无法支持向持久层直接读写数据，即不适合做数据持久化序列化协议

适用场景

- 分布式系统的RPC解决方案

**Avro属于Apache Hadoop的一个子项目。 Avro提供两种序列化格式：JSON格式或者Binary格式。Binary格式在空间开销和解析性能方面可以和Protobuf媲美，Avro的产生解决了JSON的冗长和没有IDL的问题**

优点

- 支持丰富的数据类型
- 简单的动态语言结合功能
- 具有自我描述属性
- 提高了数据解析速度
- 快速可压缩的二进制数据形式
- 可以实现远程过程调用RPC
- 支持跨编程语言实现

缺点

- 对于习惯于静态类型语言的用户不直观

适用场景

- 在Hadoop中做Hive、Pig和MapReduce的持久化数据格式

**protocol buffers 由谷歌开源而来，在谷歌内部久经考验。它将数据结构以.proto文件进行描述，通过代码生成工具可以生成对应数据结构的POJO对象和Protobuf相关的方法和属性。**

优点

- 序列化后码流小，性能高
- 结构化数据存储格式（XML JSON等）
- 通过标识字段的顺序，可以实现协议的前向兼容
- 结构化的文档更容易管理和维护

缺点

- 需要依赖于工具生成代码
- 支持的语言相对较少，官方只支持Java 、C++ 、Python

适用场景

- 对性能要求高的RPC调用
- 具有良好的跨防火墙的访问属性
- 适合应用层对象的持久化



**protostuff 基于protobuf协议，但不需要配置proto文件，直接导包即**

**Jboss marshaling 可以直接序列化java类， 无须实java.io.Serializable接口**

**Message pack 一个高效的二进制序列化格式**

**Hessian 采用二进制协议的轻量级remoting onhttp工具**

**kryo 基于protobuf协议，只支持java语言,需要注册（Registration），然后序列化（Output），反序列化（Input**



## @Transactional注解事务的特性

- 1、service类标签(一般不建议在接口上)上添加@Transactional，可以将整个类纳入spring事务管理，在每个业务方法执行时都会开启一个事务，不过这些事务采用相同的管理方式。

- 2、@Transactional 注解只能应用到 public 可见度的方法上。 如果应用在protected、private或者 package可见度的方法上，也不会报错，不过事务设置不会起作用。

- 3、默认情况下，Spring会对unchecked异常进行事务回滚；如果是checked异常则不回滚。 
  辣么什么是checked异常，什么是unchecked异常

- > java里面将派生于Error或者RuntimeException（比如空指针，1/0）的异常称为unchecked异常，其他继承自java.lang.Exception得异常统称为Checked Exception，如IOException、TimeoutException等

- 4、只读事务： 
  @Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true) 
  只读标志只在事务启动时应用，否则即使配置也会被忽略。 
  启动事务会增加线程开销，数据库因共享读取而锁定(具体跟数据库类型和事务隔离级别有关)。通常情况下，仅是读取数据时，不必设置只读事务而增加额外的系统开销。



## 事务传播模式

- REQUIRED(默认模式)：业务方法需要在一个容器里运行。如果方法运行时，已经处在一个事务中，那么加入到这个事务，否则自己新建一个新的事务。
- NOT_SUPPORTED：声明方法不需要事务。如果方法没有关联到一个事务，容器不会为他开启事务，如果方法在一个事务中被调用，该事务会被挂起，调用结束后，原先的事务会恢复执行。
- REQUIRESNEW：不管是否存在事务，该方法总汇为自己发起一个新的事务。如果方法已经运行在一个事务中，则原有事务挂起，新的事务被创建。
-  MANDATORY：该方法只能在一个已经存在的事务中执行，业务方法不能发起自己的事务。如果在没有事务的环境下被调用，容器抛出例外。
- SUPPORTS：该方法在某个事务范围内被调用，则方法成为该事务的一部分。如果方法在该事务范围外被调用，该方法就在没有事务的环境下执行。
- NEVER：该方法绝对不能在事务范围内执行。如果在就抛例外。只有该方法没有关联到任何事务，才正常执行。
- NESTED：如果一个活动的事务存在，则运行在一个嵌套的事务中。如果没有活动事务，则按REQUIRED属性执行。它使用了一个单独的事务，这个事务拥有多个可以回滚的保存点。内部事务的回滚不会对外部事务造成影响。它只对DataSourceTransactionManager事务管理器起效。



## @transactional注解在什么情况下会失效，为什么

1、检查你方法是不是public的

2、你的异常类型是不是unchecked异常 
如果我想check异常也想回滚怎么办，注解上面写明异常类型即可

```java
@Transactional(rollbackFor=Exception.class)  
```

类似的还有norollbackFor，自定义不回滚的异常

3、数据库引擎要支持事务，如果是MySQL，注意表要使用支持事务的引擎，比如innodb，如果是myisam，事务是不起作用的

4、是否开启了对注解的解析

```java
<tx:annotation-driven transaction-manager="transactionManager" proxy-target-class="true"/>
```

 

5、spring是否扫描到你这个包，如下是扫描到org.test下面的包

```java
<context:component-scan base-package="org.test" ></context:component-scan>
```

 

6、检查是不是同一个类中的方法调用（如a方法调用同一个类中的b方法） 
7、异常是不是被你catch住了



## Java 中，DOM 和SAX 解析器是什么？

- dom是w3c指定的一bai套规范标准，核心是按树形du结构处理数据，dom解析器读入xml文件并在内存中zhi建立一个结构一模一样dao的“树”，这树各节点和xml各标记对应，通过操纵此“树”来处理xml中的文件。
- xml文件很大时，建立的“树”也会大，所以会大量占用内存。
  sax解析器占内存少，效率高。
  sax解析器核心是事件处理机制。
- 例如解析器发现一个标记的开始标记时，将所发现的数据会封装为一个标记开始事件，
- 并把这个报告给事件处理器，事件处理器再调用方法（startElement）处理发现的数据。
- 事件处理器可以自己编写也可以从父类继承。



## Java 中，DOM 和SAX 解析器有什么不同？

- DOM 解析器将整个 XML 文档加载到内存来创建一棵 DOM 模型树，这样可以 更快的查找节点和修改 XML 结构，
- 而 SAX 解析器是一个基于事件的解析器，不会将整个 XML 文档加载到内存。
- 由于这个原因，DOM 比 SAX 更快，也要 求更多的内存，不适合于解析大 XML 文件。



## 数组在内存中如何分配；





## 什么是 Busy spin？我们为什么要使用它？

Busy spin 是一种在不释放 CPU 的基础上等待事件的技术。

它经常用于避免丢 失 CPU 缓存中的数据（如果线程先暂停，之后在其他 CPU 上运行就会丢失）

如果你的工作要求低延迟，并且你的线程目前没有任何顺序，这样你就可 以通过循环检测队列中的新消息来代替调用 sleep() 或 wait() 方法。

它唯一的 好处就是你只需等待很短的时间，如几微秒或几纳秒。

LMAX 分布式框架是一个 高性能线程间通信的库，该库有一个 BusySpinWaitStrategy 类就是基于这个概 念实现的，

使用 busy spin 循环 EventProcessors 等待屏障



## Java 中怎么获取一份线程 dump 文件？

当服务器挂起bai,崩溃或者性能底下时,就需要抓取服务du器的线程堆zhi栈(Thread Dump)用于后续的分dao析.

Thread dump提供了当前活动的线程的快照. 它提供了JVM中所有Java线程的栈跟踪信息

有很多方式可用于获取Thread Dump, 一些是操作系统特定的命令.





父类的静态方法能否被子类重写

什么是不可变对象

如何正确的退出多层嵌套循环？

SimpleDateFormat是线程安全的吗?你一般怎么格式化

抽象类必须要有抽象方法吗？

怎么实现动态代理？有哪些应用

什么是内部类？内部类的作用

泛型中extends和super的区别

内部类有几种，在项目中的有哪些应用

utf-8编码中的中文占几个字节；int型几个字节？



## 说说你对Java注解的理解

- 它是从JDK5及其以后JDK版本开始支持Java注解
- 注解，也叫元数据。
- 可以声明在包、类、字段、方法、局部变量、方法参数等前面，来对这些元素进行说明。

- 不带参数，语法结构为：@Annotation

![img](https://img-blog.csdn.net/20180805092502544?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3poZW5saWFuZ2l0MDkxOA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

- 带一个参数的注解，语法结构为：@Annotation(参数)

![img](https://img-blog.csdn.net/2018080509252843?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3poZW5saWFuZ2l0MDkxOA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

- 带多个参数的注解，语法结构为：@Annotiation(参数1, 参数2, 参数3...)

![img](https://img-blog.csdn.net/20180805092541731?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3poZW5saWFuZ2l0MDkxOA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)



## java内置注解

1、@Override注解

​	@Override被用于标注方法，用于说明所标注的方法是重写父类的方法：

![img](https://img-blog.csdn.net/20180805092849557?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3poZW5saWFuZ2l0MDkxOA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

![img](https://img-blog.csdn.net/20180805092857497?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3poZW5saWFuZ2l0MDkxOA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)



2、@Deprecated

@Deprecated 用于说明所标注元素（成员变量或方法）因存在安全问题或有更好选择而不鼓励程序员使用，如果强行使用，则编译器会发出警告。

![img](https://img-blog.csdn.net/2018080509295185?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3poZW5saWFuZ2l0MDkxOA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)





3.@SuppressWarnings注解

​		@SuppressWarnings用于取消编译器所显示的警告，该注解常用属性值如下：

- ---deprecation：使用已被@Deprecated标注的程序元素；

- ![img](https://img-blog.csdn.net/20180805093035418?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3poZW5saWFuZ2l0MDkxOA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

- ---unused：程序含有未被使用的元素；

- ![img](https://img-blog.csdn.net/20180805093045701?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3poZW5saWFuZ2l0MDkxOA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

- ---serial：在可序列化的类上缺少serialVersionUID定义；

  ![img](https://img-blog.csdn.net/20180805093058469?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3poZW5saWFuZ2l0MDkxOA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)



## java自定义注解

注解语法结构如下：

[public] @interface 注解名 {

   [属性1;]

   [属性2;]

   ...  

   [属性n;]

}



## 元注解

*Java提供了四个用于修饰自定义注解的元注解：*

*@Target、@Retention 、@Documented和@Inherited*

@Target：

- 用于指定被修饰的自定义注解只能用于修饰程序中哪些元素，该元注解有如下属性值：
- ElementType.ANNOTATION_TYPE：应用于其他注解的元注解
- ElementType.CONSTRUCTOR：应用于构造函数
- ElementType.FIELD：应用于全局属性
- ElementType.LOCAL_VARIABLE：应用于方法中的本地变量
- ElementType.METHOD：应用于方法 ElementType.PACKAGE：应用于包
- ElementType.PARAMETER：应用于方法的参数
- ElementType.TYPE：应用于类、接口或者枚举声明
- ![img](https://img-blog.csdn.net/20180805093757319?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3poZW5saWFuZ2l0MDkxOA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

@Retention：

- 用于指定被修饰的自定义注解可以保留多久，该元注解有如下属性值：
- RetentionPolicy.SOURCE：编译器将直接丢弃被修饰的注解。
- RetentionPolicy.CLASS：默认值，编译器将把注解记录在class文件中，当运行Java程序时，虚拟机不再保留注解；
- RetentionPolicy.RUNTIME：编译器将把注解记录在class文件中，当运行java程序时，虚拟机保留注解，程序可以通过反射获取该注解；



@Documented：

- 执行javadoc命令时，被该元注解修饰的自定义注解也会生成在文档中



@Inherited：

- 如果父类所使用的注解有@Inherited修饰，则子类可以继承该注解，否则不能继承。



**注解工作原理的实质是反射知识的应用**



## Java 中 java.util.Date 与 java.sql.Date 有什么区别？

- 而这三个类都是对应与jdbc处理日期格式的类，有着 不同的日期精度和格式
-  java.sql.Date是java.util.Date的子类，是一个包装了毫秒值的瘦包装器，允bai许 JDBC 将毫秒值标识为du SQL DATE 值
- 我们使用jdbc查询的时候getDate方法返bai回的就是一个java.sql.Date对象



## 说一下隐式类型转换

抽象类能使用final修饰吗

给我一个符合开闭原则的设计模式的例子

Files的常用方法都有哪些



## Java 中，Serializable与Externalizable 的区别？

- Serializable 接口是一个序列化 Java 类的接口，以便于它们可以在网络上传输 
- 或者可以将它们的状态保存在磁盘上，是 JVM 内嵌的默认序列化方式，成本高、脆弱而且不安全。
- Externalizable 允许你控制整个序列化过程，指定特定的二进 制格式，增加安全机制。



## Java锁有哪些种类，它们都有哪些区别

- 公平锁/非公平锁
- 可重入锁
- 独享锁/共享锁
- 互斥锁/读写锁
- 乐观锁/悲观锁
- 分段锁
- 偏向锁/轻量级锁/重量级锁
- 自旋锁





抽象的方法是否可同时是静态的）,是否可同时是本地方法），是否可同时被 synchronized 修饰？

一个”.java”源文件中是否可以包含多个类（不是内部类）？有什么限制？

说说代理的实现原理

了解哪设计模式，举例说说在jdk源码哪些用到了你说的设计模式

## 什么是B/S架构？什么是C/S架构

Java有那些开发平台呢？

Java内部类为什么可以访问到外部类呢？

Java支持的数据类型有哪些？什么是自动拆装箱呢？



hashCode()和equals()方法的重要性体现在什么地方？

如何通过反射获取和设置对象私有字段的值？

如何通过反射调用对象的方法？

简述一下面向对象的"六原则一法则"

Java 对象不使用时为什么要赋值为 null？

什么时候用断言（assert）？

AJAX请求为什么不安全？

一个Java字符串中到底能有多少个字符?



StringBuilder为什么线程不安全？



深克隆和浅克隆

聊一聊设计模式的基本原则

Java 能否自定义一个类叫 java.lang.System？

Java中的两种异常类型是什么？他们有什么区别？

Java中Exception和Error有什么区别？

throw和throws有什么区别？

异常处理完成以后，Exception对象会发生什么变化？

什么是RMI？

解释下Serialization和Deserialization。

环境变量Path和ClassPath的作用是什么？如何设置这两个环境变量？

## 字符型常量和字符串常量的区别

- 形式上: 字符常量是单引号引起的一个字符; 字符串常量是双引号引起的若干个字符
- 含义上: 字符常量相当于一个整型值( ASCII 值),可以参加表达式运算; 字符串常量代表一个地址值(该字符串在内存中存放位置)
- 占内存大小 字符常量只占**2个**字节; 字符串常量占若干个字节(至少一个字符结束标志) (注意： **char在Java中占两个字节**)



构造器Constructor是否可被override

什么是方法的返回值？返回值在类的方法里的作用是什么？

一个类的构造方法的作用是什么？若一个类没有声明构造方法，改程序能正确执行吗？为什么？

静态方法和实例方法有何不同？

对象的相等与指向他们的引用相等，两者有什么不同？



## 用 Java 写一个线程安全的单例模式

**饿汉式单例，指在方法调用前，实例就已经创建好了**

```java
public class SingletonByHunger {
    private static SingletonByHunger singletonByHunger = new SingletonByHunger();
    private SingletonByHunger(){
    }
    public static SingletonByHunger getSingletonByHunger() {
        return singletonByHunger;
    }
}

```

**懒汉式单例，指在调用的时候才去创建这个实例，为了防止对象被多次创建，使用synchronized进行方法同步**

优点：充分利用了延迟加载，只在真正需要时创建对象

缺点：并发环境下加锁，竞争激烈的场合对性能可能会产生一定的影响

```java
public class SingletonByLaze {
    private static SingletonByLaze singletonByLaze;
    private SingletonByLaze(){
    }
    public static synchronized  SingletonByLaze getSingletonByLaze() {
        if (singletonByLaze == null){
            singletonByLaze = new SingletonByLaze();
        }
        return singletonByLaze;
    }
}
```

**使用静态内部类的方式**

利用classloder机制来保证初始化instance时只有一个线程

这种方式是Singleton类被加载了，instance也不一定被初始化，只有通过调用getInstance()方法时才会显式装载SingleByInnerClassHope类，

从而实例化instance，可以做到真正需要的时候创建实例

```java
public class SingleByInnerClass {
    private SingleByInnerClass(){ }

    public static SingleByInnerClass getInstance() {
        return SingleByInnerClassHope.innerClass;
    }

    private static class  SingleByInnerClassHope{
       private static SingleByInnerClass innerClass = new SingleByInnerClass();
    }
}

```

**双重校验锁，不推荐**

为什么用两个if判断这个对象是否是空？

因为当有多个线程同时创建对象的时候，多个线程有可能都停止在第一个if判断的地方，等待锁的释放，然后多个线程都创建了对象.

```java
public class SingletonByDoubleCheck {
    private volatile static SingletonByDoubleCheck instance = null;
    private SingletonByDoubleCheck() { }
    public static SingletonByDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonByDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonByDoubleCheck();
                }
            }
        }
        return instance;
    }
}
```

**使用static代码块**

静态代码块中的代码在使用类的时候就已经执行

```java

public class Singleton {
	private static Singleton instance=null;
	private Singleton(){}
	static {
		instance=new Singleton();
	}
	public static Singleton getInstance(){
		return instance;
	}

```

**使用枚举数据类型**

```java
public class Singleton {
	private enum MyEnumSingleton{
		singletonFactory;
		private Singleton instance;
//		枚举类的构造方法在类加载时被实例化
		private MyEnumSingleton(){
			instance=new Singleton();
		}
		public Singleton getInstance(){
			return instance;
		}
	}
	public static Singleton getInstance(){
		return MyEnumSingleton.singletonFactory.getInstance();
	}

```



我能在不进行强制转换的情况下将一个 double值赋值给 long类型的变量吗？

java 枚举类型是否可以继承 (final)？

Cloneable 接口实现原理？



## 继承和聚合的区别



## 能用Java覆盖静态方法吗？如果我在子类中创建相同的方法是编译时错误



## 什么是Java程序的主类？应用程序和小程序的主类有何不同





## instanceof 工作中使用过吗



## Java自带线程池判断线程池是否已经结束运行的方法叫什么



## 成员变量与局部变量的区别有那些

- **从语法形式上**，成员变量是属于类的，而局部变量是属于方法的，
- 成员变量可以被 修饰符，public，private，protected 和 static 所修饰，而局部变量不可以

- final 是可以修饰 成员变量和局部变量的。

- **从存储方式来看**，如果成员变量被 static 修饰了，那么这个成员变量是属于类的，
- 如果没有被 static 修饰，那这个成员变量是属于实例的，

- 对象存在于堆内存，局部变量存在于栈内存中。 

- **从生存时间上来看**，成员变量是对象的一部分，它随着对象的创建而存在，
- 局部变量是随着方法的调用而自动消失的。

- 成员变量都是有默认的初始值的，

- 而局部变量是没有的，需要赋初始值之后才能使用




## 创建一个对象用什么运算符? 对象实体与对象引用有何不同

new运算符，new创建对象实例（对象实例在堆内存中），

对象引用指向对象实例（对象引用存放在栈内存中）

一个对象引用可以指向0个或1个对象（一根绳子可以不系气球，也可以系一个气球）

一个对象可以有n个引用指向它（可以用n条绳子系住一个气球）



## 一行Java代码是如何执行的

一行代码能够执行，必须要有可以执行的上下文环境，

包括，指令寄存器，数据寄存器，栈空间等内存资源，

然后这行代码必须作为一个执行流能够被操作系统的任务调度器识别，并给他分配 CPU 资源，

当然这行代码所代表的指令必须是 CPU 可以解码识别的，

所以一行 Java 代码必须被解释成对应的 CPU 指令才能执行



Java 是一门高级语言，这类语言不能直接运行在硬件上，必须运行在能够识别 Java 语言特性的虚拟机上，

而 Java 代码必须通过 Java 编译器将其转换成虚拟机所能识别的指令序列，

也称为 Java 字节码，之所以称为字节码是因为 Java 字节码的操作指令（OpCode）被固定为一个字节

以下为 System.out.println("Hello world") 编译后的字节码:

``` java
0x00:  b2 00 02         getstatic  Java .lang.System.out
0x03:  12 03            ldc "Hello， World!"
0x05:  b6 00 04         invokevirtual  Java .io.PrintStream.println
0x08:  b1               return
```





