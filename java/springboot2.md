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

## Springboot2.0单元测试进阶实战和自定义异常处理

### SpringBootTest单元测试实战

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

### SpringBoot测试进阶高级篇之MockMvc讲解

 简介:讲解MockMvc类的使用和模拟Http请求实战

  1. 增加类注解 @AutoConfigureMockMvc
     @SpringBootTest(classes={XdclassApplication.class})
  1. 相关API
   perform：执行一个RequestBuilder请求
   andExpect：添加ResultMatcher->MockMvcResultMatchers验证规则
   andReturn：最后返回相应的MvcResult->Response

#### SpringBoot2.x个性化启动banner设置和debug日志

 简介：自定义应用启动的趣味性日志图标和查看调试日志

  1. 启动获取更多信息 java -jar xxx.jar --debug
  
  2、修改启动的banner信息
   1）在类路径下增加一个banner.txt，里面是启动要输出的信息
   2）在applicatoin.properties增加banner文件的路径地址
    spring.banner.location=banner.txt

   3）官网地址 <https://docs.spring.io/spring-boot/docs/2.1.0.BUILD-SNAPSHOT/reference/htmlsingle/#boot-features-banners>

### SpringBoot2.x配置全局异常实战

 讲解：服务端异常讲解和SpringBoot配置全局异常实战

  1. 默认异常测试  int i = 1/0，不友好
  
  1. 异常注解介绍
   @ControllerAdvice 如果是返回json数据 则用 RestControllerAdvice,就可以不加 @ResponseBody

   //捕获全局异常,处理所有不可知的异常
   @ExceptionHandler(value=Exception.class)

### SpringBoot2.x配置全局异常返回自定义页面

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
