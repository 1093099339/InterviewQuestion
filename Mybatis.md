## mybatis 中 #{}和 ${}的区别是什么？

- \#{} 占位符，即sql 预编译，对应的变量自动加上单引号，能防止sql 注入	
-  ${} 拼接符，sql 拼接，对应的变量不会加上单引号，不能防止sql 注入



## 什么是SQL注入 ，如何避免

就是通过把SQL命令插入到Web表单提交或输入域名bai或页面请求的查询字符串，最终达到欺骗服务器执行恶意的SQL命令。





## 说一下 `mybatis` 的一级缓存和二级缓存

- 一级缓存是`SqlSession`级别的缓存。
- 在操作数据库时需要构造 `sqlSession`对象，在对象中有一个(内存区域)数据结构`（HashMap）`用于存储缓存数据。
- 不同的`sqlSession`之间的缓存数据区域`（HashMap）`是互相不影响的
- `Mybatis`默认开启一级缓存。
- 一级缓存的作用域是同一个`SqlSession`，在同一个`sqlSession`中两次执行相同的`sql`语句，第一次执行完毕会将数据库中查询的数据写到缓存（内存），
- 第二次会从缓存中获取数据将不再从数据库查询，从而提高查询效率。
- 当一个`sqlSession`结束后该`sqlSession`中的一级缓存也就不存在了。
- 只要是在同一个`sqlssesion`中，一级缓存才会生效，
- 如果`sqlssesion.commit()`或者是`sqlsession.close()`就会清空`sqlssion`，一级缓存也随之消失。
- 

- 二级缓存是mapper级别的缓存，多个SqlSession去操作同一个Mapper的sql语句，
- 多个SqlSession去操作数据库得到数据会存在二级缓存区域，多个SqlSession可以共用二级缓存，二级缓存是多个SqlSession共享的



开启二级缓存 

```java
<setting name="cacheEnabled" value="true"/></settings>
```



在UserMapper.xml中开启二缓存，UserMapper.xml下的sql执行完成会存储到它的缓存区域（HashMap）。

下面是开启redis缓存：

```xml
<mapper namespace="cn.mybatis.xml.mapper.UserMapper">
 
	<!-- redis配置项 -->
	<cache type="org.mybatis.caches.redis.RedisCache" /> 
```





## mybatis 是否支持延迟加载？延迟加载的原理是什么？

Mybatis 仅支持 association 关联对象和 collection 关联集合对象的延迟加载，

association 指的就是一对一，collection 指的就是一对多查询

在 Mybatis配置文件中，可以配置是否启用延迟加载 lazyLoadingEnabled=true|false



它的原理是，使用 CGLIB 创建目标对象的代理对象，当调用目标方法时，进入拦截器方法，比如调用 a.getB().getName()，拦截器 invoke()方法发现 a.getB()是null 值，那么就会单独发送事先保存好的查询关联 B 对象的 sql，把 B 查询上来，然后调用 a.setB(b)，于是 a 的对象 b 属性就有值了，接着完成 a.getB().getName()方法的调用。这就是延迟加载的基本原理。当然了，不光是 Mybatis，几乎所有的包括 Hibernate，支持延迟加载的原理都是一样的。



## mybatis 动态sql中使用标签与直接写where关键字有什么区别？

当if条件都不满足的时候，where元素中没有内容，所以在SQL中不会出现where

如果if条件满足，where元素的内容就是以and开头的条件，where会自动去掉开头的and，这也能保证where条件正确。



## mybatis 动态sql标签中循环标签中有哪些属性，各自的作用。



## mybatis 和 hibernate 的区别有哪些？

#### （1）hibernate是全自动，而mybatis是半自动

- hibernate完全可以通过对象关系模型实现对数据库的操作，拥有完整的JavaBean对象与数据库的映射结构来自动生成sql。
- 而mybatis仅有基本的字段映射，对象数据以及对象实际关系仍然需要通过手写sql来实现和管理。

#### （2）hibernate数据库移植性远大于mybatis

- hibernate通过它强大的映射结构和hql语言，大大降低了对象与数据库（Oracle、MySQL等）的耦合性，
- 而mybatis由于需要手写sql，因此与数据库的耦合性直接取决于程序员写sql的方法，
- 如果sql不具通用性而用了很多某数据库特性的sql语句的话，移植性也会随之降低很多，成本很高。

#### （3）hibernate拥有完整的日志系统，mybatis则欠缺一些

- hibernate日志系统非常健全，涉及广泛，包括：sql记录、关系异常、优化警告、缓存提示、脏数据警告等；
- 而mybatis则除了基本记录功能外，功能薄弱很多。	

#### （4）mybatis相比hibernate需要关心很多细节

- hibernate配置要比mybatis复杂的多，学习成本也比mybatis高。
- 但也正因为mybatis使用简单，才导致它要比hibernate关心很多技术细节。
- mybatis由于不用考虑很多细节，开发模式上与传统jdbc区别很小，因此很容易上手并开发项目，
- 但忽略细节会导致项目前期bug较多，因而开发出相对稳定的软件很慢，而开发出软件却很快。
- hibernate则正好与之相反。但是如果使用hibernate很熟练的话，实际上开发效率丝毫不差于甚至超越mybatis。

#### （5）sql直接优化上，mybatis要比hibernate方便很多

- 由于mybatis的sql都是写在xml里，因此优化sql比hibernate方便很多。
- 而hibernate的sql很多都是自动生成的，无法直接维护sql；
- 虽有hql，但功能还是不及sql强大，见到报表等变态需求时，hql也歇菜，也就是说hql是有局限的；
- hibernate虽然也支持原生sql，但开发模式上却与orm不同，需要转换思维，因此使用上不是非常方便。
- 总之写sql的灵活度上hibernate不及mybatis。

#### （6）缓存机制上，hibernate要比mybatis更好一些

- MyBatis的二级缓存配置都是在每个具体的表-对象映射中进行详细配置，这样针对不同的表可以自定义不同的缓存机制。

- 并且Mybatis可以在命名空间中共享相同的缓存配置和实例，通过Cache-ref来实现。

- 而Hibernate对查询对象有着良好的管理机制，用户无需关心SQL。

- 所以在使用二级缓存时如果出现脏数据，系统会报出错误并提示。

  

#### （1）两者相同点

- Hibernate和Mybatis的二级缓存除了采用系统默认的缓存机制外，都可以通过实现你自己的缓存或为其他第三方缓存方案，创建适配器来完全覆盖缓存行为。

#### （2）两者不同点

- Hibernate的二级缓存配置在SessionFactory生成的配置文件中进行详细配置，然后再在具体的表-对象映射中配置是那种缓存。
- 而MyBatis在使用二级缓存时需要特别小心。如果不能完全确定数据更新操作的波及范围，避免Cache的盲目使用。
- 否则，脏数据的出现会给系统的正常运行带来很大的隐患。
- Mybatis 和 hibernate 不同，它不完全是一个 ORM 框架，因为 MyBatis 需要程序员自己编写 Sql 语句。
- Mybatis 直接编写原生态 sql，可以严格控制 sql 执行性能，灵活度高，非常适合对关系数据模型要求不高的软件开发，
- 因为这类软件需求变化频繁，一但需求变化要求迅速输出成果。
- 但是灵活的前提是 mybatis 无法做到数据库无关性，如果需要实现支持多种数据库的软件，则需要自定义多套 sql 映射文件，工作量大。
- Hibernate 对象/关系映射能力强，数据库无关性好，对于关系模型要求高的软件，如果用 hibernate 开发可以节省很多代码，提高效率。
- Hibernate 不需要编写大量的 SQL，就可以完全映射，提供了日志、缓存、级联（级联比 MyBatis 强大）等特性，此外还提供 HQL（Hibernate Query Language）对 POJO 进行操作。但会多消耗性能。
- MyBatis 手动编写 SQL，支持动态 SQL、处理列表、动态生成表名、支持存储过程。工作量相对大些。
- MyBatis 是一个半自动映射的框架，因为 MyBatis 需要手动匹配 POJO、SQL 和映射关系。
- Hibernate 是一个全表映射的框架，只需提供 POJO 和映射关系即可。
- Hibernate 的 DAO 层开发比 MyBatis 简单，[Mybatis](http://c.biancheng.net/mybatis/) 需要维护 SQL 和结果映射。
- Hibernate 对对象的维护和缓存要比 MyBatis 好，对增删改查的对象的维护要方便。
- Hibernate 数据库移植性很好，MyBatis 的数据库移植性不好，不同的数据库需要写不同 SQL。
- Hibernate 有更好的二级缓存机制，可以使用第三方缓存。MyBatis 本身提供的缓存机制不佳。
- MyBatis 可以进行更为细致的 SQL 优化，可以减少查询字段。
- MyBatis 容易掌握，而 Hibernate 门槛较高。

MyBatis 是一个小巧、方便、高效、简单、直接、半自动化的持久层框架，Hibernate 是一个强大、方便、高效、复杂、间接、全自动化的持久层框架。

所以对于性能要求不太苛刻的系统，比如管理系统、ERP 等推荐使用 Hibernate，而对于性能要求高、响应快、灵活的系统则推荐使用 MyBatis。



## RowBounds是一次性查询全部结果吗？为什么？

- RowBounds 表面是在“所有”数据中检索数据，其实并非是一次性查询出所有数据，
- 因为 MyBatis 是对 jdbc 的封装，在 jdbc 驱动中有一个 Fetch Size 的配置，它规定了每次最多从数据库查询多少条数据，
- 假如你要查询更多数据，它会在你执行 next()的时候，去查询更多的数据



## MyBatis 定义的接口，怎么找到实现的？







## Mybatis的底层实现原理。



## Mybatis是如何进行分页的？分页插件的原理是什么？





## Mybatis执行批量插入，能返回数据库主键列表吗？

- Mybatis在插入单条数据的时候有两种方式返回自增主键：
- 对于支持生成自增主键的数据库：增加 useGenerateKeys和keyProperty ，<insert>标签属性。
- 不支持生成自增主键的数据库：使用<selectKey>。

```xml
<insert id="insertAuthor" useGeneratedKeys="true"
    keyProperty="id">
  insert into Author (username, password, email, bio) values
  <foreach item="item" collection="list" separator=",">
    (#{item.username}, #{item.password}, #{item.email}, #{item.bio})
  </foreach>
</insert>123456
```

- 从官网资料可以看出Mybatis是支持批量插入时返回自增主键的。

- https://blog.csdn.net/u013738122/article/details/105559933



## Mybatis都有哪些Executor执行器？它们之间的区别是什么？

- Mybatis有三种基本的Executor执行器，SimpleExecutor、ReuseExecutor、BatchExecutor。
- SimpleExecutor：每执行一次update或select，就zhi开启dao一个Statement对象，用完立刻关闭Statement对象。
- ReuseExecutor：执行update或select，以sql作为key查找Statement对象，存在就使用，不存在就创建，
- 用完后，不关闭Statement对象，而是放置于Map<String, Statement>内，供下一次使用。简言之，就是重复使用Statement对象。
- BatchExecutor：执行update（没有select，JDBC批处理不支持select），将所有sql都添加到批处理中（addBatch()），等待统一执行（executeBatch()），
- 它缓存了多个Statement对象，每个Statement对象都是addBatch()完毕后，等待逐一执行executeBatch()批处理。与JDBC批处理相同。
- 作用范围：Executor的这些特点，都严格限制在SqlSession生命周期范围内。



## Mybatis动态sql有什么用？执行原理？有哪些动态sql？

- Mybatis 动态 sql 可以在 Xml 映射文件内，以标签的形式编写动态 sql，
- 执行原理是根据表达式的值 完成逻辑判断并动态拼接 sql 的功能。
- Mybatis 提供了 9 种动态 sql 标签：
- trim | where | set | foreach | if | choose| when | otherwise | bind。



## mybatis有几种分页方式？

- **逻辑分页：** 使用 MyBatis 自带的 RowBounds 进行分页，它是一次性查询很多数据，然后在数据中再进行检索。
- **物理分页：** 自己手写 SQL 分页或使用分页插件 PageHelper，去数据库查询指定条数的分页数据的形式。



## MyBatis框架的优点和缺点

**MyBatis框架的优点**

1. 与JDBC相比，减少了50%以上的代码量。

2.  MyBatis是最简单的持久化框架，小巧并且简单易学。

3. MyBatis相当灵活，不会对应用程序或者数据库的现有设计强加任何影响，SQL写在XML里，从程序代码中彻底分离，降低耦合度，便于统一管理和优化，并可重用。

4. 提供XML标签，支持编写动态SQL语句。

5.  提供映射标签，支持对象与数据库的ORM字段关系映射。.

  

**MyBatis框架的缺点**

1. SQL语句的编写工作量较大，尤其是字段多、关联表多时，更是如此，对开发人员编写SQL语句的功底有一定要求。
2. SQL语句依赖于数据库，导致数据库移植性差，不能随意更换数据库。





## 使用MyBatis框架，当实体类中的属性名和表中的字段名不一样 ，怎么办 ？



- 写sq语句时起别名，别名跟类名属性保持一致

- 在MyBatis的全局配置文件中开启驼峰命名规则

  ```xml
  <configuration>
      <settings>
          <!-- 开启驼峰命名规则，可以将数据库中的下划线映射为驼峰命名 -->
          <!-- 例如：dept_id 可以映射为deptId -->
          <setting name="mapUndercoreToCamelCase" value="true" /></setting>
      </settings>
  </configuration>
  1234567
  ```

- 在Mapper映射文件中使用`resultMap`来自定义映射规则



## 通常一个Xml映射文件，都会写一个Dao接口与之对应，请问，这个Dao接口的工作原理是什么？Dao接口里的方法，参数不同时，方法能重载吗？

Mapper 接口里的方法，是不能重载的,因为是使用 全限名+方法名 的保存和寻找策略

Mapper 接口的工作原理是 JDK 动态代理，Mybatis 运行时会使用 JDK动态代理为 Mapper 接口生成代理对象 proxy，

代理对象会拦截接口方法，转而执行 MapperStatement 所代表的 sql，然后将 sql 执行结果返回。



## Xml映射文件中，除了常见的select|insert|updae|delete标签之外，还有哪些标签？

还有很多其他的标签，<resultMap>、<parameterMap>、<sql>、<include>、<selectKey>，加上动态sql的9个标签，trim|where|set|foreach|if|choose|when|otherwise|bind等，

其中<sql>为sql片段标签，通过<include>标签引入sql片段，<selectKey>为不支持自增的主键生成策略标签



## 简述Mybatis的插件运行原理，以及如何编写一个插件。

Mybatis仅可以编写针对ParameterHandler、ResultSetHandler、StatementHandler、Executor这4种接口的插件，

Mybatis使用JDK的动态代理，为需要拦截的接口生成代理对象以实现接口方法拦截功能，

每当执行这4种接口对象的方法时，就会进入拦截方法，具体就是InvocationHandler的invoke()方法，当然，只会拦截那些你指定需要拦截的方法。

实现Mybatis的Interceptor接口并复写intercept()方法，然后在给插件编写注解，指定要拦截哪一个接口的哪些方法即可，记住，别忘了在配置文件中配置你编写的插件