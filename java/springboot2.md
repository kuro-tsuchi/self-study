
<!-- TOC -->

- [1. springboot](#1-springboot)
  - [1.1. SpringBoot接口Http协议开发实战](#11-springboot%e6%8e%a5%e5%8f%a3http%e5%8d%8f%e8%ae%ae%e5%bc%80%e5%8f%91%e5%ae%9e%e6%88%98)
    - [1.1.1. SpringBoot2.xHTTP请求配置讲解](#111-springboot2xhttp%e8%af%b7%e6%b1%82%e9%85%8d%e7%bd%ae%e8%ae%b2%e8%a7%a3)
    - [1.1.2. SpringBoot基础HTTP接口GET请求实战](#112-springboot%e5%9f%ba%e7%a1%80http%e6%8e%a5%e5%8f%a3get%e8%af%b7%e6%b1%82%e5%ae%9e%e6%88%98)
    - [1.1.3. SpringBoot基础HTTP接口POST,PUT,DELETE请求实战](#113-springboot%e5%9f%ba%e7%a1%80http%e6%8e%a5%e5%8f%a3postputdelete%e8%af%b7%e6%b1%82%e5%ae%9e%e6%88%98)
    - [1.1.4. 常用json框架介绍和Jackson返回结果处理](#114-%e5%b8%b8%e7%94%a8json%e6%a1%86%e6%9e%b6%e4%bb%8b%e7%bb%8d%e5%92%8cjackson%e8%bf%94%e5%9b%9e%e7%bb%93%e6%9e%9c%e5%a4%84%e7%90%86)
  - [1.2. SpringBoot热部署devtool和配置文件自动注入实战](#12-springboot%e7%83%ad%e9%83%a8%e7%bd%b2devtool%e5%92%8c%e9%85%8d%e7%bd%ae%e6%96%87%e4%bb%b6%e8%87%aa%e5%8a%a8%e6%b3%a8%e5%85%a5%e5%ae%9e%e6%88%98)
    - [1.2.1. SpringBoot2.x配置文件讲解](#121-springboot2x%e9%85%8d%e7%bd%ae%e6%96%87%e4%bb%b6%e8%ae%b2%e8%a7%a3)
    - [1.2.2. SpringBoot注解把配置文件自动映射到属性和实体类实战](#122-springboot%e6%b3%a8%e8%a7%a3%e6%8a%8a%e9%85%8d%e7%bd%ae%e6%96%87%e4%bb%b6%e8%87%aa%e5%8a%a8%e6%98%a0%e5%b0%84%e5%88%b0%e5%b1%9e%e6%80%a7%e5%92%8c%e5%ae%9e%e4%bd%93%e7%b1%bb%e5%ae%9e%e6%88%98)
  - [1.3. Springboot2.0单元测试进阶实战和自定义异常处理](#13-springboot20%e5%8d%95%e5%85%83%e6%b5%8b%e8%af%95%e8%bf%9b%e9%98%b6%e5%ae%9e%e6%88%98%e5%92%8c%e8%87%aa%e5%ae%9a%e4%b9%89%e5%bc%82%e5%b8%b8%e5%a4%84%e7%90%86)
    - [1.3.1. SpringBootTest单元测试实战](#131-springboottest%e5%8d%95%e5%85%83%e6%b5%8b%e8%af%95%e5%ae%9e%e6%88%98)
    - [1.3.2. SpringBoot测试进阶高级篇之MockMvc讲解](#132-springboot%e6%b5%8b%e8%af%95%e8%bf%9b%e9%98%b6%e9%ab%98%e7%ba%a7%e7%af%87%e4%b9%8bmockmvc%e8%ae%b2%e8%a7%a3)
      - [1.3.2.1. SpringBoot2.x个性化启动banner设置和debug日志](#1321-springboot2x%e4%b8%aa%e6%80%a7%e5%8c%96%e5%90%af%e5%8a%a8banner%e8%ae%be%e7%bd%ae%e5%92%8cdebug%e6%97%a5%e5%bf%97)
    - [1.3.3. SpringBoot2.x配置全局异常实战](#133-springboot2x%e9%85%8d%e7%bd%ae%e5%85%a8%e5%b1%80%e5%bc%82%e5%b8%b8%e5%ae%9e%e6%88%98)
    - [1.3.4. SpringBoot2.x配置全局异常返回自定义页面](#134-springboot2x%e9%85%8d%e7%bd%ae%e5%85%a8%e5%b1%80%e5%bc%82%e5%b8%b8%e8%bf%94%e5%9b%9e%e8%87%aa%e5%ae%9a%e4%b9%89%e9%a1%b5%e9%9d%a2)
  - [1.4. 数据库操作之整合Mybaties和事务讲解](#14-%e6%95%b0%e6%8d%ae%e5%ba%93%e6%93%8d%e4%bd%9c%e4%b9%8b%e6%95%b4%e5%90%88mybaties%e5%92%8c%e4%ba%8b%e5%8a%a1%e8%ae%b2%e8%a7%a3)
    - [1.4.1. SpringBoot2.x整合Mybatis3.x注解实战](#141-springboot2x%e6%95%b4%e5%90%88mybatis3x%e6%b3%a8%e8%a7%a3%e5%ae%9e%e6%88%98)
    - [1.4.2. SpringBoot2.x整合Mybatis3.x增删改查实操和控制台打印SQL语句](#142-springboot2x%e6%95%b4%e5%90%88mybatis3x%e5%a2%9e%e5%88%a0%e6%94%b9%e6%9f%a5%e5%ae%9e%e6%93%8d%e5%92%8c%e6%8e%a7%e5%88%b6%e5%8f%b0%e6%89%93%e5%8d%b0sql%e8%af%ad%e5%8f%a5)
    - [1.4.3. 事务介绍和常见的隔离级别，传播行为](#143-%e4%ba%8b%e5%8a%a1%e4%bb%8b%e7%bb%8d%e5%92%8c%e5%b8%b8%e8%a7%81%e7%9a%84%e9%9a%94%e7%a6%bb%e7%ba%a7%e5%88%ab%e4%bc%a0%e6%92%ad%e8%a1%8c%e4%b8%ba)
    - [1.4.4. SpringBoot整合mybatis之事务处理实战](#144-springboot%e6%95%b4%e5%90%88mybatis%e4%b9%8b%e4%ba%8b%e5%8a%a1%e5%a4%84%e7%90%86%e5%ae%9e%e6%88%98)
  - [1.5. SpringBoot2.x整合JPA实战](#15-springboot2x%e6%95%b4%e5%90%88jpa%e5%ae%9e%e6%88%98)
    - [1.5.1. 引入依赖](#151-%e5%bc%95%e5%85%a5%e4%be%9d%e8%b5%96)
    - [1.5.2. 相关文件配置](#152-%e7%9b%b8%e5%85%b3%e6%96%87%e4%bb%b6%e9%85%8d%e7%bd%ae)
    - [1.5.3. 代码](#153-%e4%bb%a3%e7%a0%81)
  - [1.6. SpringBoot2.x整合Redis实战](#16-springboot2x%e6%95%b4%e5%90%88redis%e5%ae%9e%e6%88%98)
    - [1.6.1. springboot整合redis相关依赖引入](#161-springboot%e6%95%b4%e5%90%88redis%e7%9b%b8%e5%85%b3%e4%be%9d%e8%b5%96%e5%bc%95%e5%85%a5)
    - [1.6.2. 相关配置文件配置](#162-%e7%9b%b8%e5%85%b3%e9%85%8d%e7%bd%ae%e6%96%87%e4%bb%b6%e9%85%8d%e7%bd%ae)
    - [1.6.3. 常见redistemplate种类讲解和缓存实操(使用自动注入)](#163-%e5%b8%b8%e8%a7%81redistemplate%e7%a7%8d%e7%b1%bb%e8%ae%b2%e8%a7%a3%e5%92%8c%e7%bc%93%e5%ad%98%e5%ae%9e%e6%93%8d%e4%bd%bf%e7%94%a8%e8%87%aa%e5%8a%a8%e6%b3%a8%e5%85%a5)
      - [1.6.3.1. 注入模板](#1631-%e6%b3%a8%e5%85%a5%e6%a8%a1%e6%9d%bf)
      - [1.6.3.2. 类型String，List,Hash,Set,ZSet](#1632-%e7%b1%bb%e5%9e%8bstringlisthashsetzset)
  - [定时任务](#%e5%ae%9a%e6%97%b6%e4%bb%bb%e5%8a%a1)
  - [日志](#%e6%97%a5%e5%bf%97)
    - [配置文件](#%e9%85%8d%e7%bd%ae%e6%96%87%e4%bb%b6)
    - [代码](#%e4%bb%a3%e7%a0%81)
  - [消息队列介绍和SpringBoot2.x整合RockketMQ、ActiveMQ](#%e6%b6%88%e6%81%af%e9%98%9f%e5%88%97%e4%bb%8b%e7%bb%8d%e5%92%8cspringboot2x%e6%95%b4%e5%90%88rockketmqactivemq)
- [消费者的组名](#%e6%b6%88%e8%b4%b9%e8%80%85%e7%9a%84%e7%bb%84%e5%90%8d)
- [生产者的组名](#%e7%94%9f%e4%ba%a7%e8%80%85%e7%9a%84%e7%bb%84%e5%90%8d)
- [NameServer地址](#nameserver%e5%9c%b0%e5%9d%80)

<!-- /TOC -->
# 1. springboot

## 1.1. SpringBoot接口Http协议开发实战

总结：

- HTTP接口一般使用POST请求

### 1.1.1. SpringBoot2.xHTTP请求配置讲解

- @RestController = @Controller+@ResponseBody

- @SpringBootApplication = @Configuration+@EnableAutoConfiguration+@ComponentScan

### 1.1.2. SpringBoot基础HTTP接口GET请求实战

   单一参数@RequestMapping(path = "/{id}", method = RequestMethod.GET)

1. public String getUser(@PathVariable String id ) {}

1. @RequestMapping(path = "/{depid}/{userid}", method = RequestMethod.GET)
   可以同时指定多个提交方法
1. getUser(@PathVariable("depid") String departmentID,@PathVariable("userid") String userid)

1. 一个顶俩
@GetMapping = @RequestMapping(method = RequestMethod.GET)
@PostMapping = @RequestMapping(method = RequestMethod.POST)
@PutMapping = @RequestMapping(method = RequestMethod.PUT)
@DeleteMapping = @RequestMapping(method = RequestMethod.DELETE)

1. @RequestParam(value = "name", required = true)
 可以设置默认值，比如分页

1. @RequestBody 请求体映射实体类
 需要指定http头为 content-type为application/json charset=utf-8

1. @RequestHeader 请求头，比如鉴权
 @RequestHeader("access_token") String accessToken

1. HttpServletRequest request自动注入获取参数

### 1.1.3. SpringBoot基础HTTP接口POST,PUT,DELETE请求实战

POST：向服务器提交数据。几乎目前所有的提交操作都是靠这个完成。

```java
@PostMapping("/v1/login")
  public Object login(String id, String pwd){
      params.clear();
      params.put("id", id);
      params.put("pwd", pwd);
      return params;
}
```

### 1.1.4. 常用json框架介绍和Jackson返回结果处理

 1、jackson处理相关自动
  指定字段不返回：@JsonIgnore
  指定日期格式：@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="zh",timezone="GMT+8")
  空字段不返回：@JsonInclude(Include.NON_NUll)
  指定别名：@JsonProperty

```java
 @JsonIgnore
 private String pwd;

 @JsonProperty("account")
 @JsonInclude(Include.NON_NULL)
 private String phone;

 @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="zh",timezone="GMT+8")
 private Date createTime;

```

## 1.2. SpringBoot热部署devtool和配置文件自动注入实战

### 1.2.1. SpringBoot2.x配置文件讲解

   1. YAML（Yet Another Markup Language）
    写 YAML 要比写 XML 快得多(无需关注标签或引号)
    使用空格 Space 缩进表示分层，不同层次之间的缩进可以使用不同的空格数目
    注意：key后面的冒号，后面一定要跟一个空格,树状结构

   1. 参考：<https://docs.spring.io/spring-boot/docs/2.1.0.BUILD-SNAPSHOT/reference/htmlsingle/#common-application-properties>
  如果需要修改，直接复制对应的配置文件，加到application.yml

### 1.2.2. SpringBoot注解把配置文件自动映射到属性和实体类实战

 简介：讲解使用@value注解配置文件自动映射到属性和实体类

```yaml
# application.yml配置文件
test
   username: root
   password: 123
```

```java
@Component
@ConfigurationProperties(prefix="test")
@PropertySource(value="classpath:application.yml")
public class DataBaseConfig {
  
    private String username
    private String password;
}
```

## 1.3. Springboot2.0单元测试进阶实战和自定义异常处理

### 1.3.1. SpringBootTest单元测试实战

- 引入相关依赖

```pom
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-test</artifactId>
   <scope>test</scope>
</dependency>
```

- demo

```java
//底层用junit  SpringJUnit4ClassRunner
@RunWith(SpringRunner.class)
//启动整个springboot工程
@SpringBootTest(classes={XdclassApplication.class})
public class SpringBootTests {

}
```

### 1.3.2. SpringBoot测试进阶高级篇之MockMvc讲解

 简介:讲解MockMvc类的使用和模拟Http请求实战

  1. 增加类注解 @AutoConfigureMockMvc
     @SpringBootTest(classes={XdclassApplication.class})
  1. 相关API
   perform：执行一个RequestBuilder请求
   andExpect：添加ResultMatcher->MockMvcResultMatchers验证规则
   andReturn：最后返回相应的MvcResult->Response

#### 1.3.2.1. SpringBoot2.x个性化启动banner设置和debug日志

 简介：自定义应用启动的趣味性日志图标和查看调试日志

  1. 启动获取更多信息 java -jar xxx.jar --debug
  
  2、修改启动的banner信息
   1）在类路径下增加一个banner.txt，里面是启动要输出的信息
   2）在applicatoin.properties增加banner文件的路径地址
    spring.banner.location=banner.txt

   3）官网地址 <https://docs.spring.io/spring-boot/docs/2.1.0.BUILD-SNAPSHOT/reference/htmlsingle/#boot-features-banners>

### 1.3.3. SpringBoot2.x配置全局异常实战

 讲解：服务端异常讲解和SpringBoot配置全局异常实战

  1. 默认异常测试  int i = 1/0，不友好
  
  1. 异常注解介绍
   @ControllerAdvice 如果是返回json数据 则用 RestControllerAdvice,就可以不加 @ResponseBody

   //捕获全局异常,处理所有不可知的异常
   @ExceptionHandler(value=Exception.class)

### 1.3.4. SpringBoot2.x配置全局异常返回自定义页面

 简介：使用SpringBoot自定义异常和错误页面跳转实战

 1、返回自定义异常界面，需要引入thymeleaf依赖
  <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-thymeleaf</artifactId>
  </dependency>

 2、resource目录下新建templates,并新建error.html
  ModelAndView modelAndView = new ModelAndView();
     modelAndView.setViewName("error.html");
     modelAndView.addObject("msg", e.getMessage());
     return modelAndView;

     https://docs.spring.io/spring-boot/docs/2.1.0.BUILD-SNAPSHOT/reference/htmlsingle/#boot-features-error-handling

## 1.4. 数据库操作之整合Mybaties和事务讲解

### 1.4.1. SpringBoot2.x整合Mybatis3.x注解实战

 简介：SpringBoot2.x整合Mybatis3.x注解配置实战

  1、使用starter, maven仓库地址：<http://mvnrepository.com/artifact/org.mybatis.spring.boot/mybatis-spring-boot-starter>

  2、加入依赖(可以用 <http://start.spring.io/> 下载)

   <!-- 引入starter-->
     <dependency>
         <groupId>org.mybatis.spring.boot</groupId>
         <artifactId>mybatis-spring-boot-starter</artifactId>
         <version>1.3.2</version>
         <scope>runtime</scope>       
     </dependency>
      
    <!-- MySQL的JDBC驱动包	--> 
      <dependency>
      <groupId>mysql</groupId>
      <artifactId>mysql-connector-java</artifactId>
      <scope>runtime</scope>
     </dependency> 
   <!-- 引入第三方数据源 -->  
     <dependency>
      <groupId>com.alibaba</groupId>
      <artifactId>druid</artifactId>
      <version>1.1.6</version>
     </dependency>

  加载配置，注入到sqlSessionFactory等都是springBoot帮我们完成

  4、启动类增加mapper扫描
   @MapperScan("net.xdclass.base_project.mapper")

    技巧：保存对象，获取数据库自增id 
    @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")

  4、开发mapper
   参考语法 <http://www.mybatis.org/mybatis-3/zh/java-api.html>

  5、sql脚本
   CREATE TABLE `user` (
     `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
     `name` varchar(128) DEFAULT NULL COMMENT '名称',
     `phone` varchar(16) DEFAULT NULL COMMENT '用户手机号',
     `create_time` datetime DEFAULT NULL COMMENT '创建时间',
     `age` int(4) DEFAULT NULL COMMENT '年龄',
     PRIMARY KEY (`id`)
   ) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

  相关资料：
  <http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/#Configuration>

  <https://github.com/mybatis/spring-boot-starter/tree/master/mybatis-spring-boot-samples>

  整合问题集合：
   <https://my.oschina.net/hxflar1314520/blog/1800035>
   <https://blog.csdn.net/tingxuetage/article/details/80179772>

### 1.4.2. SpringBoot2.x整合Mybatis3.x增删改查实操和控制台打印SQL语句

 讲解:SpringBoot2.x整合Mybatis3.x增删改查实操, 控制台打印sql语句

 1、控制台打印sql语句  
  #增加打印sql语句，一般用于本地开发测试
  mybatis.configuration.log-impl=org.apache.ibatis.logging.stdout.StdOutImpl

 2、增加mapper代码  
     @Select("SELECT * FROM user")
     @Results({
         @Result(column = "create_time",property = "createTime")  //javaType = java.util.Date.class
     })
     List<User> getAll();

     @Select("SELECT * FROM user WHERE id = #{id}")
     @Results({
       @Result(column = "create_time",property = "createTime")
     })
     User findById(Long id);

     @Update("UPDATE user SET name=#{name} WHERE id =#{id}")
     void update(User user);

     @Delete("DELETE FROM user WHERE id =#{userId}")
     void delete(Long userId);
  
  3、增加API

  @GetMapping("find_all")
  public Object findAll(){
        return JsonData.buildSuccess(userMapper.getAll());
  }
  
  @GetMapping("find_by_Id")
  public Object findById(long id){
        return JsonData.buildSuccess(userMapper.findById(id));
  }
  
  @GetMapping("del_by_id")
  public Object delById(long id){
  userMapper.delete(id);
        return JsonData.buildSuccess();
  }
  
  @GetMapping("update")
  public Object update(String name,int id){
   User user = new User();
   user.setName(name);
   user.setId(id);
   userMapper.update(user);
      return JsonData.buildSuccess();
  }

### 1.4.3. 事务介绍和常见的隔离级别，传播行为

 简介：讲解什么是数据库事务，常见的隔离级别和传播行为

 1、介绍什么是事务，单机事务，分布式事务处理等

 2、讲解场景的隔离级别
  Serializable： 最严格，串行处理，消耗资源大
  Repeatable Read：保证了一个事务不会修改已经由另一个事务读取但未提交（回滚）的数据
  Read Committed：大多数主流数据库的默认事务等级
  Read Uncommitted：保证了读取过程中不会读取到非法数据。

 3、讲解常见的传播行为
  PROPAGATION_REQUIRED--支持当前事务，如果当前没有事务，就新建一个事务,最常见的选择。

  PROPAGATION_SUPPORTS--支持当前事务，如果当前没有事务，就以非事务方式执行。

  PROPAGATION_MANDATORY--支持当前事务，如果当前没有事务，就抛出异常。

  PROPAGATION_REQUIRES_NEW--新建事务，如果当前存在事务，把当前事务挂起, 两个事务之间没有关系，一个异常，一个提交，不会同时回滚

  PROPAGATION_NOT_SUPPORTED--以非事务方式执行操作，如果当前存在事务，就把当前事务挂起。

  PROPAGATION_NEVER--以非事务方式执行，如果当前存在事务，则抛出异常

### 1.4.4. SpringBoot整合mybatis之事务处理实战

 简介：SpringBoot整合Mybatis之事务处理实战
 1、service逻辑引入事务 @Transantional(propagation=Propagation.REQUIRED)

 2、service代码
  @Override
     @Transactional
  public int addAccount() {
   User user = new User();
   user.setAge(9);
   user.setCreateTime(new Date());
   user.setName("事务测试");
   user.setPhone("000121212");

   userMapper.insert(user);
         int a = 1/0;

   return user.getId();
  }

## 1.5. SpringBoot2.x整合JPA实战

### 1.5.1. 引入依赖

```pom
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
   <groupId>mysql</groupId>
   <artifactId>mysql-connector-java</artifactId>
   <scope>runtime</scope>
</dependency>
```

### 1.5.2. 相关文件配置

```yml
spring:
  datasource:
    url: jdbc:mysql://localhost:3306/testData?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai
    username: root
    password: mysql
    driver-class-name: com.mysql.cj.jdbc.Driver
  jpa:
    database-platform: org.hibernate.dialect.MySQL5InnoDBDialect
    show-sql: false
    hibernate:
      ddl-auto: create
```

### 1.5.3. 代码

```java
package com.example.demo.repository;
import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

```

## 1.6. SpringBoot2.x整合Redis实战

### 1.6.1. springboot整合redis相关依赖引入

```pom
<dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-data-redis</artifactId>
</dependency>
<!-- lettuce pool 缓存连接池 -->
<dependency>
   <groupId>org.apache.commons</groupId>
   <artifactId>commons-pool2</artifactId>
</dependency>

```

### 1.6.2. 相关配置文件配置

```yml
spring:
  redis:
    database: 0
    host: 127.0.0.1
    port: 6379
    password:
    jedis:
      pool:
        # 连接池最大连接数（使用负值表示没有限制）
        max-active: 8
        # 连接池最大阻塞等待时间（使用负值表示没有限制）
        max-wait: 10000
        # 连接池中的最大空闲连接
        max-idle: 8
        # 连接池中的最小空闲连接
        min-idle: 0
        # 连接超时时间 单位 ms（毫秒
      shutdown-timeout: 100
```

### 1.6.3. 常见redistemplate种类讲解和缓存实操(使用自动注入)

#### 1.6.3.1. 注入模板

```java
   @Autowired
   private StirngRedisTemplate strTplRedis
```

#### 1.6.3.2. 类型String，List,Hash,Set,ZSet

opsForValue()、opsForList()、opsForHash()、opsForSet()、opsForZSet()

## 定时任务

## 日志

### 配置文件

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<configuration>

  <appender name="consoleApp" class="ch.qos.logback.core.ConsoleAppender">
        <layout class="ch.qos.logback.classic.PatternLayout">
            <pattern>
                %date{yyyy-MM-dd HH:mm:ss.SSS} %-5level[%thread]%logger{56}.%method:%L -%msg%n
            </pattern>
        </layout>
    </appender>

    <appender name="fileInfoApp" class="ch.qos.logback.core.rolling.RollingFileAppender">
        <filter class="ch.qos.logback.classic.filter.LevelFilter">
             <level>ERROR</level>
            <onMatch>DENY</onMatch>
            <onMismatch>ACCEPT</onMismatch>
        </filter>
        <encoder>
            <pattern>
                %date{yyyy-MM-dd HH:mm:ss.SSS} %-5level[%thread]%logger{56}.%method:%L -%msg%n
            </pattern>
        </encoder>
        <!-- 滚动策略 -->
        <rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
            <!-- 路径 -->
            <fileNamePattern>app_log/log/app.info.%d.log</fileNamePattern>
        </rollingPolicy>
    </appender>

    <appender name="fileErrorApp" class="ch.qos.logback.core.rolling.RollingFileAppender">
        <filter class="ch.qos.logback.classic.filter.ThresholdFilter">
            <level>ERROR</level>
        </filter>
        <encoder>
            <pattern>
                %date{yyyy-MM-dd HH:mm:ss.SSS} %-5level[%thread]%logger{56}.%method:%L -%msg%n
            </pattern>
        </encoder>

        <!-- 设置滚动策略 -->
        <rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
            <!-- 路径 -->
            <fileNamePattern>app_log/log/app.err.%d.log</fileNamePattern>

            <!-- 控制保留的归档文件的最大数量，超出数量就删除旧文件，假设设置每个月滚动，
            且<maxHistory> 是1，则只保存最近1个月的文件，删除之前的旧文件 -->
             <MaxHistory>1</MaxHistory>

        </rollingPolicy>
    </appender>
   <root level="DEBUG">
        <appender-ref ref="consoleApp"/>
        <appender-ref ref="fileInfoApp"/>
        <appender-ref ref="fileErrorApp"/>
    </root>
</configuration>
```

### 代码

```java
    @GetMapping("log")
    public void testLog() {
        logger.debug("this is debug level");
        logger.info("this is info level ");
        logger.warn("this is warn level ");
        logger.error("this is error level");

```

## 消息队列介绍和SpringBoot2.x整合RockketMQ、ActiveMQ

1、JMS介绍和使用场景及基础编程模型
 简介：讲解什么是小写队列，JMS的基础知识和使用场景
 1、什么是JMS: Java消息服务（Java Message Service),Java平台中关于面向消息中间件的接口

 2、JMS是一种与厂商无关的 API，用来访问消息收发系统消息，它类似于JDBC(Java Database Connectivity)。这里，JDBC 是可以用来访问许多不同关系数据库的 API

 3、使用场景：
  1）跨平台
  2）多语言
  3）多项目
  4）解耦
  5）分布式事务

  6）流量控制
  7）最终一致性
  8）RPC调用
   上下游对接，数据源变动->通知下属
 4、概念
  JMS提供者：Apache ActiveMQ、RabbitMQ、Kafka、Notify、MetaQ、RocketMQ
  JMS生产者(Message Producer)
  JMS消费者(Message Consumer)
  JMS消息
  JMS队列
  JMS主题

  JMS消息通常有两种类型：点对点（Point-to-Point)、发布/订阅（Publish/Subscribe）

 5、编程模型
  MQ中需要用的一些类
  ConnectionFactory ：连接工厂，JMS 用它创建连接
  Connection ：JMS 客户端到JMS Provider 的连接
  Session： 一个发送或接收消息的线程
  Destination ：消息的目的地;消息发送给谁.
  MessageConsumer / MessageProducer： 消息接收者，消费者

2、ActiveMQ5.x消息队列基础介绍和安装

 简介：介绍ActiveMQ5.x消息队列基础特性和本地快速安装
  特点：
   1）支持来自Java，C，C ++，C＃，Ruby，Perl，Python，PHP的各种跨语言客户端和协议
   2）支持许多高级功能，如消息组，虚拟目标，通配符和复合目标
   3) 完全支持JMS 1.1和J2EE 1.4，支持瞬态，持久，事务和XA消息
   4) Spring支持，ActiveMQ可以轻松嵌入到Spring应用程序中，并使用Spring的XML配置机制进行配置
   5) 支持在流行的J2EE服务器（如TomEE，Geronimo，JBoss，GlassFish和WebLogic）中进行测试
   6) 使用JDBC和高性能日志支持非常快速的持久化
   ...

  1、下载地址：<http://activemq.apache.org/activemq-5153-release.html>
  2、快速开始：<http://activemq.apache.org/getting-started.html>
  3、如果我们是32位的机器，就双击win32目录下的activemq.bat,如果是64位机器，则双击win64目录下的activemq.bat
  4、bin目录里面启动 选择对应的系统版本和位数，activeMQ start 启动
  5、启动后访问路径<http://127.0.0.1:8161/>

  6、用户名和密码默认都是admin
  7、官方案例集合
   <https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples>
  面板：
  Name：队列名称。
  Number Of Pending Messages：等待消费的消息个数。
  Number Of Consumers：当前连接的消费者数目
  Messages Enqueued：进入队列的消息总个数，包括出队列的和待消费的，这个数量只增不减。
  Messages Dequeued：已经消费的消息数量。

3、SpringBoot2.x整合ActiveMQ实战之点对点消息(p2p)

 简介:SpringBoot2.x整合ActiveMQ实战之点对点消息

 1、官网地址：<https://docs.spring.io/spring-boot/docs/2.1.0.BUILD-SNAPSHOT/reference/htmlsingle/#boot-features-activemq>

 2、加入依赖
  <!-- 整合消息队列ActiveMQ -->
  <dependency>  
            <groupId>org.springframework.boot</groupId>  
            <artifactId>spring-boot-starter-activemq</artifactId>  
        </dependency>  

        <!-- 如果配置线程池则加入 -->
        <dependency>  
            <groupId>org.apache.activemq</groupId>  
            <artifactId>activemq-pool</artifactId>  
        </dependency>

     3、application.properties配置文件配置
      #整合jms测试，安装在别的机器，防火墙和端口号记得开放
  spring.activemq.broker-url=tcp://127.0.0.1:61616

  #集群配置
  #spring.activemq.broker-url=failover:(tcp://localhost:61616,tcp://localhost:61617)

  spring.activemq.user=admin
  spring.activemq.password=admin
  #下列配置要增加依赖
  spring.activemq.pool.enabled=true
  spring.activemq.pool.max-connections=100

   4、springboot启动类 @EnableJms，开启支持jms

   5、模拟请求
    localhost:8080/api/v1/order?msg=12312321321312

   6、消费者：实时监听对应的队列
    @JmsListener(destination = "order.queue")

4、SpringBoot整合ActiveMQ实战之发布订阅模式(pub/sub)
 简介：SpringBoot整合ActiveMQ实战之发布订阅模式(pub/sub),及同时支持点对点和发布订阅模型

  1、需要加入配置文件，支持发布订阅模型，默认只支持点对点
   #default point to point
   spring.jms.pub-sub-domain=true

 注意点：
  
  1、默认消费者并不会消费订阅发布类型的消息，这是由于springboot默认采用的是p2p模式进行消息的监听
   修改配置：spring.jms.pub-sub-domain=true
  
  2、@JmsListener如果不指定独立的containerFactory的话是只能消费queue消息
   修改订阅者container：containerFactory="jmsListenerContainerTopic"

   //需要给topic定义独立的JmsListenerContainer
      @Bean
      public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ConnectionFactory activeMQConnectionFactory) {
          DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
          bean.setPubSubDomain(true);
          bean.setConnectionFactory(activeMQConnectionFactory);
          return bean;
      }

      在配置文件里面，注释掉 #spring.jms.pub-sub-domain=true

5、RocketMQ4.x消息队列介绍
 简介：阿里开源消息队列 RocketMQ4.x介绍和新概念讲解

 1、Apache RocketMQ作为阿里开源的一款高性能、高吞吐量的分布式消息中间件
 2、特点
  1)在高压下1毫秒内响应延迟超过99.6％。
  2)适合金融类业务，高可用性跟踪和审计功能。
  3)支持发布订阅模型，和点对点
  4）支持拉pull和推push两种消息模式
  5)单一队列百万消息
  6)支持单master节点，多master节点，多master多slave节点
  ...
 3、概念
  Producer:消息生产者
  Producer Group:消息生产者组，发送同类消息的一个消息生产组

  Consumer:消费者
  Consumer Group:消费同个消息的多个实例

  Tag:标签，子主题（二级分类）,用于区分同一个主题下的不同业务的消息

  Topic:主题
  Message：消息
  Broker：MQ程序，接收生产的消息，提供给消费者消费的程序
  Name Server：给生产和消费者提供路由信息，提供轻量级的服务发现和路由  

 3、官网地址：<http://rocketmq.apache.org/>

 学习资源：
  1）<http://jm.taobao.org/2017/01/12/rocketmq-quick-start-in-10-minutes/>
  2）<https://www.jianshu.com/p/453c6e7ff81c>

6、RocketMQ4.x本地快速部署
 简介:RocketMQ4.x本地快速部署

 1、安装前提条件(推荐)
  64bit OS, Linux/Unix/Mac
  64bit JDK 1.8+;

 2、快速开始 <http://rocketmq.apache.org/docs/quick-start/>
    下载安装包：<https://www.apache.org/dyn/closer.cgi?path=rocketmq/4.2.0/rocketmq-all-4.2.0-bin-release.zip>

    路径：/Users/jack/Desktop/person/springboot/资料/第13章/第5课/rocketmq-all-4.2.0-bin-release/bin

 3、解压压缩包
  1）进入bin目录，启动namesrv
    nohup sh mqnamesrv &
  
  2) 查看日志 tail -f nohup.out
  结尾：The Name Server boot success. serializeType=JSON 表示启动成功
  
  3、启动broker
   nohup sh mqbroker -n 127.0.0.1:9876 &

  4)、关闭nameserver broker执行的命令
   sh mqshutdown namesrv
   sh mqshutdown broker

7、RoekerMQ4.x可视化控制台讲解
 简介：RoekerMQ4.x可视化控制台讲解

  1、下载 <https://github.com/apache/rocketmq-externals>
  2、编译打包  mvn clean package -Dmaven.test.skip=true
  3、target目录 通过java -jar的方式运行
  
  4、无法连接获取broker信息
   1）修改配置文件,名称路由地址为 namesrvAddr，例如我本机为
   2）src/main/resources/application.properties
    rocketmq.config.namesrvAddr=192.168.0.101:9876
  
  5、默认端口 localhost:8080
  
  6、注意：
   在阿里云，腾讯云或者虚拟机，记得检查端口号和防火墙是否启动

8、Springboot2.x整合RocketMQ4.x实战上集
 简介：Springboot2.x整合RocketMQ4.x实战，加入相关依赖，开发生产者代码

 启动nameser和broker

 1、加入相关依赖
  <dependency>  
      <groupId>org.apache.rocketmq</groupId>  
      <artifactId>rocketmq-client</artifactId>  
      <version>${rocketmq.version}</version>  
  </dependency>  
  <dependency>  
      <groupId>org.apache.rocketmq</groupId>  
      <artifactId>rocketmq-common</artifactId>  
      <version>${rocketmq.version}</version>  
  </dependency>  

 2、application.properties加入配置文件  

# 消费者的组名

  apache.rocketmq.consumer.PushConsumer=orderConsumer

# 生产者的组名

  apache.rocketmq.producer.producerGroup=Producer

# NameServer地址

  apache.rocketmq.namesrvAddr=127.0.0.1:9876

 3、开发MsgProducer
   /**
      * 生产者的组名
      */
     @Value("${apache.rocketmq.producer.producerGroup}")
     private String producerGroup;

     /**
      * NameServer 地址
      */
     @Value("${apache.rocketmq.namesrvAddr}")
     private String namesrvAddr;

     private  DefaultMQProducer producer ;

      
     public DefaultMQProducer getProducer(){
      return this.producer;
     }
     
     @PostConstruct
     public void defaultMQProducer() {
         //生产者的组名
      producer = new DefaultMQProducer(producerGroup);
         //指定NameServer地址，多个地址以 ; 隔开
      //如 producer.setNamesrvAddr("192.168.100.141:9876;192.168.100.142:9876;192.168.100.149:9876"); 
         producer.setNamesrvAddr(namesrvAddr);
         producer.setVipChannelEnabled(false);
         
         try {
             /**
              * Producer对象在使用之前必须要调用start初始化，只能初始化一次
              */
             producer.start();

         } catch (Exception e) {
             e.printStackTrace();
         } 
         
         // producer.shutdown();  一般在应用上下文，关闭的时候进行关闭，用上下文监听器

     }

9、Springboot2.x整合RocketMQ4.x实战下集
 简介：Springboot2.x整合RocketMQ4.x实战，开发消费者代码，常见问题处理

 1、创建消费者

 问题：
  1、Caused by: org.apache.rocketmq.remoting.exception.RemotingConnectException: connect to <172.17.42.1:10911> failed

  2、com.alibaba.rocketmq.client.exception.MQClientException: Send [1] times, still failed, cost [1647]ms, Topic: TopicTest1, BrokersSent: [broker-a, null, null]

  3、org.apache.rocketmq.client.exception.MQClientException: Send [3] times, still failed, cost [497]ms, Topic: TopicTest, BrokersSent: [chenyaowudeMacBook-Air.local,  chenyaowudeMacBook-Air.local, chenyaowudeMacBook-Air.local]
  解决：多网卡问题处理
  1、设置producer:  producer.setVipChannelEnabled(false);
  2、编辑ROCKETMQ 配置文件：broker.conf（下列ip为自己的ip）
   namesrvAddr = 192.168.0.101:9876
   brokerIP1 = 192.168.0.101

  4、DESC: service not available now, maybe disk full, CL:
  解决：修改启动脚本runbroker.sh，在里面增加一句话即可：  
  JAVA_OPT="${JAVA_OPT} -Drocketmq.broker.diskSpaceWarningLevelRatio=0.98"
  （磁盘保护的百分比设置成98%，只有磁盘空间使用率达到98%时才拒绝接收producer消息）

  常见问题处理：
   <https://blog.csdn.net/sqzhao/article/details/54834761>
   <https://blog.csdn.net/mayifan0/article/details/67633729>
   <https://blog.csdn.net/a906423355/article/details/78192828>
