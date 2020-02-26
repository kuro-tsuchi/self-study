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
