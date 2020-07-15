# SSM
Spring boot,Mybatis的整合总是很麻烦，在此提供一个已经整合好三大框架的包，可以直接下载导入Myeclipse使用，项目基于Maven做依赖管理。项目基于Mysql自带的Sakila数据库实现了MIS系统中常用的多个功能，运行前请安装好Mysql5.6。

其中包含的内容如下：

1.Spring boot 2.1.6,Mybatis3.2.2的整合；

2.前端框架采用https://adminlte.io ，后台的分页使用Mybatis的插件pagehelper实现；

3.数据库使用Mysql中自带的sakila数据库，使用前，请将application.properties中的spring.datasource.ssm.password中的数据库密码设置为自己的；

4.实现了sakila中的单表的增删改查和跨表查询，跨表查询包括了Mybatis的1-N和N-1双向映射；

5.不再使用作业自动调度框架Quartz实现作业调度，使用spring框架自带的调度器进行作业调度，简化了配置；

6.json插件使用阿里的开源fastjson工具,注意低版本的fastjson与swagger不兼容，这里有坑；

7.包含了一个文件上传的功能，可上传单个或多个文件；

8.包含了数据表导出为Excel下载的功能，包含了解析Excel内容的API，使用POI实现；

9.包含了带验证码的登录功能以及登录权限验证的拦截器, **登录用户名tom，密码1234**, **用户表在staff中，可自行添加**  ；

10.要使用Struts2+hibernate+spring的整合，[点击这里进入](https://github.com/shenzhanwang/SSH_maven)  

11.去掉所有JSP，使用HTML代替，有利于前后端分离;

12.整合日志工具log4j2，较log4j1.x有较大性能提升，支持日志文件输出和控制台输出；

13.整合接口文档swagger2.9.2，入口http://localhost:8080/swagger-ui.html

14.将后台接口REST化，详情参考https://gitee.com/shenzhanwang/Spring-REST

15.添加mybatis的动态SQL的使用

16.访问入口：http://localhost:8080/login

17.要使用传统spring，切换分支到https://gitee.com/shenzhanwang/SSM/tree/master/

18.允许后台接口跨域

19.不再使用spring boot自带的数据源，改为使用alibaba druid数据源管理数据库连接。

效果图：
![输入图片说明](https://images.gitee.com/uploads/images/2019/1114/094648_5adf8483_1110335.gif "s.gif")
![输入图片说明](https://images.gitee.com/uploads/images/2019/1030/191932_ba8c3db7_1110335.png "login.png")
![输入图片说明](https://images.gitee.com/uploads/images/2019/1114/094959_7e77736e_1110335.png "actor0.png")
![输入图片说明](https://images.gitee.com/uploads/images/2019/1114/095008_709381b9_1110335.png "city4.png")
![输入图片说明](https://images.gitee.com/uploads/images/2019/1114/095020_226d39d0_1110335.png "file939.png")
![输入图片说明](https://images.gitee.com/uploads/images/2019/1114/094835_24192f7f_1110335.png "微信截图_20191114093656.png")


### 附录：个人作品索引目录（持续更新）

#### 基础篇:职业化，从做好OA系统开始
1. [Spring boot整合Mybatis实现增删改查（支持多数据源）](https://gitee.com/shenzhanwang/SSM)![输入图片说明](https://img.shields.io/badge/-%E7%B2%BE%E5%93%81-orange.svg "在这里输入图片标题")
2. [Struts2,Hibernate,Spring三大框架的整合实现增删改查](https://gitee.com/shenzhanwang/S2SH)
3. [Spring,SpringMVC和Hibernate的整合实现增删改查](https://gitee.com/shenzhanwang/SSH)
4. [Spring平台整合activiti工作流引擎实现OA开发](https://gitee.com/shenzhanwang/Spring-activiti)![输入图片说明](https://img.shields.io/badge/-%E7%B2%BE%E5%93%81-orange.svg "在这里输入图片标题")
5. [Spring发布与调用REST风格的WebService](https://gitee.com/shenzhanwang/Spring-REST)
6. [Spring整合Apache Shiro框架，实现用户管理和权限控制](https://gitee.com/shenzhanwang/Spring-shiro)
7. [使用Spring security做权限控制](https://gitee.com/shenzhanwang/spring-security-demo)
8. [Spring整合Jasig CAS框架实现单点登录](https://gitee.com/shenzhanwang/Spring-cas-sso)
#### 中级篇：中间件的各种姿势
9. [Spring连接mongoDB数据库实现增删改查](https://gitee.com/shenzhanwang/Spring-mongoDB)
10. [Spring连接Redis实现缓存](https://gitee.com/shenzhanwang/Spring-redis)
11. [Spring连接图存数据库Neo4j实现增删改查](https://gitee.com/shenzhanwang/Spring-neo4j)
12. [Spring平台整合消息队列ActiveMQ实现发布订阅、生产者消费者模型（JMS）](https://gitee.com/shenzhanwang/Spring-activeMQ)
13. [Spring整合消息队列RabbitMQ实现四种消息模式（AMQP）](https://gitee.com/shenzhanwang/Spring-rabbitMQ)
#### 高级篇：架构之美
22. [zookeeper原理、架构、使用场景和可视化](https://gitee.com/shenzhanwang/zookeeper-practice)

