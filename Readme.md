### 项目结构

```
├─doc  存放需求，技术文档等
├─src  源码目录
│  ├─main
│  │  ├─java
│  │  │  └─com
│  │  │      └─aihu
│  │  │          ├─common  项目常量
│  │  │          ├─controller  路由和转发
│  │  │          ├─dao  数据访问接口
│  │  │          ├─exception  自定义异常
│  │  │          ├─model  数据库对象
│  │  │          ├─service  业务逻辑处理
│  │  │          │  └─impl
│  │  │          └─util  封装公共方法，与业务无关
│  │  └─resources  配置文件
│  └─test  与上面java对应，各模块测试
│      └─java
│          └─com
│              └─aihu
│                  ├─controller
│                  ├─service
│                  └─util
└─tools  可执行工具
```

### 运行

    cd <项目根目录>
    mvn package
    cd target
    java -jar aihu-management-x.x.x-SNAPSHOT.jar

项目启动后，可以调用接口查看返回内容，例如

    curl http://localhost:25314/aihu/user_info/openid/10001

### ErrorCode

##### 系统错误码

项目中与业务无关的错误类型，例如请求时参数错误，服务器内部异常等，

    1 缺少参数
    2 参数格式错误
    3 数据库链接失败

##### 业务错误码

业务相关错误，例如登录校验失败，查询不到数据等，根据业务模块不同使用错误码前缀来区分，

    1000xxx，登录类错误
    2000xxx，用户个人信息错误
    3000xxx，位置服务错误

### 接口定义

#### 接口名

Restful风格的接口，
1. 用http协议的方法代表请求作用，如GET表获取信息，PUT表更新
2. 接口路径指明本次请求的操作资源，路径后带上的请求参数用来做资源的进一步过滤行为

#### 接口请求

json格式，自定义数据

#### 接口返回

json格式，包含返回码，自定义数据，错误信息

#### 举例

获取小程序登录态

    GET aihu/login?code=xxxx
    
    {}
    
    {
    	"ret":0,
    	"data":{
    		"session_key":"xxxxx",
    	   	"openid":"xxxxx",
    	    "is_new":0,
    	},
    	"msg":"",
    }

用户上报

    POST aihu/report/openid/xxxx?session_key=xxxx
    {
    	"action":{
    		"name":"xxxx",
    		"action_time":"xxxx"
    	}
    }
    
    {
    	"ret":0,
    	"data":{},
    	"msg":""
    }

更新设备信息

    PUT aihu/device/xxxx
    {
    	"operator":{
    		"id":1,
    	},
    	"device":{
    		"number":"",
    		"mac":"AB:CD:AB:CD:12:12",
    		"capacity":100,
    		"ipv4":"",
    		"weight":""
    	}
    }
    
    {
    	"ret":0,
    	"data":{},
    	"msg":""
    }