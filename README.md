# 项目结构描述
- java包下放置java源代码
    一个最简单的java spring web项目代码结构如下：
    1. config
        静态配置
    2. constant
        所有项目使用的常量
    3. controller
        springMVC，页面路由控制
    4. converter
        domain和dto转换以及其他类和类之间转换的工具
    5. domain
        数据库domain对象
    6. dto
        data transfer object
    7. service
        业务模块代码
    8. util
        工具包
- resources包下放置配置文件
    resources的结构如下：
    1. config
        数据库连接、缓存连接、调度器连接等的bean配置
    2. properties
        静态文件配置（kv形式）
    3. sql
        项目需要的sql语句，包括初始语句以及patch语句，并说明每次更新内容
    4. log4j.xml
        log如何输出
- webapp下包含配置文件和前端相关的文件
    1. WEB-INF
        web的相关配置项
        js、html、css文件以及库存放位置
- test
    单元测试代码