# 实训项目

## 概览

__饿了么App简单实现__

技术栈：
- 后端：
    - Spring boot
    - MyBaits
- 前端：
    - vue.js
    - element-ui

基本项目结构：

```
├── README.md
├── .gitignore 
├── frontend -- 前端项目文件夹
    ├── public -- 存放主页，通常不会修改
        ├── index.html
    ├── src -- 主要的页面逻辑代码
        ├── components -- 组件文件夹
        ├── views -- 视图文件夹
        ├── router -- 单页路由文件夹
        ├── App.vue -- 主要vue组件
        ├── main.js -- 注册vue实例
    ├── .gitignore -- 忽略提交的文件
    ├── package.json -- 包依赖文件
    ├── .browserslistrc -- 告知babel对具有ES6以上特性的浏览器，不需要进行兼容化
    ├── .eslintrt.js -- 配置格式化文件
    ├── .babel.config.js -- 配置babel的设定
    ├── README.md 
├── backend -- 后端项目文件夹
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    ├── spring-boot.iml
    ├── .gitignore
    ├── src
    │   ├── main
    │   │   ├── java
    │   │   │   └── com
    │   │   │   │    └── handsome
    │   │   │   │          └── elm
    │   │   │   │           ├── ElmApplication.java  -- Spring Boot启动器类
    │   │   │   │           ├── controller  -- MVC-WEB层
    │   │   │   │           ├── entity  -- 实体类
    │   │   │   │           ├── mapper  -- mybatis-Mapper层映射接口，或称为DAO层
    │   │   │   │           └── service  -- service业务层
    │   │   └── resources  -- Spring Boot资源文件目录
    │   │       ├── application.properties  -- Spring Boot核心配置文件
    │   │       ├── mapper  -- Mybatis Mapper层XML配置文件
    │   │       ├── static  -- 前端静态文件（主要是JS、CSS、Image文件，一般不放HTML页面）
    │   │       └── templates --（使用vue，不使用这里的模板文件）
    │   └── test -- 测试单元文件夹
```

## 开发配置

- 克隆仓库
```
git clone https://github.com/Internship-Rest/PracticeProject.git
```

### 前端配置

- 安装包依赖
```
npm i
```
- 启动开发端口
```
npm run serve
```
- 构建 生成最终打包压缩的项目文件，包含静态资源
```
npm run build
```


### 后端配置

- 后端配置数据库连接（没有公共服务器） 在后端项目的`application.properties`中配置本地主机的数据库连接地址以及用户名和密码
```
application.properties:
    # 配置后端连接端口
    server.port=8080 
    # 配置数据源
    spring.datasource.url=jdbc:mysql:///<表名>?characterEncoding=utf8&useUnicode=true&useSSL=false&serverTimezone=UTC
    # 配置数据源的驱动名称（这里统一使用mysql，不需要改动）
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    # 配置本地主机数据库的用户名称
    spring.datasource.username=<username>
    # 配置本地主机数据库的用户密码
    spring.datasource.password=<password>
    # 配置mybaits的映射文件位置（默认，不用修改）
    mybatis.mapper-locations=classpath:mapper/*.xml
    # 配置映射层的包位置
    mybatis.type-aliases-package=<暂定>
```

__注意：需要启动数据库连接__

### 开发过程注意

- 提交 可通过vscode的git扩展提交（推荐）或通过git bash提交
- 提交规则 
    1. 提交信息要写清楚添加的功能模块是什么，并且概括性并确切地进行描述，在50个字符以内 如:
    
        ``` 添加功能 完成前端用户添加订单的功能 ```

    2. 在每个主题描述完成之后添加一个空白行，接下来可以添加一些需要的细节描述
