# SpringBoot接口Http协议开发实战

## SpringBoot2.xHTTP请求配置讲解

 简介：SpringBoot2.xHTTP请求注解讲解和简化注解配置技巧

 1、@RestController and @RequestMapping是springMVC的注解，不是springboot特有的
 2、@RestController = @Controller+@ResponseBody
 3、@SpringBootApplication = @Configuration+@EnableAutoConfiguration+@ComponentScan
  localhost:8080

## SpringBoot基础HTTP接口GET请求实战

 简介:讲解springboot接口，http的get请求，各个注解使用
  1、GET请求
   1、单一参数@RequestMapping(path = "/{id}", method = RequestMethod.GET)
    1) public String getUser(@PathVariable String id ) {}

    2）@RequestMapping(path = "/{depid}/{userid}", method = RequestMethod.GET) 可以同时指定多个提交方法
    getUser(@PathVariable("depid") String departmentID,@PathVariable("userid") String userid)

    3）一个顶俩
    @GetMapping = @RequestMapping(method = RequestMethod.GET)
    @PostMapping = @RequestMapping(method = RequestMethod.POST)
    @PutMapping = @RequestMapping(method = RequestMethod.PUT)
    @DeleteMapping = @RequestMapping(method = RequestMethod.DELETE)

    4）@RequestParam(value = "name", required = true)
     可以设置默认值，比如分页

    4)@RequestBody 请求体映射实体类
     需要指定http头为 content-type为application/json charset=utf-8

    5）@RequestHeader 请求头，比如鉴权
     @RequestHeader("access_token") String accessToken

    6）HttpServletRequest request自动注入获取参数

## SpringBoot基础HTTP接口POST,PUT,DELETE请求实战

 简介：讲解http请求post，put, delete提交方式

## 常用json框架介绍和Jackson返回结果处理

 简介：介绍常用json框架和注解的使用，自定义返回json结构和格式

 1、常用框架 阿里 fastjson,谷歌gson等
  JavaBean序列化为Json，性能：Jackson > FastJson > Gson > Json-lib 同个结构
  Jackson、FastJson、Gson类库各有优点，各有自己的专长
  空间换时间，时间换空间

 2、jackson处理相关自动
  指定字段不返回：@JsonIgnore
  指定日期格式：@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",locale="zh",timezone="GMT+8")
  空字段不返回：@JsonInclude(Include.NON_NUll)
  指定别名：@JsonProperty

## SpringBoot2.x目录文件结构讲解

  简介：讲解SpringBoot目录文件结构和官方推荐的目录规范

  1、目录讲解
   src/main/java：存放代码
   src/main/resources
    static: 存放静态文件，比如 css、js、image, （访问方式 <http://localhost:8080/js/main.js）>
    templates:存放静态页面jsp,html,tpl
    config:存放配置文件,application.properties
    resources:

  3、同个文件的加载顺序,静态资源文件
  Spring Boot 默认会挨个从
  META/resources > resources > static > public  里面找是否存在相应的资源，如果有则直接返回。

  4、默认配置
   1）官网地址：<https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-developing-web-applications.html#boot-features-spring-mvc-static-content>

   2）spring.resources.static-locations = classpath:/META-INF/resources/,classpath:/resources/,classpath:/static/,classpath:/public/

  5、静态资源文件存储在CDN（通常不放在本地）
