# 1. kjldjfl

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
  如果需要修改，直接复制对应的配置文件，加到application.yam

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
