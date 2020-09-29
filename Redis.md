#### 什么是Redis?

- Redis 是一个开源的使用 ANSI C 语言编写、遵守 BSD 协议、支持网络、可基于内存亦可持久化的日志型、Key-Value 数据库，并提供多种语言的 API的非关系型数据库。
- 传统数据库遵循 ACID 规则。而 Nosql（Not Only SQL 的缩写，是对不同于传统的关系型数据库的数据库管理系统的统称） 一般为分布式而分布式一般遵循 CAP 定理。

#### Redis支持的数据类型？

- String 字符串类型 
- 格式为 ： set  key  value
- String 类型是二进制安全的，意思是 Redis 的String可以包含任何数据。
- String 类型是Redis 最基本的数据类型，一个键最大可以存储 512 M
- 
- Hash（哈希）
- 格式: hmset name  key1 value1 key2 value2
- Redis hash 是一个键值(key=>value)对集合。
- Redis hash是一个string类型的field和value的映射表，hash特别适合用于存储对象。
- 
- List（列表）
- Redis 列表是简单的字符串列表，按照插入顺序排序。你可以添加一个元素到列表的头部（左边）或者尾部（右边）
- 格式: lpush  name  value
- 在 key 对应 list 的头部添加字符串元素
- 格式: rpush  name  value
- 在 key 对应 list 的尾部添加字符串元素
- 格式: lrem name  index
- key 对应 list 中删除 count 个和 value 相同的元素
- 格式: llen name  
- 返回 key 对应 list 的长度
- 
- Set（集合）
- 格式: sadd  name  value
- Redis的Set是string类型的无序集合。
- 集合是通过哈希表实现的，所以添加，删除，查找的复杂度都是O(1)。
- 
- zset(sorted set：有序集合)
- 格式: zadd  name score value
- Redis zset 和 set 一样也是string类型元素的集合,且不允许重复的成员。
- 不同的是每个元素都会关联一个double类型的分数。redis正是通过分数来为集合中的成员进行从小到大的排序。
- zset的成员是唯一的,但分数(score)却可以重复。

#### 什么是Redis持久化？Redis有哪几种持久化方式？优缺点是什么？

- 持久化就是把内存中的数据写道磁盘中去，防止服务器宕机内存数据丢失
- Redis提供了两种持久化方式 RDB 和 AOF
- 



1. Redis用过哪些数据类型，每种数据类型的使用场景
2. Redis缓存穿透、缓存雪崩和缓存击穿原因，以及解决方案
3. 如何使用Redis来实现分布式锁，redis分布式锁有什么缺陷？
4. Redis 持久化机制，有几种方式，优缺点是什么，怎么实现的，RDB和AOF的区别
5. Redis集群，高可用，原理。
6. Redis的数据淘汰策略
7. 为什么要用redis？为什么要用缓存，在哪些场景使用缓存
8. redis事务，了解吗，了解Redis事务的CAS操作吗
9. 如何解决 Redis 的并发竞争Key问题。
10. Redis为什么是单线程的，为什么单线程还这么快？
11. 如何保证缓存与数据库双写时的数据一致性?
12. redis和memcached有什么区别
13. JVM本地缓存，了解过吗
14. redis的list结构相关的操作。
15. redis2和redis3的区别，redis3内部通讯机制。
16. Redis的选举算法和流程是怎样的？
17. Reids的主从复制机制原理。
18. Redis的线程模型是什么？
19. Redis的使用要注意什么，讲讲持久化方式，内存设置，集群的应用和优劣势，淘汰策略等。
20. Redis缓存分片
21. redis的集群怎么同步的数据的？
22. 请思考一个方案，设计一个可以控制缓存总体大小的自动适应的本地缓存。
23. redis的哨兵模式，一个key值如何在redis集群中找到存储在哪里。
24. Redis，一个字符串类型的值能存储最大容量是多少？
25. MySQL里有2000w数据，redis中只存20w的数据，如何保证redis中的数据都是热点数据？
26. Redis和Redisson有什么关系？
27. Redis中的管道有什么用？
28. Redis事务相关的命令有哪几个？
29. Redis key的过期时间和永久有效分别怎么设置？
30. Redis回收使用的是什么算法？
31. 一个Redis实例最多能存放多少的keys？List、Set、Sorted Set他们最多能存放多少元素？
32. Redis—跳跃表，复杂度是多少？
33. Redis有哪些优缺点？为什么要用 Redis ？
34. 为什么要用Redis 而不用 map/guava 做缓存?
35. 如何用 Redis 统计独立用户访问量？
36. 如何选择合适的持久化方式
37. Redis持久化数据和缓存怎么做扩容？
38. Redis key的过期时间和永久有效分别怎么设置？
39. 我们知道通过expire来设置key 的过期时间，那么对过期的数据怎么处理呢?
40. Redis的过期键的删除策略
41. Redis的内存用完了会发生什么？
42. Redis如何做内存优化？
43. Redis事务的三个阶段
44. Redis事务相关命令
45. Redis事务保证原子性吗，支持回滚吗？
46. Redis事务支持隔离性吗？
47. Redis集群的主从复制模型是怎样的？
48. 生产环境中的 redis 是怎么部署的？
49. 说说Redis哈希槽的概念
50. Redis集群会有写操作丢失吗？为什么？
51. Redis集群最大节点个数是多少？
52. Redis集群如何选择数据库？
53. Redis是单线程的，如何提高多核CPU的利用率？
54. 为什么要做Redis分区？有什么缺点？
55. 你知道有哪些Redis分区实现方案？
56. 缓存的实现原理，设计缓存要注意什么
57. 如何解决 Redis 的并发竞争 Key 问题
58. 分布式Redis是前期做还是后期规模上来了再做好？为什么？
59. 什么是 RedLock？
60. Redis支持的Java客户端都有哪些？官方推荐用哪个？
61. 为什么Redis的操作是原子性的，怎么保证原子性
62. Redis常见性能问题和解决方案？
63. 一个字符串类型的值能存储最大容量是多少？
64. Redis如何做大量数据插入？
65. 假如Redis里面有1亿个key，其中有10w个key是以某个固定的已知的前缀开头的，如果将它们全部找出来？
66. 使用Redis做过异步队列吗，是如何实现的？
67. Redis如何实现延时队列？
68. Redis回收进程如何工作的？
69. 热点数据和冷数据是什么
70. 使用过Redis哪些命令？

